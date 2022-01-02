package com.example.bottomsheetsimpledesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnShow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Bottom_Sheet_Fragment bottomSheetFragment=new Bottom_Sheet_Fragment();
            bottomSheetFragment.show(getSupportFragmentManager(),bottomSheetFragment.getTag());
            }
        });

    }
}