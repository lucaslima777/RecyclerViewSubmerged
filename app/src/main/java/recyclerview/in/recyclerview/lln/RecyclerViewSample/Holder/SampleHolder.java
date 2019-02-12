package recyclerview.in.recyclerview.lln.RecyclerViewSample.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import recyclerview.in.recyclerview.lln.R;

public class SampleHolder extends RecyclerView.ViewHolder {

    public TextView itemTextView;
    public ImageView delete;

    public SampleHolder(@NonNull View itemView) {
        super(itemView);
        itemTextView = (TextView) itemView.findViewById(R.id.tvItem);
        delete = (ImageView) itemView.findViewById(R.id.imageDelete);
    }
}
