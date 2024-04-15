package thanh.edu.viewpager2recylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lsData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape landScapeHienThi = lsData.get(position);
        String caption = landScapeHienThi.getLandCation();
        String tenFileAnh = landScapeHienThi.getLandImageFileName();
        holder.tvCaption.setText(caption);
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap",packageName);
        holder.ivLandSCape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLandSCape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandSCape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int viTriDuocClick = getAdapterPosition();
            LandScape phanTuDuocClick = lsData.get(viTriDuocClick);
            String ten = phanTuDuocClick.getLandCation();
            String tenFile = phanTuDuocClick.getLandImageFileName();
            String chuoiThongBao = "Ban vua click vao : "+ten;
            Toast.makeText(v.getContext(),chuoiThongBao,Toast.LENGTH_SHORT).show();
        }
    }

}
