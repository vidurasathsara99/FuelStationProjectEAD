package com.example.fuelstationproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME="login.db";

    public DBHelper(Context context) {
        super(context,DBNAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users(email TEXT primary key, password TEXT, name TEXT, phone TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists users");
    }

    public Boolean insertData(String email,String pw,String name,String phone ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("email",email);
        values.put("password",pw);
        values.put("name",name);
        values.put("phone",phone);

        long result = db.insert("users",null,values);

        if(result == -1) return false;
        else
            return true;

    }

    public Boolean checkemail (String email){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where email=?",new String[] {email});
        if(cursor.getCount() >0){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean checkemailpw (String email,String pw){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where email=? and password=?",new String[] {email,pw});
        if(cursor.getCount() >0){
            return true;
        }
        else {
            return false;
        }
    }
}
