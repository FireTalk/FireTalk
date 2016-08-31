package com.example.kwongyo.firetalk.activitySupport;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
public class ChattingAdapter extends CustomAdapter <ChattingData , ChattingAdapter.ChattingViewHolder> {
    public static String finalSpeakingUser = "";

    //provide a suitable cons ( depends on the kind of dataset)
    public ChattingAdapter(Context context, List<ChattingData> lists) {
        super( context , lists );
    }
    /* create new views ( invoked by the layout manager)
    * 여기를 잘 꾸며야지 내가 원하는 결과물이 나온다.
    * */
    @Override
    public ChattingAdapter.ChattingViewHolder onCreateViewHolder(ViewGroup parent , int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.catting_another,parent,false);
        ChattingViewHolder viewHolder = new ChattingViewHolder(v);
        return viewHolder;
    }

    /*
    사용자가 스크롤할 때 호출되는 메소드..?
     */
    @Override
    public void onBindViewHolder(ChattingViewHolder holder,int position) {
        String speakingUser = list.get(position).anotherName;
        if(speakingUser.equals(finalSpeakingUser)) { // 같은 사람이 말 할때 카톡처럼 나오게 하려고..
            holder.anotherName.setVisibility(View.GONE);
            holder.anotherTextMessage.setVisibility(View.GONE);
            holder.anotherName.setVisibility(View.GONE);
            holder.anotherTextMessageContinue.setVisibility(View.VISIBLE);

            holder.anotherTextMessageContinue.setText(list.get(position).anotherTextMessage);
        }
        else { // 같은 사람이 말 하는 경우가 아닌경우임.
            holder.anotherName.setVisibility(View.VISIBLE);
            holder.anotherTextMessage.setVisibility(View.VISIBLE);
            holder.anotherName.setVisibility(View.VISIBLE);
            holder.anotherTextMessageContinue.setVisibility(View.GONE);

            holder.anotherName.setText(list.get(position).anotherName);
            // profile image add activity empty
            Glide.with(context).load(list.get(position).anotherProfileImage).into(holder.anotherProfileImage);
            holder.anotherTextMessage.setText(list.get(position).anotherTextMessage);
        }
        Log.e("ChattingAdapter", "here");
    }
    @Override
    public int getItemCount(){
        return list.size();
    }

    public static class ChattingViewHolder extends RecyclerView.ViewHolder {
        public View view ;
        public ImageView anotherProfileImage;
        public TextView anotherName;
        public TextView anotherTextMessage;
        public TextView anotherTextMessageContinue;
        public ChattingViewHolder(View v) {
            super(v);
            anotherProfileImage = (ImageView) v.findViewById(R.id.another_profile_image);
            anotherName = (TextView) v.findViewById(R.id.another_name);
            anotherTextMessage = (TextView) v.findViewById(R.id.another_text_message);
            anotherTextMessageContinue = (TextView) v.findViewById(R.id.another_text_message_continue);
        }
    }
}
