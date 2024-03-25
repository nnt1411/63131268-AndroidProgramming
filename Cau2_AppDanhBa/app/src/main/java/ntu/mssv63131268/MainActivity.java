package ntu.mssv63131268;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    private ActivityResultLauncher<Intent> themLienHeLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Thêm dữ liệu listview
        ListView lvDSDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        ArrayList<DanhBa> dsDanhBa = new ArrayList<DanhBa>();
        dsDanhBa.add(new DanhBa("Thanh","0123456789",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Canh","0987654321",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Banh","017852369",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Sanh","0369852147",R.drawable.avatar));

        DanhBaAdapter adapter = new DanhBaAdapter(this,dsDanhBa);
        lvDSDanhBa.setAdapter(adapter);

        themLienHeLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Intent data = result.getData();
                            if (data != null) {
                                String ten = data.getStringExtra("ten");
                                String soDienThoai = data.getStringExtra("soDienThoai");
                                // Thêm liên hệ mới vào danh sách và cập nhật adapter
                                DanhBa danhBaMoi = new DanhBa(ten, soDienThoai, R.drawable.avatar);
                                dsDanhBa.add(danhBaMoi);
                                capNhatListView();
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                    // Cập nhật ListView để không lỗi khi thêm mới liên hệ
                    private void capNhatListView() {
                        if (searchView.getQuery().toString().isEmpty()) {
                            // Nếu không có tìm kiếm, hiển thị danh sách gốc
                            lvDSDanhBa.setAdapter(new DanhBaAdapter(MainActivity.this, dsDanhBa));
                        } else {
                            // Nếu có tìm kiếm, áp dụng bộ lọc tìm kiếm
                            searchView.setQuery(searchView.getQuery(), true);
                        }
                    }
                }
        );
        lvDSDanhBa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DanhBa danhBaChon = dsDanhBa.get(position);
                Toast.makeText(MainActivity.this,danhBaChon.getTen(),Toast.LENGTH_SHORT).show();
            }
        });

        //Xử lý sự kiện click button add
        FloatingActionButton btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAdd = new Intent(MainActivity.this, ThemLienHe.class);
                themLienHeLauncher.launch(intentAdd);
            }
        });

        //Xử lý sự kiện tìm kiếm liên hệ
        ArrayList<DanhBa> dsDanhBaFiltered = new ArrayList<>();
        searchView = findViewById(R.id.search);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Kiểm tra newText không phải là null hoặc rỗng
                if (newText != null && !newText.isEmpty()) {
                    ArrayList<DanhBa> filteredList = new ArrayList<>();
                    for (DanhBa item : dsDanhBa) {
                        if (item.getTen().toLowerCase().contains(newText.toLowerCase()) ||
                                item.getSoDienThoai().contains(newText)) {
                            filteredList.add(item);
                        }
                    }
                    // Cập nhật ListView với danh sách đã lọc
                    DanhBaAdapter newAdapter = new DanhBaAdapter(MainActivity.this, filteredList);
                    lvDSDanhBa.setAdapter(newAdapter);
                } else {
                    // Nếu không có văn bản tìm kiếm, hiển thị toàn bộ danh sách
                    lvDSDanhBa.setAdapter(new DanhBaAdapter(MainActivity.this, dsDanhBa));
                }
                return true;
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}