package com.example.arush.list1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by arush on 09-11-2016.
 */

public class DBAdapter {
    Context c;
    SQLiteDatabase db;
    DBHelper helper;

    public DBAdapter(Context c) {
        this.c = c;
        helper = new DBHelper(c);
    }

    public DBAdapter openDB() {
        try {
            db = helper.getWritableDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void closeDB() {
        try {
            helper.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public long add(String title, String det) {
        try {
            ContentValues cv = new ContentValues();
            cv.put(Constants.TITLE, title);
            cv.put(Constants.DETAILS, det);
            return db.insert(Constants.TABLE_NAME, Constants.ID, cv);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Cursor getinfo() {
        String[] columns = {Constants.TITLE, Constants.DETAILS};
        return db.query(Constants.TABLE_NAME, columns, null, null, null, null, null);
    }

     static ArrayList<todo> retrieve(Context context)
    {
        DBAdapter db = new DBAdapter(context);
        db.openDB();
        ArrayList list = new ArrayList();
        Cursor c = db.getinfo1();
        while (c.moveToNext())
        {
            String title = c.getString(0);
            String details= c.getString(1);
            todo p1 = new todo( 0, title, details);
            //ADD TO ARRAYLIS
            list.add(p1);
        }
        return list;
    }

    public Cursor getinfo1()
    {
        String[] columns={Constants.TITLE,Constants.DETAILS};
        return db.query(Constants.TABLE_NAME,columns,null,null,null,null,null);
    }
}