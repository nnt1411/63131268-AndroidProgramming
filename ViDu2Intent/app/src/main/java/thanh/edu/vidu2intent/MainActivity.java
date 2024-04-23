package thanh.edu.vidu2intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnLogin);
        button.setOnClickListener(ChuyensangMHLogin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    View.OnClickListener ChuyensangMHLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent kichHoatMHLogin;
            kichHoatMHLogin = new Intent(MainActivity.this, ActivityLogin.class);
            startActivity(kichHoatMHLogin);
        }
    };
}