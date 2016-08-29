package com.example.kwongyo.firetalk.activitySupport;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kwongyo.firetalk.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kwongyo on 2016-08-29.
 */
public class ChattingAdapter extends CustomAdapter <ChattingData , ChattingAdapter.ViewHolder> {

    //provide a suitable cons ( depends on the kind of dataset)
    public ChattingAdapter(Context context, List<ChattingData> lists) {
        super( context , lists );
    }
    /* create new views ( invoked by the layout manager)
    * 여기를 잘 꾸며야지 내가 원하는 결과물이 나온다.
    * */
    @Override
    public ChattingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent , int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.catting_another,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    /*
    사용자가 스크롤할 때 호출되는 메소드..?
     */
    @Override
    public void onBindViewHolder(ViewHolder holder,int position) {
        holder.anotherTextMessage.setText(list.get(position).anotherTextMessage);
        holder.anotherName.setText(list.get(position).anotherName);
        // profile image add activity empty
        Glide.with(context).load(list.get(position).anotherProfileImage).into(holder.anotherProfileImage);


    }
    @Override
    public int getItemCount(){
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view ;
        @Bind(R.id.another_profile_image)
        public ImageView anotherProfileImage;
        @Bind(R.id.another_name)
        public TextView anotherName;
        @Bind(R.id.another_text_message)
        public TextView anotherTextMessage;
        public ViewHolder(View v) {
            super(v);
            view = itemView;
            anotherProfileImage = (ImageView) v.findViewById(R.id.another_profile_image);
            anotherName = (TextView) v.findViewById(R.id.another_name);
            anotherTextMessage = (TextView) v.findViewById(R.id.another_text_message);
        }
    }
}
