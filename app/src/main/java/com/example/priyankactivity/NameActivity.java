package com.example.priyankactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        tvName=(TextView)findViewById(R.id.tvName);
        Intent intent=getIntent();
        String name=intent.getStringExtra( "NAME");
        tvName.setText("Welcome" +name);
    }
}