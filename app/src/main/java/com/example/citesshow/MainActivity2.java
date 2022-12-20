package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText ed1,ed2,ed3,no;

        boolean bool=true;

        Button btn;
        no=findViewById(R.id.no);
        btn=findViewById(R.id.bt);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);

        String Time=getIntent().getStringExtra("Time");
        String busnumber=getIntent().getStringExtra("busnumber");
        String To=getIntent().getStringExtra("To");
        String price=getIntent().getStringExtra("price");
        String Date=getIntent().getStringExtra("date");





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity2.this,MainActivity4.class);
                in.putExtra("username",ed1.getText().toString());
                in.putExtra("Time",Time);
                in.putExtra("To",To);
                in.putExtra("date",Date);
                in.putExtra("price",price);
                in.putExtra("busnumber",busnumber);
                in.putExtra("bool",bool);


                in.putExtra("No",no.getText().toString());



                startActivity(in);

            }
        });
    }
}