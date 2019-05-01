package com.example.sportsort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView tv_Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Test test_User1 = new Test();
        tv_Name = (TextView) findViewById(R.id.tv_Name);
        tv_Name.setText(test_User1.name);
    }




}
