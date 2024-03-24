package ntu.mssv63131268;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DanhBaAdapter extends BaseAdapter {
    private ArrayList<DanhBa> lsDanhBa;
    private LayoutInflater layoutInflater;
    private Context context;

    public DanhBaAdapter(Context _context, ArrayList<DanhBa> lsDanhBa)
    {
        this.lsDanhBa = lsDanhBa;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {

        return lsDanhBa.size();
    }

    @Override
    public Object getItem(int position) {

        return lsDanhBa.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        View viewHienHanh = view;
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.list_danhba,null);

        DanhBa DSDanhBa = lsDanhBa.get(position);

        TextView textView_Ten = (TextView) viewHienHanh.findViewById(R.id.listName);
        TextView textView_SDT = (TextView) viewHienHanh.findViewById(R.id.listNum);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.listImage);

        textView_Ten.setText(DSDanhBa.getTen());
        textView_SDT.setText(DSDanhBa.getSoDienThoai());
        imageView_Anh.setImageResource(DSDanhBa.getIdAnh());

        ImageButton btnXoa = viewHienHanh.findViewById(R.id.btnXoa);
        btnXoa.setTag(position);
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (Integer) v.getTag(); // Lấy vị trí từ tag
                lsDanhBa.remove(position); // Xóa mục ở vị trí đó
                notifyDataSetChanged(); // Thông báo cập nhật
                Toast.makeText(context, "Liên hệ đã được xóa", Toast.LENGTH_SHORT).show();
            }
        });

        return viewHienHanh;
    }
}
