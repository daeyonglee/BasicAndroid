package com.example.korea.chap04_layout;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.example.korea.myapplication.R;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        TabHost host=(TabHost)findViewById(R.id.host);
        host.setup();

        // 개별적인 탭의 지시자와 내용물을 만드는 기능을 제공
        TabHost.TabSpec spec=host.newTabSpec("tab1");
        // 탭의 지시자로 뷰를 지정
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon1, null));
        // 탭의 내용물을 생성시킬 객체를 지정
        spec.setContent(R.id.tab_content1);
        host.addTab(spec);

        spec=host.newTabSpec("tab2");
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon2, null));
        spec.setContent(R.id.tab_content2);
        host.addTab(spec);

        spec=host.newTabSpec("tab3");
        spec.setIndicator(null, ResourcesCompat.getDrawable(getResources(), R.drawable.tab_icon3, null));
        spec.setContent(R.id.tab_content3);
        host.addTab(spec);
    }
}
