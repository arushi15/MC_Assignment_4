package com.example.arush.list1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by arush on 09-11-2016.
 */


public class DBHelper extends SQLiteOpenHelper
{
    public DBHelper(Context context)
    {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
            db.execSQL(Constants.CREATE_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLE_NAME);
        onCreate(db);
    }
}