package com.itla.mudat.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import com.itla.mudat.Entity.TipodeUsuario;
import com.itla.mudat.Entity.Usuario;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wagne on 25/11/2017.
 */

public class UsuarioDbo {
    private DbConnetion con;
    public UsuarioDbo(Context context) {
        con = new DbConnetion(context);
    }

    public void crear(Usuario usuario){


        ContentValues cv = new ContentValues();
       // cv.put("id",usuario.getId());
        cv.put( "nombre", usuario.getNombre());
        cv.put("clave", usuario.getClave());
        cv.put("email", usuario.getEmail());
      //  cv.put("estatus", true);
        cv.put("telefono", usuario.getTelefono());
       // cv.put("tipo_usuario", TipodeUsuario.Cliente.toString());

        SQLiteDatabase db = con.getWritableDatabase();

        if (usuario.getId()== 0) {
            Long id = db.insert("usuario", null, cv);

        }else{
            db.update("usuario",cv,"id = "+usuario.getId(),null);
    }

        db.close();

    }
    public List<Usuario>buscar(){
        List<Usuario> usuario = new ArrayList<>();

        SQLiteDatabase db = con.getReadableDatabase();

        String columnas [] = new String[] {"id,nombre,clave,email,telefono"};

        Cursor cursor = db.query( "usuario", columnas, null,null,null,null,null  );

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Usuario u  =  new Usuario();
            u.setId(cursor.getColumnIndex("id"));
            u.setNombre(cursor.getString(cursor.getColumnIndex("nombre")));
            u.setClave(cursor.getString(cursor.getColumnIndex("clave")));
            u.setEmail(cursor.getString(cursor.getColumnIndex("email")));
           // u.setEstatus(cursor.getString(cursor.getColumnIndex("estatus")));
            u.setTelefono(cursor.getString(cursor.getColumnIndex("telefono")));

            cursor.moveToNext();
            usuario.add(u);


        }
        cursor.close();
        db.close();

        return usuario;


    }
}
