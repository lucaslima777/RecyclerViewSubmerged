package recyclerview.in.recyclerview.lln.RecycleInRecycle.SubRecycleView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import recyclerview.in.recyclerview.lln.R;

public class SubHolder extends RecyclerView.ViewHolder {

    public TextView subTextView;


    public SubHolder(@NonNull View itemView) {
        super(itemView);
        subTextView = (TextView) itemView.findViewById(R.id.tv_sub);
    }
}
