package com.lineadirecta.pacifika.model;

import com.ibm.icu.text.DecimalFormat;

public class LogueoDesdeInicioModel {
	String Correo,contrasena,cedula,cedular,tipo,contrasenacorreo,nombre,apellido,direcccion,complemento,dane,barrio,comentario,sexo,storec,destinatario;
	String aliada,credito;
	
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public String getAliada() {
		return aliada;
	}
	public void setAliada(String aliada) {
		this.aliada = aliada;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCelular() {
		return cedular;
	}	
	public void setCelular(String cedular) {
		this.cedular = cedular;
	}
	public double getStorec() {
		try {
		DecimalFormat dF = new DecimalFormat("0.0");
		Number num = dF.parse(storec);
		return num.doubleValue();
		}catch(Throwable t) {
			return 0.00;
		}		
	}
	public void setStorec(String storec) {
		this.storec = storec;
	}
	public String getCorreo() {
		return Correo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getDane() {
		return dane;
	}
	public void setDane(String dane) {
		this.dane = dane;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getContrasenacorreo() {
		return contrasenacorreo;
	}
	public void setContrasenacorreo(String contrasenacorreo) {
		this.contrasenacorreo = contrasenacorreo;
	}
	public String getStrContrasenaCorreo() {
		return contrasenacorreo;
	}	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStrCorreo() {
		return Correo;
	}
	public void setStrCorreo(String correo) {
		this.Correo = correo;
	}	
	public String getStrContrasena() {
		return contrasena;
	}	
	public void setStrContrasena(String Pass) {
		this.contrasena =Pass;
	}	
}
