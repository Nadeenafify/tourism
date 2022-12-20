package com.example.citesshow;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class Databasehelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="HR";
    private static final int DATABASE_VERSION=1;
    public static  final  String TABLE01_NAME="TRIP";

    public static  final  String TABLE01_COL1="DATE";
    public static  final  String TABLE01_COL2="TIME";
    public static  final  String TABLE01_COL3="TOO";
    public static  final  String TABLE01_COL4="PRICE";
    public static  final  String TABLE01_COL5="BUSNUMBER";
    public static  final  String TABLE01_COL6="RESERVED";
    public static  final  String TABLE01_COL7="REMAINED";




    private static final String CREATE_TABLE_STATMENT ="CREATE TABLE "+TABLE01_NAME+" ("+TABLE01_COL1+" TEXT,"+TABLE01_COL2+" TEXT,"+TABLE01_COL3+" TEXT,"+TABLE01_COL4+" TEXT,"+TABLE01_COL5+" TEXT,"+TABLE01_COL6+" TEXT,"+TABLE01_COL7+" TEXT);" ;

    public Databasehelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(CREATE_TABLE_STATMENT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE01_NAME);
        onCreate(sqLiteDatabase);

    }
}
