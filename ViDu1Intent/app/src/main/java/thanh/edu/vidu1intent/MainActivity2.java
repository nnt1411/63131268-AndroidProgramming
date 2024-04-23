package thanh.edu.vidu1intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(BoLangNgheChuyenMH);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent kichHoatMH1;
            kichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(kichHoatMH1);
        }
    };
}