package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    EditText edd1,edd2,edd3,edd4,edd5;
    Button btn;


    String reserved="";
    String remained="";

    int num=1;
    int numm=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        EditText edd1,edd2,edd3,edd4,edd5;
        Button btn;


        edd1=findViewById(R.id.edd1);
        edd2=findViewById(R.id.edd2);
        edd3=findViewById(R.id.edd3);
        edd4=findViewById(R.id.edd4);
        edd5=findViewById(R.id.edd5);
        btn=findViewById(R.id.btn);

        String id=getIntent().getStringExtra("id");






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity9.this,MainActivity14.class);


                in.putExtra("Date",edd1.getText().toString());
                in.putExtra("Time",edd2.getText().toString());
                in.putExtra("To",edd3.getText().toString());
                in.putExtra("price",edd4.getText().toString());
                in.putExtra("busnumber",edd5.getText().toString());
                in.putExtra("id",id);



                startActivity(in);
            }




        });

    }



}