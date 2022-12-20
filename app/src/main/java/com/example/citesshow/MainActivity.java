package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String two="two";

        ImageView te1,te2,te3,te4,te5,te6;
        te1=findViewById(R.id.f1);
        te2=findViewById(R.id.f2);
        te3=findViewById(R.id.f3);
        te4=findViewById(R.id.f4);
        te5=findViewById(R.id.f5);
        te6=findViewById(R.id.f6);


        te1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,Mainactivitys.class);
                startActivity(in);
            }
        });



        te2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(MainActivity.this,MainActivity14.class);
                in.putExtra("two",two);
                startActivity(in);

            }
        });


        te3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });


        te4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent in=new Intent(MainActivity.this,MainActivity22.class);
                startActivity(in);

            }
        });


        te5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent in=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(in);

            }
        });


        te6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent in=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(in);

            }
        });









    }
}