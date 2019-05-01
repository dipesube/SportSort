package com.example.sportsort;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    private Button btn_Profile;
    private Button btn_Search;
    private Button btn_CreateEvent;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_HOME:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_SEARCH:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_PROFILE:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        btn_Profile = (Button) findViewById(R.id.btn_Profile);
        btn_Profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               openProfile();
            }
        });
        btn_Search = (Button) findViewById(R.id.btn_Search);
        btn_Search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
        btn_CreateEvent = (Button) findViewById(R.id.btn_CreateEvent);
        btn_CreateEvent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openCreateEvent();
            }
        });

    }
    public void openProfile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void openSearch(){ //Function that will switch the user interface from Discover to Search
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
    public void openCreateEvent(){
        Intent intent = new Intent(this, CreateEvent.class );
        startActivity(intent);
    }
}

