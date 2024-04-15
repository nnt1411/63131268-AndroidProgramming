package thanh.edu.recyclerviewexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ExamAdapter adapter;
    private List<ExamData> examList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        examList = getExamData();
        adapter = new ExamAdapter(this, examList, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int itemPosition = recyclerView.getChildLayoutPosition(v);
                ExamData item = examList.get(itemPosition);
                Toast.makeText(MainActivity.this, "Clicked " + item.getName(), Toast.LENGTH_LONG).show();
            }
        });

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Dummy data for RecyclerView
    private List<ExamData> getExamData() {
        List<ExamData> data = new ArrayList<>();
        data.add(new ExamData("First Exam", "May 23, 2015", "Best Of Luck"));
        data.add(new ExamData("Second Exam", "June 09, 2015", "b of l"));
        data.add(new ExamData("My Test Exam", "April 27, 2017", "This is a testing exam."));
        return data;

    }
}