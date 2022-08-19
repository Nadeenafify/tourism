package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class marsaAlam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marsa_alam);
        findViewById(R.id.tree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,thrush_tree.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.lake).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,metoer_lake.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.abughosounwreck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,abughosoum_wreck.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.port).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,port_ghali.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.village).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,berenice_village.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.alsamadyreseve).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,alsamaday_reserve.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.wadi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,dolphin_house.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.leadmountain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,lead_mountain.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.dolphin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(marsaAlam.this,dolphin_house.class);
                startActivity(intent);
            }
        });
    }
}