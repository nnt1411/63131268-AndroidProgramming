package thanh.edu.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class ExamAdapter extends RecyclerView.Adapter<ExamViewHolder> {
    private List<ExamData> list;
    private LayoutInflater inflater;
    private View.OnClickListener onClickListener;

    public ExamAdapter(Context context, List<ExamData> list, View.OnClickListener listener) {
        this.inflater = LayoutInflater.from(context);
        this.list = list;
        this.onClickListener = listener;
    }

    @NonNull
    @Override
    public ExamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.exam_card, parent, false);
        itemView.setOnClickListener(onClickListener);
        return new ExamViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ExamViewHolder holder, int position) {
        ExamData data = list.get(position);
        holder.examName.setText(data.getName());
        holder.examDate.setText(data.getDate());
        holder.examMessage.setText(data.getMessage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
