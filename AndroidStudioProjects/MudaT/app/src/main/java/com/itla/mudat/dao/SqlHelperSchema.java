package com.itla.mudat.dao;

/**
 * Created by wagne on 25/11/2017.
 */

public class SqlHelperSchema {

    public static final String Usuario_Table = "CREATE TABLE usuario ( id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT NOT NULL, tipo_usuario TEXT NOT NULL, email TEXT NOT NULL, telefono NUMERIC NOT NULL, clave NUMERIC NOT NULL\n" +
            ")";

    public static final String Anuncio_Table = "CREATE TABLE Anuncio ( id	INTEGER PRIMARY KEY AUTOINCREMENT, id_categoria	INTEGER NOT NULL, id_usuario INTEGER NOT NULL, fecha NUMERIC NOT NULL, condicion	TEXT NOT NULL, precio REAL NOT NULL, titulo	TEXT NOT NULL, ubicacion	TEXT NOT NULL, detalles	TEXT NOT NULL\n" +
")";

public static  final String Categoria_Table ="CREATE TABLE IF NOT EXISTS `Categoia` (Id	INTEGER PRIMARY KEY AUTOINCREMENT, Nombre TEXT NOT NULL,Descripion EXT NOT NULL\n" +
")";


}
