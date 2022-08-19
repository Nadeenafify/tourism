package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class placesingiza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placesingiza);
        findViewById(R.id.pyrmids).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x=new Intent(placesingiza.this,pyrmids.class);
                startActivity(x);
            }
        });
        findViewById(R.id.solarboat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,solar_boat.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.pharonic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,pharonic_village.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.alazher).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,alazher_park.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.alazhermosque).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,alazher_mosque.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.alorman).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,alorman_park.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.thezoo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,the_zoo.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.thegrand).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,the_grand_eg_musuem.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.sphinx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(placesingiza.this,great_sphinx.class);
                startActivity(intent);
            }
        });
    }
}