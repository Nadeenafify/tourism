package com.example.citesshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class siwa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siwa);
        findViewById(R.id.saltlake).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,salt_lake.class);
                startActivity(x);

            }
        });
        findViewById(R.id.theshali).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,theshali.class);
                startActivity(x);

            }
        });
        findViewById(R.id.templeoforacl).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,theTempleOfOracle.class);
                startActivity(x);

            }
        });
        findViewById(R.id.sandsea).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,greatSandSea.class);
                startActivity(x);

            }
        });
        findViewById(R.id.island).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,fatnasIsland.class);
                startActivity(x);

            }
        });
        findViewById(R.id.ghazala).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,Gazala.class);
                startActivity(x);

            }
        });
        findViewById(R.id.mountain).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,deadmountain.class);
                startActivity(x);

            }
        });
        findViewById(R.id.house).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,housemusuem.class);
                startActivity(x);

            }
        });
        findViewById(R.id.cave).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent x=new Intent(siwa.this,djaracave.class);
                startActivity(x);

            }
        });

    }


}