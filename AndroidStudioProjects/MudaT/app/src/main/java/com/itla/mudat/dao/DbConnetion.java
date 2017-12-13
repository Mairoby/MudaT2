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
        super(context,DATABASE_NAME, null,   2 );

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_T, "Inciando onCreate...");
        db.execSQL(SqlHelperSchema.Usuario_Table);
        db.execSQL(SqlHelperSchema.Categoria_Table);
        db.execSQL(SqlHelperSchema.Anuncio_Table);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE usuario");
        this.onCreate(db);
        db.execSQL("DROP TABLE Categoria");
        this.onCreate(db);
        db.execSQL("DROP TABLE Anuncio");
        this.onCreate(db);
    }

}
