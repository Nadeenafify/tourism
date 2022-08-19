package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alexandria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alexandria);
        findViewById(R.id.citbey).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,citbey_citadel.class);
                startActivity(x);

            }
        });
        findViewById(R.id.abukir).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,abu_qir.class);
                startActivity(x);

            }
        });
        findViewById(R.id.abasmosque).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,abas_mosque.class);
                startActivity(x);

            }
        });
        findViewById(R.id.boltcastle).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,boldt_castle.class);
                startActivity(x);

            }
        });
        findViewById(R.id.lostcity).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,the_lost_city.class);
                startActivity(x);

            }
        });
        findViewById(R.id.kom_eldika).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,kom_eldika.class);
                startActivity(x);

            }
        });
        findViewById(R.id.raseltin).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,ras_eltin_palace.class);
                startActivity(x);

            }
        });
        findViewById(R.id.library).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,alex_library.class);
                startActivity(x);

            }
        });
        findViewById(R.id.stanelt_bridge).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,stanelt_bridge.class);
                startActivity(x);

            }
        });
        findViewById(R.id.montazh).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(alexandria.this,elmontazh.class);
                startActivity(x);

            }
        });
    }
}