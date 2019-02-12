package recyclerview.in.recyclerview.lln.RecyclerViewSample.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import recyclerview.in.recyclerview.lln.R;
import recyclerview.in.recyclerview.lln.RecyclerViewSample.Holder.SampleHolder;
import recyclerview.in.recyclerview.lln.RecyclerViewSample.Model.SampleModel;

public class SampleAdapter extends RecyclerView.Adapter<SampleHolder> {

    private Context mContext;
    private List<SampleModel> modelList;

    public SampleAdapter(Context mContext, List<SampleModel> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public SampleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SampleHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_sample_rv, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull SampleHolder sampleHolder, final int i) {
        sampleHolder.itemTextView.setText(modelList.get(i).getTxtItem());
        sampleHolder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removerItem(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public void insertItem(SampleModel user) {
        modelList.add(user);
        notifyItemInserted(getItemCount());
    }

    public void removerItem(int position) {
        modelList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, modelList.size());
    }

    public void updateList(SampleModel user) {
        insertItem(user);
    }
}
