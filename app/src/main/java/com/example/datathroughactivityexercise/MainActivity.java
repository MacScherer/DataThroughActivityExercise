package com.example.datathroughactivityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();

                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                //INSTANCE OBJECT
                User userObj = new User(name, email);

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