package com.itla.mudat.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat.Entity.Anuncio;
import com.itla.mudat.Entity.Categoria;
import com.itla.mudat.Entity.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagne on 28/11/2017.
 */

public class AnuncioDbo {
    private DbConnetion con;
    public AnuncioDbo(Context context){con = new DbConnetion(context); }
    private static final SimpleDateFormat Df = new SimpleDateFormat("dd-mm-yy");

    public void crear (Anuncio anuncio){
        SQLiteDatabase db = con.getReadableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("id",anuncio.getId());
        //cv.put("id_usuario",  anuncio.getId_Usuario());
       // cv.put("id_categoria", anuncio.getId_Categoria());
        cv.put("fecha", Df.format(anuncio.getFecha()));
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

        Cursor cursor = db.rawQuery("SELECT a,*, u.nombre as u_nombre, c.descripcion" +
                " FROM anucio  a, usario u, categoria c"+
                " WHERE a.id_usuario = u.id AND a.id_categoria = c.id",null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){

            Anuncio a = new Anuncio();
            Usuario usuario = new Usuario();
            Categoria categoria = new Categoria();

            usuario.setId(cursor.getInt(cursor.getColumnIndex("id_usuario")));
            usuario.setNombre(cursor.getString(cursor.getColumnIndex("u_nombre")));

            a.setUsuario(usuario);
            a.setId(cursor.getInt(cursor.getColumnIndex("id")));
           // a.setId_Categoria(cursor.getString(cursor.getColumnIndex("id_categoria")));
            a.setCondición(cursor.getString(cursor.getColumnIndex("condicion")));
            a.setDetalle(cursor.getString(cursor.getColumnIndex("detalle")));
            a.setPrecio(cursor.getDouble(cursor.getColumnIndex("precio")));
            a.setTitulo(cursor.getString(cursor.getColumnIndex("titulo")));
            a.setUbicacion(cursor.getString(cursor.getColumnIndex("ubicacion")));
          //  a.setUsuario(cursor.getString(cursor.getColumnIndex("usuario")));
            try {
                a.setFecha(Df.parse(cursor.getString(cursor.getColumnIndex("fecha"))));
            } catch (ParseException e) {
                e.printStackTrace();
            }


            cursor.moveToNext();
            anuncio.add(a);
        }
        cursor.close();
        db.close();

        return anuncio;
    }


}
