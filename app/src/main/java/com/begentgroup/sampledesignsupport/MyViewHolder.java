package com.begentgroup.sampledesignsupport;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-04-26.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    public MyViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView;
    }

    public void setTitle(String title) {
        titleView.setText(title);
    }
}
