package com.example.korea.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class BasicCompActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_comp);

        // Custom Font 적용
        TextView textView = (TextView)findViewById(R.id.fontView);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "DX경필명조B.ttf");
        textView.setTypeface(typeface);

        // CheckBox 이벤트 프로그램
        checkBox = (CheckBox)findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    checkBox.setText("is Checked");
                } else {
                    checkBox.setText("is unChecked");
                }
            }
        });
    }
}
