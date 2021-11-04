package com.example.utsmprcoba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);

        Button btn1 = findViewById(R.id.button1);
            EditText Name = findViewById(R.id.username1);
            TextView Y = findViewById(R.id.textView4);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String x = Name.getText().toString();

                    Intent pindah = new Intent(MainActivity.this, MainActivity2.class);
                    pindah.putExtra("alya", x);

                    startActivity(pindah);
                }
            });
            }
        }
