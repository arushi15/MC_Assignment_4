package com.example.arush.list1;

/**
 * Created by arush on 09-11-2016.
 */

public class Constants
{
    static final String ID="id";
    static final String TITLE = "title";
    static final String DETAILS="details";
    //static final String POSITION = "position";
    //DB PROPERTIES
    static final String DB_NAME="listdatabase";
    static final String TABLE_NAME="listtable";
    static final int DB_VERSION='1';
    static final String CREATE_TABLE="CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
            " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TITLE + " TEXT, " +
            DETAILS + " TEXT )";
}
