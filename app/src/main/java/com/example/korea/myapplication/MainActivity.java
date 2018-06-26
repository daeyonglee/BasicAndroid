package com.example.korea.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

// 화면 구성을 주목적으로 하는 클래스
// AppCompatActivity은 Activity의 서브 클래스
public class MainActivity extends AppCompatActivity {

    //액티비티 실행과 동시에 자동으로 onCreate() 함수 실행
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면 출력 함수
        // res/layout/activity_main.xml의 구성대로 화면을 출력
        setContentView(R.layout.activity_main);
    }
}
