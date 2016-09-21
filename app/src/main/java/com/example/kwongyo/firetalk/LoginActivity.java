package com.example.kwongyo.firetalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.kwongyo.firetalk.activitySupport.FontFactory;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @OnClick(R.id.login_btn)
    public void loginBtn(View v) {
        startActivity(new Intent().setClass(getApplicationContext(),MainActivity.class));
    }
    @Bind(R.id.register_linear)
    LinearLayout registerLinear;
    @Bind(R.id.register_btn)
    Button registerBtn;
    @OnClick(R.id.register_btn)
    public void registerBtnClick(View v){
        registerBtn.setVisibility(View.GONE);
        registerLinear.setVisibility(View.VISIBLE);
    }
    @Bind(R.id.login_logo)
    ImageView loginLogo;

    @Bind(R.id.login_description)
    TextView loginDescription;

    @Bind(R.id.id_description)
    TextView idDescription;

    @Bind(R.id.password_description)
    TextView passwordDescription;

    @Bind(R.id.login_btn)
    Button loginBtn;

    @Bind(R.id.forget_password)
    TextView forgetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginDescription.setTypeface(FontFactory.getFont(getApplicationContext() , FontFactory.Font.NOTOSANS_BOLD )); // 이거 아님 이거 임시임.
        idDescription.setTypeface(FontFactory.getFont(getApplicationContext() , FontFactory.Font.NOTOSANS_BOLD ));
        passwordDescription.setTypeface(FontFactory.getFont(getApplicationContext() , FontFactory.Font.NOTOSANS_BOLD ));
        loginBtn.setTypeface(FontFactory.getFont(getApplicationContext(),FontFactory.Font.NOTOSANS_BOLD ));
        registerBtn.setTypeface(FontFactory.getFont(getApplicationContext(),FontFactory.Font.NOTOSANS_BOLD ));
        forgetPassword.setTypeface(FontFactory.getFont(getApplicationContext(),FontFactory.Font.NOTOSANS_REGULAR ));



    }
    @OnClick(R.id.login_logo)
    public void loginLogoClick(View v){
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_start_first, R.anim.activity_start_second);// 화면 이동 시 애니메이션.
    }

    @OnClick(R.id.register_email_btn)
    public void registerEmailBtnClick(View v) {
        startActivity(new Intent(getApplicationContext() , EmailAuthActivity.class ));
    }
    @OnClick(R.id.forget_password)
    public void forgetPasswordClick(View v) {
        startActivity(new Intent(getApplicationContext() , FindPWActivity.class ));
    }

}
