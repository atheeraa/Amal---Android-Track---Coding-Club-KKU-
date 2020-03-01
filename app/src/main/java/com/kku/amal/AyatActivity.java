package com.kku.amal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AyatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both);

        Button b1 = findViewById(R.id.back);
        b1.setText("رجوع");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(AyatActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}
