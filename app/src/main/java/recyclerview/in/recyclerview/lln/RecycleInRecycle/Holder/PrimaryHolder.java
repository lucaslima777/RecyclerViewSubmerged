package recyclerview.in.recyclerview.lln.RecycleInRecycle.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import recyclerview.in.recyclerview.lln.R;

public class PrimaryHolder extends RecyclerView.ViewHolder {

    public TextView primaryTextView;
    public RecyclerView primaryRecyclerView;

    public PrimaryHolder(@NonNull View itemView) {
        super(itemView);
        primaryTextView = (TextView) itemView.findViewById(R.id.tvListPrimary);
        primaryRecyclerView = (RecyclerView) itemView.findViewById(R.id.sub_rv);
    }
}
