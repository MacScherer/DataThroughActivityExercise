package com.example.datathroughactivityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                //INSTANCE OBJECT
                User userObj = new User("Mac", "Mac@gmail.com");

                //PASSING DATA
                intent.putExtra("name", "Mac");
                intent.putExtra("age", 26);
                intent.putExtra("objUser", userObj);
                // implements serializable on User class to transfere object

                startActivity(intent);
            }
        });
    }
}