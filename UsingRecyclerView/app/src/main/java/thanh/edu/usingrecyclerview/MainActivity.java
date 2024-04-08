package thanh.edu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewDatas;
    RecyclerView recyclerViewLandScape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recycleViewDatas = getDataForReCyClerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        /* RecyclerView.LayoutManager layoutLinear  = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        RecyclerView.LayoutManager layoutLinearHorizonal  = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewLandScape.setLayoutManager(layoutLinearHorizonal); */
        RecyclerView.LayoutManager layoutLinearGrid  = new GridLayoutManager(this,2);
        recyclerViewLandScape.setLayoutManager(layoutLinearGrid);

        landScapeAdapter = new LandScapeAdapter(this, recycleViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    ArrayList<LandScape> getDataForReCyClerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("nobita", "NÔ BI TA");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("doramon", "ĐÔ RÊ MON"));
        dsDuLieu.add(new LandScape("tom", "MÈO TOM"));
        dsDuLieu.add(new LandScape("jerry", "CHUỘT JERRY"));
        return dsDuLieu;
    }
}