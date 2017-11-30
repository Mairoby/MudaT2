package com.itla.mudat.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat.Entity.Categoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagne on 29/11/2017.
 */

public class CategoriaDbo {
    private DbConnetion con;
    public CategoriaDbo(Context context) { con = new DbConnetion(context);}

    public void crear (Categoria categoria){
        SQLiteDatabase db = con.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("id", categoria.getId());
        cv.put("descripcion",categoria.getDescripcion());
        cv.put("nombre",categoria.getNombre());

        db.insert("categoria",null,cv);

        db.close();

    }
    public List<Categoria>buscar() {
        List<Categoria> categoria = new ArrayList<>();

        SQLiteDatabase db = con.getReadableDatabase();

        String columnas[] = new String[]{"id,descripcion,nombre"};

        Cursor cursor = db.query("categoria", columnas, null, null, null, null, null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            Categoria c = new Categoria();
            c.setId(cursor.getColumnIndex("id"));
            c.setDescripcion(cursor.getString(cursor.getColumnIndex("descripcion")));
            c.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));

            cursor.moveToFirst();
            db.close();
        }
        cursor.close();
        db.close();

        return categoria;
    }

}
