package com.example.kwongyo.firetalk.activitySupport.catting;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kwongyo.firetalk.ChattingActivity;
import com.example.kwongyo.firetalk.R;
import com.example.kwongyo.firetalk.activitySupport.ChattingData;
import com.example.kwongyo.firetalk.activitySupport.CustomViewHolder;

/**
 * Created by kwongyo on 2016-09-01.
 */
public class ChattingViewHolder extends CustomViewHolder<ChattingData> {
    public ImageView anotherProfileImage;
    public TextView anotherName;
    public TextView anotherTextMessage;
    public ChattingViewHolder(View v) {
        super(v);
        anotherProfileImage = (ImageView) v.findViewById(R.id.another_profile_image);
        anotherName = (TextView) v.findViewById(R.id.another_name);
        anotherTextMessage = (TextView) v.findViewById(R.id.another_text_message);
    }
    public void onBindView(ChattingData data) {
        this.anotherName.setText(data.anotherName);
        this.anotherTextMessage.setText(data.anotherTextMessage);
    }
    public void onBindView(ChattingData data,Context context) {
        onBindView(data);
        Glide.with(context).load(data.anotherProfileImage).into(this.anotherProfileImage);
    }
}
