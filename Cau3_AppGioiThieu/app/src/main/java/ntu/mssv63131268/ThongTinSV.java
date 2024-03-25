package ntu.mssv63131268;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ThongTinSV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thong_tin_sv);

        ListView lvThongTin = (ListView) findViewById(R.id.lvThongTin);
        ArrayList<ThongTin> dsThongTin = new ArrayList<ThongTin>();
        dsThongTin.add(new ThongTin("Tên:","Nguyễn Ngọc Thành"));
        dsThongTin.add(new ThongTin("MSSV:","63131268"));
        dsThongTin.add(new ThongTin("Email::","thanh.nn.63cntt@ntu.edu.vn"));
        dsThongTin.add(new ThongTin("Ngày sinh:","14/11/2003"));
        dsThongTin.add(new ThongTin("Quê Quán:","Khánh Hòa"));

        ThongTinAdapter adapter = new ThongTinAdapter(this,dsThongTin);
        lvThongTin.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}