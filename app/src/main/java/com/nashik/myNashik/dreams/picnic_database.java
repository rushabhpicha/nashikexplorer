package com.nashik.myNashik.dreams;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class picnic_database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="picni1.db";
    public static final String TABLE_NAME="picni";
    public static final String col_1="id";
    public static final String col_2="city";
    public static final String col_3="placename";
    public static final String col_4="near_to";
    public static final String col_5="distance";
    public static final String col_6="description";

    public picnic_database(Context context) {
        super(context, DATABASE_NAME, null,7);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+" (_id integer primary key autoincrement,city TEXT,placename TEXT," +
                "near_to text,distance text,description text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String city,String placename,String near_to,String distance,String description)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col_2,city);
        contentValues.put(col_3,placename);
        contentValues.put(col_4,near_to);
        contentValues.put(col_5,distance);
        contentValues.put(col_6,description);

        long result=db.insert(TABLE_NAME,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }
}
