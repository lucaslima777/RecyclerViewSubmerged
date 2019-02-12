package recyclerview.in.recyclerview.lln.RecycleInRecycle.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import recyclerview.in.recyclerview.lln.R;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.Holder.PrimaryHolder;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.Model.PrimaryModel;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.SubRecycleView.SubAdapter;
import recyclerview.in.recyclerview.lln.RecycleInRecycle.SubRecycleView.SubModel;

public class PrimaryAdapter extends RecyclerView.Adapter<PrimaryHolder> {

    private Context mContext;
    private List<PrimaryModel> modelList;

    private SubAdapter subAdapter;
    private List<SubModel> subModelList;
    private LinearLayoutManager layoutManager;

    public PrimaryAdapter(Context mContext, List<PrimaryModel> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
        subModelList = new ArrayList<>();
    }

    @NonNull
    @Override
    public PrimaryHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PrimaryHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_rv_in_rv, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PrimaryHolder primaryHolder, int i) {
        primaryHolder.primaryTextView.setText(modelList.get(i).getTxtItem());

        primaryHolder.primaryRecyclerView.findViewById(R.id.sub_rv);
        layoutManager = new LinearLayoutManager(mContext);
        primaryHolder.primaryRecyclerView.setLayoutManager(layoutManager);


        subModelList.add(new SubModel("Sub List 1"));
        subModelList.add(new SubModel("Sub List 2"));

        subAdapter = new SubAdapter(mContext, subModelList);
        primaryHolder.primaryRecyclerView.setAdapter(subAdapter);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
