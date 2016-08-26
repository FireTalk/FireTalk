package com.example.kwongyo.firetalk;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
/*
    @Bind(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @Bind(R.id.drawerLayout_body)
    View drawerLayoutBody;

    @OnClick(R.id.hambug_btn)
    public void hamBugClick(View v){
        drawerLayout.openDrawer(drawerLayoutBody);
    }
    DrawerLayout.DrawerListener myDrawerListener = new DrawerLayout.DrawerListener(){
        public void onDrawerClosed(View drawerView) {

        }
        public void onDrawerOpened(View drawerView) {

        }
        public void onDrawerSlide(View drawerView, float slideOffset) {

        }
        /**
         * state가 2일 때 Drawer가 Open되는것.
         * @param newState
         */
/*public void onDrawerStateChanged(int newState) {
    switch (newState) {
        case 2 :

            break;
    }
}
};
* */