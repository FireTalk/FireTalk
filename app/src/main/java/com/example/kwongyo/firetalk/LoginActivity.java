package com.example.kwongyo.firetalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @OnClick(R.id.login_btn)
    public void loginBtn(View v) {
        startActivity(new Intent().setClass(getApplicationContext(),MainActivity.class));
    }
    @OnClick(R.id.register_btn)
    public void registerBtnClick(View v){
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}
