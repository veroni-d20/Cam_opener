package com.example.camopener;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHlpr extends SQLiteOpenHelper {

    SQLiteDatabase sql;
    public DbHlpr(@Nullable Context context) {

        super(context, "details.db", null, 1);
        sql = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =  "create table student(Name text, Location text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void savdetals(String s1,String s2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name",s1);
        contentValues.put("Location",s2);
        sql.insert("student",null,contentValues);
    }
}
