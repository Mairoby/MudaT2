package com.itla.mudat.Entity;

import java.util.Date;

/**
 * Created by wagne on 18/11/2017.
 */

public class Anuncio {
    public static byte[] getGet() {
        return get;
    }

    public static void setGet(byte[] get) {
        Anuncio.get = get;
    }

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
        return Condición;
    }

    public void setCondición(String condición) {
        Condición = condición;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public static byte[] get;
    private int id;
    private  Categoria categoria;
    private Usuario usuario;
    private Date fecha;
    private String Condición;
    private Double precio;
    private String Titulo;
    private String ubicacion;
   private String Detalle;

    public int getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        Id_Categoria = id_Categoria;
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    private int Id_Categoria;
   private int Id_Usuario;

}
