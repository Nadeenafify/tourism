package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aswan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aswan);
        findViewById(R.id.abosimple).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Abu_simple_temple.class);
                startActivity(x);

            }
        });
        findViewById(R.id.alkarnak).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Karanak_temple.class);
                startActivity(x);

            }
        });
        findViewById(R.id.kalabsha).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Templeofkalasha.class);
                startActivity(x);

            }
        });
        findViewById(R.id.komobo).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Temple_of_Komobo.class);
                startActivity(x);

            }
        });
        findViewById(R.id.ramses).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Temple_of_ramses.class);
                startActivity(x);

            }
        });
        findViewById(R.id.sohailisland).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,Sohali_island.class);
                startActivity(x);

            }
        });
        findViewById(R.id.valentin).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,ValentinIsalnd.class);
                startActivity(x);

            }
        });
        findViewById(R.id.ajelic).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,AjelicaIsland.class);
                startActivity(x);

            }
        });
        findViewById(R.id.highdam).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(aswan.this,highdambridge.class);
                startActivity(x);

            }
        });
    }
}