package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list extends AppCompatActivity {
     ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listview = findViewById(R.id.listview);

        String[] languages = {"Html","Css","JavaScrip","PHP","MVC"};

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,languages);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String select = adapter.getItem(i).toString();
                Intent intent = new Intent(getApplicationContext(),question.class);
                intent.putExtra("languages",select);
                startActivity(intent);
            }
        });
    }
}