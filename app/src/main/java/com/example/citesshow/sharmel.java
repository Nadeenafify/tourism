package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sharmel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharmel);
        findViewById(R.id.alsahabamosque).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,alshaba_mosque.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.coloredsinia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,colored_canyon_sinai.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.peaceicon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,peace_icon.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.sohosunset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,soho_sunset.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.mountcat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,catrin_montain.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.dolphinpark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,dolphin_park.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.rasmohamed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,ras_mohamed.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.safri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,safri.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.ghazalagarden).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sharmel.this,ghazala_garden.class);
                startActivity(intent);
            }
        });
    }
}