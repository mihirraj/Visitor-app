package com.example.mihir.visitorapp;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import android.database.Cursor;


/**
 * Created by mihir on 21-Oct-15.
 */
public class MyDBHandler extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "visitorsDB.db";
    private static final String TABLE_VISITORS = "visitors";
    //COLUMNS
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "visitorName";
    private static final String COLUMN_COMPANY = "companyName";
    private static final String COLUMN_TIMEIN = "timeIn";
    private static final String COULMN_TIMEOUT = "timeOut";
    private static final String COLUMN_PERSONSEE = "personSee";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    String CREATE_VISITOR_TABLE = "CREATE TABLE " +
            TABLE_VISITORS + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_NAME
            + " TEXT," + COLUMN_COMPANY + " INTEGER,"
            + COLUMN_TIMEIN + " TEXT," + COULMN_TIMEOUT + " TEXT," +
            COLUMN_PERSONSEE+ " TEXT" + ")";
     db.execSQL(CREATE_VISITOR_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VISITORS);
        onCreate(db);
    }

    public void addVisitors(Visitors visitors){

        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME,visitors.get_visitorName());
        values.put(COLUMN_COMPANY,visitors.get_visitorCompany());
        values.put(COLUMN_TIMEIN,visitors.get_timeIn());
        values.put(COULMN_TIMEOUT,visitors.get_TimeOut());
        values.put(COLUMN_PERSONSEE,visitors.get_personSee());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_VISITORS, null, values);
        db.close();

    }

    public void updateTimeout(Visitors visitors)
    {
        ContentValues values = new ContentValues();
        SQLiteDatabase db = this.getWritableDatabase();
        db.update(TABLE_VISITORS, values, "COLUMN_ID " + "=" + 1, null);
    }

    //printout results
    public void getVisitors()
    {
        String dbstring = "";
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_VISITORS + " WHERE 1";

        //CURSOR
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        while(!c.isAfterLast())
        {
            if (c.getString(c.getColumnIndex("visitors"))!=null)
            {
                //c.
            }
        }

    }


}
