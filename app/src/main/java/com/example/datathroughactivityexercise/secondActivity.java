package com.example.datathroughactivityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private TextView textViewName, textViewAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewName = findViewById(R.id.textViewName);
        textViewAge = findViewById(R.id.textViewAge);

        //RECOVER DATA
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        textViewName.setText(name);
        textViewAge.setText(String.valueOf(age));
    }
}