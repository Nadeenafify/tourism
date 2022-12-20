package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Mainactivitys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);
        findViewById(R.id.gizaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Mainactivitys.this,placesingiza.class);
                        startActivity(i);
            }
        });
        findViewById(R.id.cairoimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Mainactivitys.this,cairo.class);
                startActivity(l);
            }
        });
        findViewById(R.id.alex).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,alexandria.class);
                startActivity(s);
            }
        });
        findViewById(R.id.aswanimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,aswan.class);
                startActivity(s);
            }
        });
        findViewById(R.id.luxor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,luxor.class);
                startActivity(s);
            }
        });
        findViewById(R.id.dahabimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,dahab.class);
                startActivity(s);
            }
        });

        findViewById(R.id.matrouhegypt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,matrouh.class);
                startActivity(s);
            }
        });

        findViewById(R.id.sharmimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,sharmel.class);
                startActivity(s);
            }
        });
        findViewById(R.id.elghardaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,elgharda.class);
                startActivity(s);
            }
        });
        findViewById(R.id.swiaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,siwa.class);
                startActivity(s);
            }
        });
        findViewById(R.id.fayoumimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(Mainactivitys.this,gona.class);
                startActivity(s);
            }
        });

        findViewById(R.id.marsaalamimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Mainactivitys.this,marsaAlam.class);
                startActivity(m);
            }
        });
       findViewById(R.id.gizaimg).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent x=new Intent(Mainactivitys.this,placesingiza.class);
               startActivity(x);

           }
       });









    }
}