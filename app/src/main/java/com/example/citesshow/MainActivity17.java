package com.example.citesshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity17 extends AppCompatActivity {


    DatabaseController2 dbcontroller;


        String reserved="",remained="";
        int num=0,numm=5;

        ListView listv;
        ArrayList<User2> arr2=new ArrayList<>();
        static String Date,Time,to,busnumber;
        int price;





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main17);


            EditText et1,et2,et3,et4,et6,et7;
            et1=findViewById(R.id.et1);
            et2=findViewById(R.id.et2);
            et3=findViewById(R.id.et3);
            et4=findViewById(R.id.et4);
            et6=findViewById(R.id.et6);
            et7=findViewById(R.id.et7);

            listv=findViewById(R.id.offers);

            dbcontroller=new DatabaseController2(getApplicationContext());
            dbcontroller.open();
            getTrip();


             Button bt=findViewById(R.id.add2);

            useradapter2 ad=new useradapter2(getApplicationContext(),arr2);
            listv.setAdapter(ad);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    dbcontroller.insert(et7.getText().toString(), et1.getText().toString(), et2.getText().toString(), et3.getText().toString(), et4.getText().toString(),et6.getText().toString(), reserved, remained);

                    et1.setText("");
                    et2.setText("");
                    et3.setText("");
                    et4.setText("");
                    et6.setText("");
                    et7.setText("");

                    getTrip();


                    ad.notifyDataSetChanged();
                }
            });






            /*
            listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    if(numm!=0) {
                        Intent in = new Intent(MainActivity17.this, MainActivity2.class);
                        startActivity(in);
                    }
                    else
                    {

                        Intent in = new Intent(MainActivity17.this, MainActivitycom.class);
                        startActivity(in);


                    }
                }
            });

*/
    }



    private void getTrip(){


        arr2.clear();

        for(User2 user2:dbcontroller.sellectTrips()){

            arr2.add(user2);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbcontroller.close();
    }

}