package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.gizaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,placesingiza.class);
                        startActivity(i);
            }
        });
        findViewById(R.id.cairoimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(MainActivity.this,cairo.class);
                startActivity(l);
            }
        });
        findViewById(R.id.alex).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,alexandria.class);
                startActivity(s);
            }
        });
        findViewById(R.id.aswanimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,aswan.class);
                startActivity(s);
            }
        });
        findViewById(R.id.luxor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,luxor.class);
                startActivity(s);
            }
        });
        findViewById(R.id.dahabimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,dahab.class);
                startActivity(s);
            }
        });

        findViewById(R.id.matrouhegypt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,matrouh.class);
                startActivity(s);
            }
        });

        findViewById(R.id.sharmimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,sharmel.class);
                startActivity(s);
            }
        });
        findViewById(R.id.elghardaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,elgharda.class);
                startActivity(s);
            }
        });
        findViewById(R.id.swiaimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,siwa.class);
                startActivity(s);
            }
        });
        findViewById(R.id.fayoumimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(MainActivity.this,gona.class);
                startActivity(s);
            }
        });

        findViewById(R.id.marsaalamimg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(MainActivity.this,marsaAlam.class);
                startActivity(m);
            }
        });
       findViewById(R.id.gizaimg).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent x=new Intent(MainActivity.this,placesingiza.class);
               startActivity(x);

           }
       });









    }
}