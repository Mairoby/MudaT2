package com.itla.mudat.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat.Entity.Anuncio;
import com.itla.mudat.Entity.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagne on 28/11/2017.
 */

public class AnuncioDbo {
    private DbConnetion con;
    public AnuncioDbo(Context context){con = new DbConnetion(context); }

    public void crear (Anuncio anuncio){
        SQLiteDatabase db = con.getReadableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("id",anuncio.getId());
        cv.put("id_usuario",  anuncio.getId_Usuario());
        cv.put("id_categoria", anuncio.getId_Categoria());
        //cv.put("fecha", anuncio.getFecha());
        cv.put("condicion", anuncio.getCondición());
        cv.put("detalle", anuncio.getDetalle());
        cv.put("precio", anuncio.getPrecio());
        cv.put("titulo", anuncio.getTitulo());
        cv.put("ubicacion", anuncio.getUbicacion());

        db.insert("anuncio", null,cv);

        db.close();

    }
    public List<Anuncio>buscar(){
        List<Anuncio> anuncio = new ArrayList<>();

        SQLiteDatabase db = con.getReadableDatabase();

        String columnas [] = new String[] {"id,id_usuario,id_categoria,condicion,detalle,precio,titulo,ubicacion"};

        Cursor cursor = db.query("usuario", columnas, null,null,null,null,null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Anuncio a = new Anuncio();
            a.setId(cursor.getColumnIndex("id"));
           // a.setId_Categoria(cursor.getString(cursor.getColumnIndex("id_categoria")));
            a.setCondición(cursor.getString(cursor.getColumnIndex("condicion")));
            a.setDetalle(cursor.getString(cursor.getColumnIndex("detalle")));
           // a.setPrecio(cursor.getString(cursor.getColumnIndex("precio")));
            a.setTitulo(cursor.getString(cursor.getColumnIndex("titulo")));
            a.setUbicacion(cursor.getString(cursor.getColumnIndex("ubicacion")));

            cursor.moveToNext();
            anuncio.add(a);
        }
        cursor.close();
        db.close();

        return anuncio;
    }


}
