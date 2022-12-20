package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);

        Button b1;
        boolean bool=getIntent().getBooleanExtra("bool",true);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity4.this,MainActivity3.class);
                in.putExtra("no",getIntent().getStringExtra("No"));
                startActivity(in);
            }
        });

        TextView te1,te2,te3,te5,te6,te4,te7;
        te1=findViewById(R.id.te1);
        te2=findViewById(R.id.te2);
        te3=findViewById(R.id.te3);
        te5=findViewById(R.id.te5);
        te6=findViewById(R.id.te6);
        te4=findViewById(R.id.te4);
        te7=findViewById(R.id.te7);





        if(getIntent() !=null){




            te1.setText(getIntent().getStringExtra("username"));
            te2.setText(getIntent().getStringExtra("Time"));
            te3.setText(getIntent().getStringExtra("date"));
            te4.setText(getIntent().getStringExtra("price")+" * "+getIntent().getStringExtra("No"));
            te5.setText(getIntent().getStringExtra("To"));
            te6.setText(getIntent().getStringExtra("busnumber"));
            te7.setText(getIntent().getStringExtra("No"));


        }
    }
}