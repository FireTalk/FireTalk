package com.example.kwongyo.firetalk.activitySupport.catting;

import android.view.View;
import android.widget.TextView;

import com.example.kwongyo.firetalk.R;
import com.example.kwongyo.firetalk.activitySupport.CustomViewHolder;

/**
 * Created by kwongyo on 2016-09-02.
 */
public class ChattingMeViewHolder extends CustomViewHolder<String> {
    TextView chattingMe;
    public ChattingMeViewHolder(View itemView) {
        super(itemView);
        chattingMe = (TextView) itemView.findViewById(R.id.chatting_me);
    }
    @Override
    public void onBindView(String item) {
        this.chattingMe.setText(item);
    }
}
