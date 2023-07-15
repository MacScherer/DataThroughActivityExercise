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
        Bundle bundleData = getIntent().getExtras();
        String name = bundleData.getString("name");
        int age = bundleData.getInt("age");
        // Recover object
        User user = (User) bundleData.getSerializable("objUser");

        textViewName.setText(user.getEmail());
        textViewAge.setText(String.valueOf(age));
    }
}