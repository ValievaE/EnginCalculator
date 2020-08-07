package com.example.engincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonChange = findViewById(R.id.btnToEnginCalc);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayoutEngin = findViewById(R.id.linearLayoutEnginAll);
                RelativeLayout calculator = findViewById(R.id.calculator);
                linearLayoutEngin.setVisibility(View.GONE);
                calculator.setVisibility(View.VISIBLE);
            }
        });


    }
}