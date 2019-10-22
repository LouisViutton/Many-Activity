package com.lsy.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyActivity extends AppCompatActivity {

    @BindView(R.id.text_view)TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ButterKnife.bind(this);

        SharedPreferences my_sp=getSharedPreferences("my_sp",MODE_PRIVATE);
        String input1=my_sp.getString("input1_key","");
        String input2=my_sp.getString("input2_key","");

        textView.setText(input1+input2);

    }
}
