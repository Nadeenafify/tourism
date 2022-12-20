package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        Button addo,showo,updateo,deleteo;

        addo=findViewById(R.id.addo);
        showo=findViewById(R.id.showo);
        updateo=findViewById(R.id.updateo);
        deleteo=findViewById(R.id.deleteo);

        addo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity16.this,MainActivity7.class);
            }
        });



        showo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity16.this,MainActivity17.class);
            }
        });
    }
}