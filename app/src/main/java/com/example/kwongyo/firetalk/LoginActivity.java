package com.example.kwongyo.firetalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import butterknife.Bind;
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
    @Bind(R.id.login_logo)
    ImageView loginLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        Glide.with(this).load("http://img2.sbs.co.kr/img/sbs_cms/WE/2016/06/14/WE92163312_ori.jpg").diskCacheStrategy(DiskCacheStrategy.RESULT).into(loginLogo);

    }
    @OnClick(R.id.login_logo)
    public void loginLogoClick(View v){
        Toast.makeText(getApplicationContext(),"login_logo Click",Toast.LENGTH_SHORT).show();
        Glide.with(this).load("http://img2.sbs.co.kr/img/sbs_cms/WE/2016/06/14/WE92163312_ori.jpg").diskCacheStrategy(DiskCacheStrategy.RESULT).into(loginLogo);
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_start_first, R.anim.activity_start_second);// 화면 이동 시 애니메이션.
    }
}
