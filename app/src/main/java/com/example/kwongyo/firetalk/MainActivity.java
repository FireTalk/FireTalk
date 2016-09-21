package com.example.kwongyo.firetalk;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.kwongyo.firetalk.activitySupport.main.MainAdapter;
import com.example.kwongyo.firetalk.activitySupport.main.MainData;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_activity_recycler)
    RecyclerView mainActivityRecyler;
    MainAdapter mainAdapter ;
    GridLayoutManager layoutManager;
    ArrayList<MainData> datas ;

    public static Context context;

    public static String tempDramaName="달의 연인 - 보보경심려,몬스터,W (더블유),함부로 애틋하게,질투의 화신,구르미 그린 달빛";
    public static String tempDramaTime="월·화 오후 2:00,월·화 오후 11:00,월·화 오후 11:00,수·목 오후 10:00,월·화 오후 2:00,월·화 오후 11:00";
    public static String []tempLink =  {
        "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/09/67/90/57_3096790_poster_image_1471409776507.jpg",
            "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/24/71/22/57_3247122_poster_image_1458532341750.jpg",
            "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/47/17/25/57_3471725_poster_image_1469008328304.jpg",
            "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/90/83/05/57_2908305_poster_image_1464857206814.jpg",
            "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/28/69/83/57_3286983_poster_image_1471574939131.jpg",
            "https://tv.pstatic.net/thm?size=120x172&quality=8&q=http://sstatic.naver.net/keypage/image/dss/57/37/30/26/57_3373026_poster_image_1471395715777.jpg"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = getApplicationContext();
        datas = new ArrayList<MainData>();
        layoutManager = new GridLayoutManager(this,2);
        mainActivityRecyler.setLayoutManager(layoutManager);
        mainAdapter = new MainAdapter ( getApplicationContext() , datas );
        mainActivityRecyler.setAdapter(mainAdapter);
        for(int i=0;i<6;i++) {
            MainData mainData = new MainData(tempLink[i],tempDramaName.split(",")[i],R.drawable.bookmark_false,R.drawable.sbs,tempDramaTime.split(",")[i]);
            mainAdapter.add(mainData);
        }
    }
    /*
    액티비티 없어질 때
    * */
    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_end_first, R.anim.activity_end_second);// 화면 이동 시 애니메이션.
    }

    @OnClick(R.id.is_login)
    public void moveTheLoginPage(View v) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }
}