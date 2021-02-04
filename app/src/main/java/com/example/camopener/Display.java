package com.example.camopener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView dis;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        dis = findViewById(R.id.textView);
        st=getIntent().getStringExtra("xys");
        dis.setText(st);
    }
}