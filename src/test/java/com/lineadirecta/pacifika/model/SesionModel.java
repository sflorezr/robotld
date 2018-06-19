package com.lineadirecta.pacifika.model;

public class SesionModel {
	
public static String contrasena="";
public static String correo="";
public static String orden="";
public static String ruta="";
public static int posicion=0;
public static String cupon="";
public static String tipo="";
public static String rutacupones="";
public static String nombre="";
public static String documento="";
public static String direccion="";
public static String celular="";

	public static String getRuta() {
	return ruta;
}
public static void setRuta(String ruta) {
	SesionModel.ruta = ruta;
}
	public static String getOrden() {
	return orden;
}
public static void setOrden(String orden) {
	SesionModel.orden = orden;
}
	public static void setCorreo(String correo) {
		SesionModel.correo = correo;
	}
	public void setContrasena(String contrasena) {
		SesionModel.contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public String getContrasena() {
		return contrasena;
	}
}
