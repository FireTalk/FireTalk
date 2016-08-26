package com.example.kwongyo.firetalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }
    /*
    액티비티 없어질 때
    * */
    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_end_first, R.anim.activity_end_second);// 화면 이동 시 애니메이션.
    }
}
