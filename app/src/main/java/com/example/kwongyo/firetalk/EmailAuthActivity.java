package com.example.kwongyo.firetalk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by user on 2016-09-11.
 */
public class EmailAuthActivity extends AppCompatActivity {

/*
    @Bind(R.id.confirm_email)EditText Edit_Confirm_email;
    @Bind(R.id.confirm_nick)EditText Edit_Confirm_nick;
    @Bind(R.id.confirm_PW)EditText Edit_Confirm_PW;
    @Bind(R.id.confirm_PW_more)EditText Edit_Confirm_PW1;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_auth_email);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.email_back_btn)
    public void emailBackBtn(View v) {
        finish();
    }



}
