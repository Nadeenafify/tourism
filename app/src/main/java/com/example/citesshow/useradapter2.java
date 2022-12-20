package com.example.citesshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class useradapter2 extends ArrayAdapter<User2> {


    public useradapter2(Context context, ArrayList<User2> users) {
        super(context, 0, users);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View currentListView= convertView;
        if(currentListView==null){

            currentListView= LayoutInflater.from(getContext()).inflate(R.layout.layout2,parent,false);


        }

        User2 cur= getItem(position);

        ImageView im=currentListView.findViewById(R.id.imm);
        im.setImageResource(cur.getId());



        TextView Date=currentListView.findViewById(R.id.Date);
        Date.setText(cur.getDate());




        TextView  Time=currentListView.findViewById(R.id.Time);
        Time.setText(cur.getTime());



        TextView  To=currentListView.findViewById(R.id.To);
        To.setText(cur.getTo());


        TextView  price=currentListView.findViewById(R.id.price);
        price.setText(cur.getPrice());


        TextView  busnumber=currentListView.findViewById(R.id.busnumber);
        busnumber.setText(cur.getBusnumber());

        TextView  not=currentListView.findViewById(R.id.not);
        not.setText(cur.getNot());

        TextView  reserved=currentListView.findViewById(R.id.reservedo);
        reserved.setText(cur.getReserved());

        TextView  remained=currentListView.findViewById(R.id.remainedo);
        remained.setText(cur.getRemained());




        return currentListView;
    }



}

