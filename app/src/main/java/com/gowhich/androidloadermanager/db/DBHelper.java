package com.gowhich.androidloadermanager.db;

import android.content.ContentProvider;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by durban126 on 16/9/27.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static String name = "person.db";
    private static int version = 1;

    public DBHelper(Context context) {
        super(context, name, null, version);
    }

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table person (pid integer primary key autoincrement, name varchar(45), age varchar(45))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
