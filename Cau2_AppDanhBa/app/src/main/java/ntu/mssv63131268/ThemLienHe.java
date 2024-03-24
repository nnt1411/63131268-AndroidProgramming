package ntu.mssv63131268;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class ThemLienHe extends AppCompatActivity {
    EditText edtTen, edtSoDienThoai;
    Button btnLuuLienHe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themlienhe);

        // Khởi tạo các component từ layout
        edtTen = findViewById(R.id.etTen);
        edtSoDienThoai = findViewById(R.id.etSoDienThoai);
        btnLuuLienHe = findViewById(R.id.btnLuu);

        // Đặt sự kiện click cho nút "Lưu Liên Hệ"
        btnLuuLienHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String ten = edtTen.getText().toString();
                String soDienThoai = edtSoDienThoai.getText().toString();

                // Kiểm tra tính hợp lệ của dữ liệu nhập vào
                if (ten.isEmpty() || soDienThoai.isEmpty()) {
                    Toast.makeText(ThemLienHe.this, "Tên hoặc số điện thoại không được để trống", Toast.LENGTH_SHORT).show();
                } else {
                    // Xử lý khi dữ liệu hợp lệ

                    // Gửi dữ liệu trở lại MainActivity thông qua Intent
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("ten", ten);
                    returnIntent.putExtra("soDienThoai", soDienThoai);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish(); // Kết thúc Activity và trở về MainActivity

                    Toast.makeText(ThemLienHe.this, "Liên hệ đã được thêm", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
