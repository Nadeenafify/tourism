package com.example.citesshow;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DatabaseController2 {


    private Databasehelper2 databasehelper;
    private SQLiteDatabase database;

    public DatabaseController2(Context context) {

        databasehelper=new Databasehelper2(context);
    }
    public void open(){

        database = databasehelper.getWritableDatabase();
    }

    public long insert(String Not,String Date,String Time,String Too,String price,String busnumber,String reserved,String remained){


        ContentValues values=new ContentValues();

        values.put(Databasehelper2.TABLE01_COL1,Date);
        values.put(Databasehelper2.TABLE01_COL2,Time);
        values.put(Databasehelper2.TABLE01_COL3,Too);
        values.put(Databasehelper2.TABLE01_COL4,price);
        values.put(Databasehelper2.TABLE01_COL5,busnumber);
        values.put(Databasehelper2.TABLE01_COL6,reserved);
        values.put(Databasehelper2.TABLE01_COL7,remained);
        values.put(Databasehelper2.TABLE01_COL8,Not);

        return   database.insert(Databasehelper2.TABLE01_NAME,null,values);



    }


    public int update(String Date,String Time,String Too,String price,String busnumber,String reserved,String remained){


        ContentValues values=new ContentValues();

        values.put(Databasehelper2.TABLE01_COL1,Date);
        values.put(Databasehelper2.TABLE01_COL2,Time);
        values.put(Databasehelper2.TABLE01_COL3,Too);
        values.put(Databasehelper2.TABLE01_COL4,price);
        values.put(Databasehelper2.TABLE01_COL5,busnumber);
        values.put(Databasehelper2.TABLE01_COL6,reserved);
        values.put(Databasehelper2.TABLE01_COL7,remained);

        return database.update(Databasehelper2.TABLE01_NAME,values,Databasehelper2.TABLE01_COL5+"="+busnumber,null);




    }

    private User2 CursorTouser(Cursor cursor){

        return new User2(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7));
    }

    public ArrayList<User2> sellectTrips()

    {
        ArrayList<User2> Trips = new ArrayList<>();

        Cursor cursor = database.query(Databasehelper2.TABLE01_NAME, new String[]{Databasehelper2.TABLE01_COL1,Databasehelper2.TABLE01_COL1, Databasehelper2.TABLE01_COL2, Databasehelper2.TABLE01_COL3, Databasehelper2.TABLE01_COL4, Databasehelper2.TABLE01_COL5, Databasehelper2.TABLE01_COL6, Databasehelper2.TABLE01_COL7}, null, null, null, null, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){


            Trips.add(CursorTouser(cursor));
            cursor.moveToNext();
        }

        return Trips;
    }

    public int delete(int busnumber){


        return database.delete(Databasehelper2.TABLE01_NAME,Databasehelper.TABLE01_COL5+"="+busnumber,null);


    }





    public void close(){

        if (databasehelper != null)
        {

            databasehelper.close();
        }

    }
}

