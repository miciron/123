package com.dungeonm.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView textview = findViewById(R.id.textView);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("key").toString();
        textview.setText("Переданные данные: " + name);
    }
}