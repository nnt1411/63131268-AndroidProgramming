package ntu.mssv63131268;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DanhBaAdapter extends BaseAdapter {
    private ArrayList<DanhBa> lsDanhBa;
    private LayoutInflater layoutInflater;
    private Context context;

    public DanhBaAdapter(Context _context, ArrayList<DanhBa> lsDanhBa)
    {
        this.lsDanhBa = lsDanhBa;
        this.context = context;
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

        return viewHienHanh;
    }
}

