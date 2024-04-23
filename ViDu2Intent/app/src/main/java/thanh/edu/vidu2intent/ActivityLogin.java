package thanh.edu.vidu2intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button button2 = findViewById(R.id.btnok);
        button2.setOnClickListener(ChuyensangMHHome);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    View.OnClickListener ChuyensangMHHome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent kichHoatMHHome;
            kichHoatMHHome = new Intent(ActivityLogin.this, ActivityHome.class);

            //lấy dữ liệu
            EditText edtUserName = findViewById(R.id.edtUserName);
            EditText edtPass = findViewById(R.id.edtPass);
            String strUserName = edtUserName.getText().toString();
            String strPass = edtPass.getText().toString();

            kichHoatMHHome.putExtra("Tete",strUserName);
            kichHoatMHHome.putExtra("Toto",strPass);
            startActivity(kichHoatMHHome);
        }
    };
}