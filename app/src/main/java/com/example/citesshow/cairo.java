package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class cairo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cairo);
        findViewById(R.id.citadel).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,description.class);
                startActivity(x);

            }
        });
        findViewById(R.id.egymusuem).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,egyptianmusuem.class);
                startActivity(x);

            }
        });
        findViewById(R.id.cairotower).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,cairoTower.class);
                startActivity(x);

            }
        });
        findViewById(R.id.asha).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,ashafahmi.class);
                startActivity(x);

            }
        });
        findViewById(R.id.elmoez).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,elmoezStreet.class);
                startActivity(x);

            }
        });
        findViewById(R.id.nationalmusuem).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,nationalmusuem.class);
                startActivity(x);

            }
        });
        findViewById(R.id.abadein).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,abadeenpalace.class);
                startActivity(x);

            }
        });
        findViewById(R.id.khan).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,khanelkhalili.class);
                startActivity(x);

            }
        });
        findViewById(R.id.elbaron).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(cairo.this,elbaronpalace.class);
                startActivity(x);

            }
        });




    }
}