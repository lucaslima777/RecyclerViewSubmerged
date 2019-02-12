package recyclerview.in.recyclerview.lln.RecycleInRecycle.SubRecycleView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import recyclerview.in.recyclerview.lln.R;

public class SubAdapter extends RecyclerView.Adapter<SubHolder> {

    private Context mContext;
    private List<SubModel> subModelList;

    public SubAdapter(Context mContext, List<SubModel> subModelList) {
        this.mContext = mContext;
        this.subModelList = subModelList;
    }

    @NonNull
    @Override
    public SubHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SubHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_sub_recycle_view, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubHolder subHolder, int i) {
        subHolder.subTextView.setText(subModelList.get(i).getTxtSubItem());
    }

    @Override
    public int getItemCount() {
        return subModelList.size();
    }
}
