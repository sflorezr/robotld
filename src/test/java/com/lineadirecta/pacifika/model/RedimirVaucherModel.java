package com.lineadirecta.pacifika.model;

import java.text.ParseException;

import com.ibm.icu.text.DecimalFormat;

public class RedimirVaucherModel {
	String codigo,tipo, valor,mensaje,usuarios,maxred,maxredxp,redimidos,fecha,mensajedr,mensajedf,mensajer;
	
	public String getMaxredxp() {
		return maxredxp;
	}
	public void setMaxredxp(String maxredxp) {
		this.maxredxp = maxredxp;
	}
	public String getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}
	public String getMaxred() {
		return maxred;
	}
	public void setMaxred(String maxred) {
		this.maxred = maxred;
	}
	public String getRedimidos() {
		return redimidos;
	}
	public void setRedimidos(String redimidos) {
		this.redimidos = redimidos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMensajedr() {
		return mensajedr;
	}
	public void setMensajedr(String mensajedr) {
		this.mensajedr = mensajedr;
	}
	public String getMensajedf() {
		return mensajedf;
	}
	public void setMensajedf(String mensajedf) {
		this.mensajedf = mensajedf;
	}
	public String getMensajer() {
		return mensajer;
	}
	public void setMensajer(String mensajer) {
		this.mensajer = mensajer;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() throws ParseException {
		try {
		DecimalFormat dF = new DecimalFormat("0.0");
		Number num = dF.parse(valor);
		return num.doubleValue();
		}catch(Throwable t) {
			return 0.00;
		}
	}
	public void setValor(String valor) {
		this.valor = valor;
	}

}
