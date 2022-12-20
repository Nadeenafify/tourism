package com.example.citesshow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        TextView te1,te2,te3;

        te1=findViewById(R.id.num1);
        te2=findViewById(R.id.num2);
        te3=findViewById(R.id.num3);

        te1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone=te1.getText().toString();
              Intent intent=new Intent(Intent.ACTION_CALL);
              intent.setData(Uri.parse("tel :01129620138"));
              startActivity(intent);

            }
        });


    }
}