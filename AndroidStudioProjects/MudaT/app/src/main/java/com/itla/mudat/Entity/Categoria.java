package com.itla.mudat.Entity;

/**
 * Created by wagne on 18/11/2017.
 */

public class Categoria {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int id;
    private String descripcion;
    private String nombre;
}
