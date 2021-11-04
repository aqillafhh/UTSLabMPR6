package com.example.utsmprcoba;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhalamanutama);

        TextView H = findViewById(R.id.textView3);
        String name = getIntent().getExtras().getString("dj");
        H.setText(name);
    }

}
