package thanh.nn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }
    public void XuLyCong(View v){

        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(strSo1);
        float So2 = Float.parseFloat(strSo2);

        float tong = So1 + So2;

        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String strKQ = String.valueOf(tong);
        editTextKQ.setText(strKQ);
    }
    public void XuLyTru(View v){

        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(strSo1);
        float So2 = Float.parseFloat(strSo2);

        float hieu = So1 - So2;

        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String strKQ = String.valueOf(hieu);
        editTextKQ.setText(strKQ);
    }
    public void XuLyNhan(View v){

        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(strSo1);
        float So2 = Float.parseFloat(strSo2);

        float tich = So1 * So2;

        EditText editTextKQ = (EditText)findViewById(R.id.edtKQ);
        String strKQ = String.valueOf(tich);
        editTextKQ.setText(strKQ);
    }
    public void XuLyChia(View v){
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);

        String strSo1 = editTextSo1.getText().toString();
        String strSo2 = editTextSo2.getText().toString();

        float So1 = Float.parseFloat(strSo1);
        float So2 = Float.parseFloat(strSo2);

        float thuong = So1 / So2;

        String strKQ = String.valueOf(thuong);
        editTextKQ.setText(strKQ);
    }
}