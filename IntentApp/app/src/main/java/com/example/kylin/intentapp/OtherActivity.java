package com.example.kylin.intentapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Kylin on 2015/7/10 0010.
 */
public class OtherActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        //取数据
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        int age=intent.getIntExtra("age", 0);//第二个值是default值
        String gender=intent.getStringExtra("gender");
        Toast.makeText(this.,"name:"+name+",age:"+age+",gender:"+gender,Toast.LENGTH_SHORT).show();
}
