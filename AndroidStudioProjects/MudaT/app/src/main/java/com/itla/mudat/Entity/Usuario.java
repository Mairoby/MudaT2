package com.itla.mudat.Entity;

import java.io.Serializable;

/**
 * Created by wagne on 18/11/2017.
 */

public class Usuario implements Serializable{

  private int  Id;

	private String nombre;
	private Usuario tipodeusuario;
	private String identificacion;
	private String email;
	private String telefono;
	private String clave;
	private Boolean estatus;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getTipodeusuario() {
		return tipodeusuario;
	}

	public void setTipodeusuario(Usuario tipodeusuario) {
		this.tipodeusuario = tipodeusuario;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}


	@Override
	public String toString() {
		return "Usuario{" +
				"Id=" + Id +
				", nombre='" + nombre + '\'' +
				", tipodeusuario=" + tipodeusuario +
				", identificacion='" + identificacion + '\'' +
				", email='" + email + '\'' +
				", telefono='" + telefono + '\'' +
				", clave='" + clave + '\'' +
				", estatus=" + estatus +
				'}';
	}
}
