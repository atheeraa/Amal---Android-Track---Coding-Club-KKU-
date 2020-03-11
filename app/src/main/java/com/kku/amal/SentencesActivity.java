package com.kku.amal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SentencesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both);


        TextView b1 = findViewById(R.id.back);
        b1.setText("رجوع");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(SentencesActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
        TextView b2 = findViewById(R.id.exit);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);
            }
        });

        String[] sentences = { " تأكد ما أشتدت ظُلمتها إلاَ لتُمطر "
                ,"ولعلك تنام الليله على أمر قد يأست منه ليوقِظك الله على فرحاً بإنفراجه "
                , "أيا كان هذا الذي نمُر به ، سينتهي "}; //Array with our personal favorite choices
        TextView t = findViewById(R.id.sentence);
        Random random = new Random(); 	//Random Generator

        String Select = sentences[(random.nextInt(sentences.length))];
        t.setText(Select);




    }




            }


