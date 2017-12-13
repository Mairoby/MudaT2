package com.itla.mudat.Entity;

import java.util.Date;

/**
 * Created by wagne on 18/11/2017.
 */

public class Anuncio {

    private int id;
    private Categoria categoria;
    private Usuario usuario;
    private Date fecha;
    private String condición;
    private Double precio;
    private String titulo;
    private String ubicacion;
   private String detalle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCondición() {
        return condición;
    }

    public void setCondición(String condición) {
        this.condición = condición;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public  void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public  void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setCategoria(String s) {
    }

    public void setUsuario(String s) {
    }

    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCondicion(String s) {
    }

    public void setPrecio(String s) {
    }
}
