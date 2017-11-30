package com.itla.mudat.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by wagne on 25/11/2017.
 */

public class DbConnetion extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "mudat.db";
    public static String LOG_T = "dbconnetion";

    public DbConnetion(Context context) {
        super(context,DATABASE_NAME, null,   1 );

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_T, "Inciando onCreate...");
        db.execSQL(SqlHelperSchema.Usuario_Table);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
