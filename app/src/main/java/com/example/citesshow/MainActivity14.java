package com.example.citesshow;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;





public class MainActivity14 extends AppCompatActivity {


    public static int numm = 5;
    public static int num = 0;

    ListView listv;

    ArrayList<User> arr = new ArrayList<>();

    static String Date, Time, to, price, busnumber;

    String reserved = "";
    String remained = "";


    DatabaseController dbcontroller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);




        dbcontroller = new DatabaseController(getApplicationContext());
        dbcontroller.open();


        reserved = Integer.toString(num);
        remained = Integer.toString(numm);



        listv = findViewById(R.id.listv);

        Button bt = findViewById(R.id.add);


        TextView t1, t2, t3, t4, t5;
        EditText e1, e2, e3, e4, e5;
        Button del, up;

        del = findViewById(R.id.delete);


        t1 = findViewById(R.id.i1);
        t2 = findViewById(R.id.i3);
        t3 = findViewById(R.id.i5);
        t4 = findViewById(R.id.i7);
        t5 = findViewById(R.id.i9);


        e1 = findViewById(R.id.i2);
        e2 = findViewById(R.id.i4);
        e3 = findViewById(R.id.i6);
        e4 = findViewById(R.id.i8);
        e5 = findViewById(R.id.i10);


        String id = getIntent().getStringExtra("id");

        useradapter ad = new useradapter(getApplicationContext(), arr);

        listv.setAdapter(ad);


        if (id != null) {


            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {




                    dbcontroller.insert(e1.getText().toString(), e2.getText().toString(), e3.getText().toString(), e4.getText().toString(), e5.getText().toString(), reserved, remained);

                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    e5.setText("");

                    getTrip();


                    ad.notifyDataSetChanged();



                }
            });


        } else {


            getTrip();


            bt.setVisibility(View.GONE);
            del.setVisibility(View.GONE);


            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);
            t4.setVisibility(View.GONE);
            t5.setVisibility(View.GONE);

            e1.setVisibility(View.GONE);
            e2.setVisibility(View.GONE);
            e3.setVisibility(View.GONE);
            e4.setVisibility(View.GONE);
            e5.setVisibility(View.GONE);


        }


        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {








                     Intent in = new Intent(MainActivity14.this, MainActivity2.class);
                     in.putExtra("date", dbcontroller.sellectTrips().get(i).getDate());
                     in.putExtra("Time", dbcontroller.sellectTrips().get(i).getTime());
                     in.putExtra("To", dbcontroller.sellectTrips().get(i).getTo());
                     in.putExtra("price", dbcontroller.sellectTrips().get(i).getPrice());
                     in.putExtra("busnumber", dbcontroller.sellectTrips().get(i).getBusnumber());
                startActivity(in);










                }



        });




    }



    private void getTrip(){


        arr.clear();

        for(User user:dbcontroller.sellectTrips()){

            arr.add(user);
        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbcontroller.close();
    }
}







/*

        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (id == null) {

                    if (dbcontroller.sellectTrips().get(i).getRemained().equals("0")) {

                        Intent inn = new Intent(MainActivity14.this, MainActivitycom.class);
                        startActivity(inn);
                    } else {


                        Intent in = new Intent(MainActivity14.this, MainActivity2.class);
                        in.putExtra("date", dbcontroller.sellectTrips().get(i).getDate());
                        in.putExtra("Time", dbcontroller.sellectTrips().get(i).getTime());
                        in.putExtra("To", dbcontroller.sellectTrips().get(i).getTo());
                        in.putExtra("price", dbcontroller.sellectTrips().get(i).getPrice());
                        in.putExtra("busnumber", dbcontroller.sellectTrips().get(i).getBusnumber());


                        num++;
                        numm--;

                        reserved = Integer.toString(num);
                        remained = Integer.toString(numm);

                        dbcontroller.update(dbcontroller.sellectTrips().get(i).getDate(), dbcontroller.sellectTrips().get(i).getTime(), dbcontroller.sellectTrips().get(i).getTo(), dbcontroller.sellectTrips().get(i).getPrice(), dbcontroller.sellectTrips().get(i).getBusnumber(), reserved, remained);

                        ad.notifyDataSetChanged();


                        in.putExtra("reserved", dbcontroller.sellectTrips().get(i).getReserved());
                        in.putExtra("remained", dbcontroller.sellectTrips().get(i).getRemained());


                        startActivity(in);
                    }

                }


            }

        }

    }
    public void getTrip() {


                arr.clear();
                for (User user : dbcontroller.sellectTrips()) {

                    arr.add(user);
                }

            }
        }
*/