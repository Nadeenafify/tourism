package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        String ok=getIntent().getStringExtra("okk");

        Button bt1;
        bt1=findViewById(R.id.bt1);
        boolean bool=getIntent().getBooleanExtra("bool",true);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(MainActivity3.this,MainActivity14.class);
                in.putExtra("No",getIntent().getStringExtra("Noo"));
                startActivity(in);

            }
        });
    }
}