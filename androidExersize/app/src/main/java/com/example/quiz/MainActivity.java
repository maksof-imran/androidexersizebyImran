package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText email;
   private  EditText pass;
   private Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        start = (Button) findViewById(R.id.startBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailId = email.getText().toString();
                String password = pass.getText().toString();

                if (emailId.equals("imran@gmail.com") && password.equals("imran")) {
                    Intent Quiz = new Intent(MainActivity.this, list.class);
                    startActivity(Quiz);
                } else {

                    Toast.makeText(MainActivity.this, "Faild To Login", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }

}