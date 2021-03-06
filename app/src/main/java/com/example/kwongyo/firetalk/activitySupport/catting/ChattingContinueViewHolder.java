package com.example.kwongyo.firetalk.activitySupport.catting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kwongyo.firetalk.R;
import com.example.kwongyo.firetalk.activitySupport.CustomViewHolder;

/**
 * Created by kwongyo on 2016-09-01.
 */
public class ChattingContinueViewHolder extends CustomViewHolder<String> {
    public TextView another_text_message_continue;
    public ChattingContinueViewHolder(View v) {
        super(v);
        another_text_message_continue = (TextView) v.findViewById(R.id.another_text_message_continue);
    }
    public void onBindView(String anotherTextMessageContinue) {
        another_text_message_continue.setText(anotherTextMessageContinue);
    }
}
