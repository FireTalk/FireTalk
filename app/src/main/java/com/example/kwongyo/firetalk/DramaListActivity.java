package com.example.kwongyo.firetalk;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.kwongyo.firetalk.activitySupport.FontFactory;
import com.example.kwongyo.firetalk.activitySupport.dramalist.DramaListAdapter;
import com.example.kwongyo.firetalk.activitySupport.dramalist.DramaData;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kwongyo on 2016-09-16.
 */
public class DramaListActivity extends AppCompatActivity {

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
                    "https://tv.pstatic.net/thm?size=54x78&quality=5&q=https://ssl.pstatic.net/sstatic/keypage/image/dss/57/37/30/26/57_3373026_poster_image_1471395715777.jpg",
                            "3화",
                            "월요일",
                            "informaionEnterChattingRoom",
                            R.drawable.icon_clock
            ));
        }
    }
}
