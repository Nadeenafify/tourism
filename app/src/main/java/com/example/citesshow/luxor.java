package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class luxor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luxor);
        findViewById(R.id.abydoscidy).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,Abydocity.class);
                startActivity(x);

            }
        });
        findViewById(R.id.deirelmidian).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,Deirelmedina.class);
                startActivity(x);

            }
        });
        findViewById(R.id.luxormusuem).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,luxormusuem.class);
                startActivity(x);

            }
        });
        findViewById(R.id.motuarytemple).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,MotuaryTemple.class);
                startActivity(x);

            }
        });
        findViewById(R.id.nadaland).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,Nadalandpark.class);
                startActivity(x);

            }
        });
        findViewById(R.id.bananaisland).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,BananaIsland.class);
                startActivity(x);

            }
        });
        findViewById(R.id.vallyofking).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,vallyofking.class);
                startActivity(x);

            }
        });
        findViewById(R.id.vallyofqueen).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,vallyofqueen.class);
                startActivity(x);

            }
        });
        findViewById(R.id.ramsuem).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,RamsuemTemple.class);
                startActivity(x);

            }
        });
        findViewById(R.id.interpark).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,internationalgarden.class);
                startActivity(x);

            }
        });
        findViewById(R.id.courniash).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,cournish.class);
                startActivity(x);

            }
        });
        findViewById(R.id.luxortemple).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(luxor.this,luxorTemple.class);
                startActivity(x);

            }
        });
    }
}