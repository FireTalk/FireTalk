package com.example.kwongyo.firetalk.activitySupport;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kwongyo.firetalk.R;
import com.example.kwongyo.firetalk.activitySupport.catting.ChattingContinueViewHolder;
import com.example.kwongyo.firetalk.activitySupport.catting.ChattingViewHolder;

import java.util.List;

/**
 * Created by kwongyo on 2016-08-29.
 */
public class ChattingAdapter extends CustomAdapter <ChattingData , CustomViewHolder> {


    //provide a suitable cons ( depends on the kind of dataset)
    public ChattingAdapter(Context context, List<ChattingData> lists) {
        super( context , lists );
    }
    /* create new views ( invoked by the layout manager)
    * 여기를 잘 꾸며야지 내가 원하는 결과물이 나온다.
    * */
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent , int viewType) {
        if( list.get(viewType).isSamePerson ) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatting_another_continue, parent , false);
            ChattingContinueViewHolder viewHolder = new ChattingContinueViewHolder(v);
            return viewHolder;
        }
        else {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatting_another, parent, false);
            ChattingViewHolder viewHolder = new ChattingViewHolder(v);
            return viewHolder;
        }

    }

    /*
    사용자가 스크롤할 때 호출되는 메소드..?
     */
    @Override
    public void onBindViewHolder(CustomViewHolder holder,int position) {
        if( list.get(position).isSamePerson ) {
            ChattingContinueViewHolder h = (ChattingContinueViewHolder)holder;
            h.onBindView(list.get(position).anotherTextMessage);
        } else {
            ChattingViewHolder h = ( ChattingViewHolder )holder;
            h.onBindView(list.get(position));
            Glide.with(context).load(list.get(position).anotherProfileImage).into(h.anotherProfileImage);
        }

    }
    @Override
    public int getItemCount(){
        return list.size();
    }
}
/*public static class ChattingViewHolder extends RecyclerView.ViewHolder {
        public ImageView anotherProfileImage;
        public TextView anotherName;
        public TextView anotherTextMessage;
        public ChattingViewHolder(View v) {
            super(v);
            anotherProfileImage = (ImageView) v.findViewById(R.id.another_profile_image);
            anotherName = (TextView) v.findViewById(R.id.another_name);
            anotherTextMessage = (TextView) v.findViewById(R.id.another_text_message);
        }
    }*/
    /*public static class ChattingContinueViewHolder extends  RecyclerView.ViewHolder {
        public TextView anotherTextMessageContinue;
        public ChattingContinueViewHolder (View v) {
            super(v);
            anotherTextMessageContinue = (TextView)v.findViewById(R.id.another_text_message_continue);
        }
    }*/