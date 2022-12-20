package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        String id="five";

        Button login;
        EditText e1,e2;
        e1=findViewById(R.id.ee1);
        e2=findViewById(R.id.ee2);
        login=findViewById(R.id.login);

        TextView v=findViewById(R.id.user);


        String i=v.getText().toString();










                    {
                          login.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View view) {

                                  if(e1.getText().toString().equals("admin")&&e2.getText().toString().equals("123"))

                                   {
                                      Intent in = new Intent(MainActivity5.this, MainActivity14.class);
                                      in.putExtra("id", id);
                                      startActivity(in);
                                  }
                              }
                          });


                    }






    }
}