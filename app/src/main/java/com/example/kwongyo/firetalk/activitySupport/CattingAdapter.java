package com.example.kwongyo.firetalk.activitySupport;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kwongyo.firetalk.R;

import java.util.ArrayList;

import butterknife.Bind;

/**
 * Created by kwongyo on 2016-08-29.
 */
public class CattingAdapter extends RecyclerView.Adapter<CattingAdapter.ViewHolder> {
    private ArrayList<ChattingData> datas;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.another_profile_image)
        public ImageView anotherProfileImage;
        @Bind(R.id.another_name)
        public TextView anotherName;
        @Bind(R.id.another_text_message)
        public TextView anotherTextMessage;
        public ViewHolder(View v) {
            super(v);
        }
    }
    //provide a suitable cons ( depends on the kind of dataset)
    public CattingAdapter(ArrayList<ChattingData> datas) {
        this.datas=datas;
    }
    /* create new views ( invoked by the layout manager) */
    @Override
    public CattingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent , int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.catting_another,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int poisiton) {

    }
    @Override
    public int getItemCount(){
        return datas.size();
    }
    public class ChattingData {
        public ImageView anotherProfileImage;
        public String anotherName;
        public String anotherTextMessage;
        public ChattingData(ImageView imageView , String anotherName , String anotherTextMessage) {
            this.anotherProfileImage = anotherProfileImage;
            this.anotherTextMessage = anotherTextMessage;
            this.anotherName=anotherName;
        }
    }

}
