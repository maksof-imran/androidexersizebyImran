package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class question extends AppCompatActivity {
    String isSelect;
    TextView option1;
    TextView option2;
    TextView option3;
    TextView option4;
    TextView option0;
//    String[] html = {"What does PHP stand for?", "PHP: Hypertext Preprocessor", "Persnol Hypertext processor", "Private Home Page","Private Home Page"};
//    String[] css = {"What does CSS stand for?", " Colorful Style Sheets", "Persnol Hypertext processor", "Private Home Page","Private Home Page"};
//    String[] javascrip = {"What does PHP stand for?", "PHP: Hypertext Preprocessor", "Persnol Hypertext processor", "Private Home Page","Private Home Page"};
//    String[] php = {"What does PHP stand for?", "PHP: Hypertext Preprocessor", "Persnol Hypertext processor", "Private Home Page","Private Home Page"};
    String[] php = {"What does PHP stand for?", "PHP: Hypertext Preprocessor", "Persnol Hypertext processor", "Private Home Page","Private Home Page"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        isSelect = (getIntent().getExtras().getString("languages"));
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        option0 = findViewById(R.id.txtQuestion);
        Toast.makeText(this,isSelect,Toast.LENGTH_LONG).show();

   if (isSelect == "PHP"){

            for (int i = 0 ; i <php.length; i++){
               option0.setText(php[i]);
               option1.setText(php[1]);
               option2.setText(php[4]);
               option3.setText(php[5]);
               option4.setText(php[6]);
            }
        }


    }

}