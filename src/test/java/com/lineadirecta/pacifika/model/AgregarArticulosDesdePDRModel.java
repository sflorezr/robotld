package com.lineadirecta.pacifika.model;

public class AgregarArticulosDesdePDRModel {
	String categoria,subcategoria,talla,codigo,posicion,plu;
	public String getPlu() {
		return plu;
	}
	public void setPlu(String plu) {
		this.plu = plu;
	}
	int cantidad;

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {		
		try{
		this.cantidad = Integer.parseInt(cantidad);
		}catch (Throwable e){
			this.cantidad = 0;
		}
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}
