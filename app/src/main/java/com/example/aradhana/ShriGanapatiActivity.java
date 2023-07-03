package com.example.aradhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShriGanapatiActivity extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shri_ganapati);

        t1 = findViewById(R.id.AtharvashirshaTV);
        t2 = findViewById(R.id.GanapatiStotraTV);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShriGanapatiActivity.this, AtharvashirshaTextActivity.class));
            }
        });



    }
}