package com.lsy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input1)
    EditText editText1;
    @BindView(R.id.input2)
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.bt)
    void jump(){
        String input1=editText1.getText().toString();
        String input2=editText2.getText().toString();

        SpTools.putString("input1_key",input1);
        SpTools.putString("input2_key",input2);

        /*SharedPreferences my_sp = getSharedPreferences("my_sp",MODE_PRIVATE);
        SharedPreferences.Editor edit=my_sp.edit();

        String input1=editText1.getText().toString();
        String input2=editText2.getText().toString();
        edit.putString("input1_key",input1);
        edit.putString("input2_key",input2);

        edit.apply();*/

        Intent intent=new Intent(MainActivity.this,MyActivity.class);
        startActivity(intent);
    }
}
