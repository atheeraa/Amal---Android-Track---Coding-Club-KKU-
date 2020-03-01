package com.kku.amal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SentencesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both);


        Button b1 = findViewById(R.id.back);
        b1.setText("رجوع");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(SentencesActivity.this, MainActivity.class);
                startActivity(back);
            }
        });













/*
        String[] sentences = { }; //Array with our personal favorite choices



        TextView t = findViewById(R.id.sentence);

        Random random = new Random(); 	//Random Generator

        String Select = sentences[(random.nextInt(sentences.length))];
        t.setText(Select);

        Button b = findViewById(R.id.back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent random = new Intent(SentencesActivity.this, MainActivity.class);
                startActivity(random);
            }
        });


    }




            }

*/

    }}