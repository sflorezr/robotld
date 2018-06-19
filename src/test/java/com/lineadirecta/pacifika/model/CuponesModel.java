package com.lineadirecta.pacifika.model;

public class CuponesModel {
String usuaio,cupon,cantidad;

public String getUsuaio() {
	return usuaio;
}

public void setUsuaio(String usuaio) {
	this.usuaio = usuaio;
}

public String getCupon() {
	return cupon;
}

public void setCupon(String cupon) {
	this.cupon = cupon;
}

public String getCantidad() {
	return cantidad.replaceAll(".0", "");
}

public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}
}
