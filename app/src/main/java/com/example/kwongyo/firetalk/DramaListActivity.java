package com.example.kwongyo.firetalk;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import com.example.kwongyo.firetalk.activitySupport.FontFactory;
import com.example.kwongyo.firetalk.activitySupport.dramalist.DramaData;
import com.example.kwongyo.firetalk.activitySupport.dramalist.DramaListAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kwongyo on 2016-09-16.
 */
    public class DramaListActivity extends AppCompatActivity {

        @Bind(R.id.broadcast_link)
        TextView broadLink;

        @Bind(R.id.mdl_recycler)
        RecyclerView mdlRcycler;
        DramaListAdapter dramaListAdapter;
        RecyclerView.LayoutManager layoutManager;

        @Bind(R.id.drama_title)
        TextView dramaTitle;
        private static ArrayList<DramaData> datas = new ArrayList<DramaData>();

        public static Context context;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_drama_list);
            ButterKnife.bind(this);

            dramaTitle.setTypeface(FontFactory.getFont(getApplicationContext(), FontFactory.Font.NOTOSANS_BOLD));

            context = getApplicationContext();
            layoutManager = new LinearLayoutManager(this);
            mdlRcycler.setLayoutManager(layoutManager);
            dramaListAdapter = new DramaListAdapter(getApplicationContext() , datas );
            mdlRcycler.setAdapter(dramaListAdapter);

            for(int i=0;i<3;i++) {
                dramaListAdapter.add(
                        new DramaData(
                                "http://img.kbs.co.kr/cms/drama/gurumi/view/preview/__icsFiles/thumbnail/2016/09/13/speci.jpg",
                                "3화",
                                "월요일",
                                "informaionEnterChattingRoom",
                                R.drawable.icon_clock
                        ));
            }
            text_concept();                         //하이퍼링크
        }
        @OnClick(R.id.mdl_back_btn)
        public void mdlBackBtn(View v) {
            finish();
        }

        // 하이퍼링크 및 언더바
        public void text_concept(){
            SpannableString content1 = new SpannableString("MBC 다시보기");
            content1.setSpan(new UnderlineSpan(),0,content1.length(),0);
            broadLink.setText(content1);
            broadLink.setText(Html.fromHtml("<a href=\"http://www.imbc.com\">MBC</a>"));
            broadLink.setMovementMethod(LinkMovementMethod.getInstance());
         }
}