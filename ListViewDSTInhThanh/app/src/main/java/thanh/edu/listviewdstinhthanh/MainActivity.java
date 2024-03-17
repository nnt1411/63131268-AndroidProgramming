package thanh.edu.listviewdstinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN; //khai bao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Hien thi du lieu len list view
        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("TP HCM");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Ninh Bình");

        //tao apdapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String >(this, android.R.layout.simple_list_item_1,
                                                              dsTenTinhThanhVN);

        //gan vao dieu khien hien thi list view
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    //xu ly su kien BoLangNghevaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //hien thi thong bao nhanh ve vi tri vua chon
            String strTenTinhChon = dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this, strTenTinhChon,Toast.LENGTH_LONG).show();
        }
    };
}