package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.CompraTarjetaDebidoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class CompraTarjetaDebitoSteps {
	CompraTarjetaDebidoPage compraTarjetaDebidoPage;	
	@Step
	public void SeleccionaBanco(String banco){
		compraTarjetaDebidoPage.SeleccionaBanco(banco);
	}
	@Step
	public void DigitaCorreo(String correo){
		compraTarjetaDebidoPage.CorreoPSE(correo);
		compraTarjetaDebidoPage.IralBanco();
	}
	@Step 
	public void Debug(){
		compraTarjetaDebidoPage.Debug();
	}
	@StepGroup
	public void DatosPSE(String fecha,String estado, String Id){
		compraTarjetaDebidoPage.FechaTransaccion(fecha);
		compraTarjetaDebidoPage.EstadoResultado(estado);
		compraTarjetaDebidoPage.IdAutorizacion(Id);
		compraTarjetaDebidoPage.Call();
		compraTarjetaDebidoPage.RetornaraPSE();
	}
	@Step
	public void SeleccionaForma(){
		compraTarjetaDebidoPage.TarjetaDebito();
	}
	@Step
	public void VerificaMensaje(String mensaje,String tipo){
		compraTarjetaDebidoPage.Mensaje(mensaje,tipo);
	}
	@Step
	public String Orden(){
		return(compraTarjetaDebidoPage.Orden());
	}
	@Step
	public void RegistrarPSE(String documento,String nombre,String celular,String direccion,String email) {
		compraTarjetaDebidoPage.registrarPSE(documento, nombre, celular, direccion, email);
	}
}
