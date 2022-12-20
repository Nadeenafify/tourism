package com.example.citesshow;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DatabaseController {


   private Databasehelper databasehelper;
    private SQLiteDatabase database;

    public DatabaseController(Context context) {

        databasehelper=new Databasehelper(context);
    }
    public void open(){

         database = databasehelper.getWritableDatabase();
    }

    public long insert(String Date,String Time,String Too,String price,String busnumber,String reserved,String remained){


        ContentValues values=new ContentValues();

        values.put(Databasehelper.TABLE01_COL1,Date);
        values.put(Databasehelper.TABLE01_COL2,Time);
        values.put(Databasehelper.TABLE01_COL3,Too);
        values.put(Databasehelper.TABLE01_COL4,price);
        values.put(Databasehelper.TABLE01_COL5,busnumber);
        values.put(Databasehelper.TABLE01_COL6,reserved);
        values.put(Databasehelper.TABLE01_COL7,remained);

        return   database.insert(Databasehelper.TABLE01_NAME,null,values);



    }


    public int update(String Date,String Time,String Too,String price,String busnumber,String reserved,String remained){


        ContentValues values=new ContentValues();

        values.put(Databasehelper.TABLE01_COL1,Date);
        values.put(Databasehelper.TABLE01_COL2,Time);
        values.put(Databasehelper.TABLE01_COL3,Too);
        values.put(Databasehelper.TABLE01_COL4,price);
        values.put(Databasehelper.TABLE01_COL5,busnumber);
        values.put(Databasehelper.TABLE01_COL6,reserved);
        values.put(Databasehelper.TABLE01_COL7,remained);

        return database.update(Databasehelper.TABLE01_NAME,values,Databasehelper.TABLE01_COL5+"="+busnumber,null);




    }

    private User CursorTouser(Cursor cursor){

        return new User(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6));
    }

    public ArrayList<User> sellectTrips()

    {
        ArrayList<User> Trips = new ArrayList<>();

        Cursor cursor = database.query(Databasehelper.TABLE01_NAME, new String[]{Databasehelper.TABLE01_COL1, Databasehelper.TABLE01_COL2, Databasehelper.TABLE01_COL3, Databasehelper.TABLE01_COL4, Databasehelper.TABLE01_COL5, Databasehelper.TABLE01_COL6, Databasehelper.TABLE01_COL7},null , null, null, null, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){


            Trips.add(CursorTouser(cursor));
            cursor.moveToNext();
        }

        return Trips;
    }



    public int delete(String  busnumber){


        return database.delete(Databasehelper.TABLE01_NAME,Databasehelper.TABLE01_COL5+"="+busnumber,null);


    }





    public void close(){

        if (databasehelper != null)
         {

             databasehelper.close();
        }

        }
    }

