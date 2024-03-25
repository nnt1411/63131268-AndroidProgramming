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

public class ThongTinAdapter extends BaseAdapter {
    private ArrayList<ThongTin> lsThongTin;
    private LayoutInflater layoutInflater;
    private Context context;

    public ThongTinAdapter(Context _context, ArrayList<ThongTin> lsThongTin)
    {
        this.lsThongTin = lsThongTin;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {

        return lsThongTin.size();
    }

    @Override
    public Object getItem(int position) {

        return lsThongTin.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        View viewHienHanh = view;
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.list_thongtin,null);

        ThongTin DSThongTin = lsThongTin.get(position);

        TextView textView_ThongTin = (TextView) viewHienHanh.findViewById(R.id.listTT);
        TextView textView_CT = (TextView) viewHienHanh.findViewById(R.id.listCT);

        textView_ThongTin.setText(DSThongTin.getTTin());
        textView_CT.setText(DSThongTin.getCTiet());

        return viewHienHanh;
    }
}
