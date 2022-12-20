package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        EditText edd11, edd22, edd33, edd44, edd55, edd66;
        Button btn22;

        edd11 = findViewById(R.id.edd11);
        edd22 = findViewById(R.id.edd22);
        edd33 = findViewById(R.id.edd33);
        edd44 = findViewById(R.id.edd44);
        edd55 = findViewById(R.id.edd55);
        edd66 = findViewById(R.id.edd66);
        btn22 = findViewById(R.id.btn22);

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity7.this, MainActivity17.class);
                in.putExtra("Date", edd11.getText().toString());
                in.putExtra("Time", edd22.getText().toString());
                in.putExtra("To", edd33.getText().toString());
                in.putExtra("price", edd44.getText().toString());
                in.putExtra("busnumber", edd55.getText().toString());
                in.putExtra("not", edd66.getText().toString());
                startActivity(in);

            }
        });
    }
}
