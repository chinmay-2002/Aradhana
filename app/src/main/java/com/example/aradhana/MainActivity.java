package com.example.aradhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView GanapatiTv, MahadevTv, YogeshwarideviTv, AartyaTv, VishnuTv,KrushnTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindcomponents();

        GanapatiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShriGanapatiActivity.class));
            }
        });

        MahadevTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShriMahadevActivity.class));
            }
        });

        YogeshwarideviTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShriYogeshwariDeviActivity.class));
            }
        });



        AartyaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AartyaActivity.class));

            }
        });

        KrushnTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ShriKrushnActivity.class));
            }
        });

        VishnuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ShriVishnuActivity.class);
                startActivity(i);
            }
        });

    }

    public void bindcomponents(){
        GanapatiTv = findViewById(R.id.GanapatiTV);
        MahadevTv = findViewById(R.id.MahadevTV);
        YogeshwarideviTv = findViewById(R.id.YogeshwarideviTV);
        AartyaTv = findViewById(R.id.AartyaTV);
        KrushnTV=findViewById(R.id.KrushnTV);
        VishnuTv = findViewById(R.id.VishnuTV);

    }
}