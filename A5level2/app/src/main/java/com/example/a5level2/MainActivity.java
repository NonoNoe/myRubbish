package com.example.a5level2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView mImgHead;
    private TextView mEt3G;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImgHead = findViewById(R.id.imgView);
        mEt3G = findViewById(R.id.textView);

    }
}