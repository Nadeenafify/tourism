package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dahab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahab);
        findViewById(R.id.aeilgarden).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,aiel_garden.class);
                startActivity(x);

            }
        });
        findViewById(R.id.nabaq).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,nabq_reserve.class);
                startActivity(x);

            }
        });
        findViewById(R.id.wadignai).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,wadi_gnai.class);
                startActivity(x);

            }
        });
        findViewById(R.id.coloredcanyons).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,colored_canyons.class);
                startActivity(x);

            }
        });
        findViewById(R.id.hole).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,blue_hole.class);
                startActivity(x);

            }
        });
        findViewById(R.id.lighthouse).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,light_house.class);
                startActivity(x);

            }
        });
        findViewById(R.id.canyon).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,canyon.class);
                startActivity(x);

            }
        });
        findViewById(R.id.lagonisland).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(dahab.this,lagon_island.class);
                startActivity(x);

            }
        });
    }

}