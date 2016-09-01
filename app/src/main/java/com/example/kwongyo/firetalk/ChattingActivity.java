package com.example.kwongyo.firetalk;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kwongyo.firetalk.activitySupport.ChattingAdapter;
import com.example.kwongyo.firetalk.activitySupport.ChattingData;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class ChattingActivity extends AppCompatActivity {

    @Bind(R.id.chat_recyclerview)
    RecyclerView recyclerView;
    ChattingAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<ChattingData> datas = new ArrayList<ChattingData>();

    private InputMethodManager inputMethodManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting);
        ButterKnife.bind(this);
        initAnother();
        inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    }
    public void initAnother(){
        /*
         recyclerView.setHasFixedSize(isFixed boolean)
        ->use this setting to improve performance if you know that changes
         in content do not change the layout size of the recyclerview 라고 api문서에 나와있음
        */
        recyclerView.setHasFixedSize(true);

        //use a linear layout manager.
        layoutManager = new LinearLayoutManager(this);

        // layou manager set
        recyclerView.setLayoutManager(layoutManager);

        //specify an adapter ( see also next example) ????
        adapter = new ChattingAdapter( getApplicationContext() ,  datas);
        recyclerView.setAdapter(adapter);
    }
    @Bind(R.id.send_btn)
    TextView sendBtn;
    @Bind(R.id.typing_message)
    EditText typingMessage;
    /**
     *
     * @param text edit에 쓴 data.
     * @param start
     * @param before
     * @param count edit에 작성되어 있는 글자 수.
     */
    @OnTextChanged(R.id.typing_message)
    public void onTextChanged(CharSequence text , int start, int before , int count) {
        // 글자가 한글자 이상 써있는 경우.
        if( count !=0 )
            sendBtn.setVisibility(View.VISIBLE);
        else // 글자가 한글자도 써있지 않는 경우.
            sendBtn.setVisibility(View.GONE);
    }
    public static String lastAskPerson = "";
    @OnClick(R.id.send_btn)
    public void sendBtnClick(View v) {
        Toast.makeText(getApplicationContext(),typingMessage.getText().toString(),Toast.LENGTH_SHORT).show();
        adapter.add(new ChattingData(R.drawable.icon_profile,"송블리",typingMessage.getText().toString() , lastAskPerson.equals("송블리") ));
        lastAskPerson = "송블리";
    }

    @OnClick(R.id.icon_btn)
    public void iconBtnClick(View v){
        if( inputMethodManager.isAcceptingText() )  // 만약 키보드가 활성화중이라면
            inputMethodManager.hideSoftInputFromWindow(typingMessage.getWindowToken(), 0);
    }
}