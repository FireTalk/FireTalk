package com.example.kwongyo.firetalk.activitySupport;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kwongyo on 2016-09-01.
 */
public abstract class CustomViewHolder<ITEM> extends RecyclerView.ViewHolder{
    public CustomViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void onBindView(ITEM item);

}
