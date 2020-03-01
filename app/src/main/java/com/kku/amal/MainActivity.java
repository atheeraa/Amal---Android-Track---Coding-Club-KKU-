package com.kku.amal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1 = findViewById(R.id.aya);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayaActivity = new Intent(MainActivity.this , AyatActivity.class);
                startActivity(ayaActivity);
            }
        });

        Button b2 = findViewById(R.id.sentence);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SentencesActivity = new Intent(MainActivity.this , SentencesActivity.class);
                startActivity(SentencesActivity);
            }
        });


    }
}
