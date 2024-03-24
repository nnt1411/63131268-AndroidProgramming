package ntu.mssv63131268;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView lvDSDanhBa = (ListView) findViewById(R.id.lvDanhBa);
        ArrayList<DanhBa> dsDanhBa = new ArrayList<DanhBa>();
        dsDanhBa.add(new DanhBa("Thành","0123456789",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Hành","0987654321",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Bành","017852369",R.drawable.avatar));
        dsDanhBa.add(new DanhBa("Sành","0369852147",R.drawable.avatar));

        DanhBaAdapter adapter = new DanhBaAdapter(this,dsDanhBa);
        lvDSDanhBa.setAdapter(adapter);

        lvDSDanhBa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DanhBa danhBaChon = dsDanhBa.get(position);
                Toast.makeText(MainActivity.this,danhBaChon.getTen(),Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}