package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.Generales;
import com.lineadirecta.pacifika.pageobjets.LogisiticaPage;
import com.lineadirecta.pacifika.pageobjets.LogueoDesdeInicioPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class LogueoDesdeInicioSteps {
	LogueoDesdeInicioPage logueoDesdeInicioPage = new LogueoDesdeInicioPage();
	LogisiticaPage logisiticaPage;
	Generales	general;
	@Step
	public void AbrirPaginaLogueo(){
		general.open();
		//general.exceptionie();
		logueoDesdeInicioPage.BotonIngresaroRegistrarme();
	}
	@Step
	public void paginaLogueo(){
		logueoDesdeInicioPage.BotonIngresaroRegistrarme();
	}
	@StepGroup
	public void DigitarCorreo(String correo){	
		try{
		logueoDesdeInicioPage.DigitarCorreo(correo);
		}catch(Throwable e){			
			logueoDesdeInicioPage.Home();
			logueoDesdeInicioPage.BotonIngresaroRegistrarme();
			logueoDesdeInicioPage.DigitarCorreo(correo);
		}
		logueoDesdeInicioPage.Continuar();
	}
	@StepGroup
	public void DigitarContrasena(String contrasena){
		logueoDesdeInicioPage.DigitarContrasena(contrasena);
		logueoDesdeInicioPage.Ingresar();
		logueoDesdeInicioPage.IraPagarPoslogueo();
	}
	@Step
	public void Ingresar(){		
		logueoDesdeInicioPage.Ingresar();
	}
	@Step
	public void LogOuteIngresar() {
		logueoDesdeInicioPage.LogOut();
		logueoDesdeInicioPage.Ingresar();
	}
	@StepGroup
	public void UsuarioNuevo(String nombre,String apellido,String contrasena,String tipo){
		logueoDesdeInicioPage.Nombre(nombre);
		logueoDesdeInicioPage.Apellido(apellido);
		logueoDesdeInicioPage.NPassword(contrasena);
		logueoDesdeInicioPage.ConfirmarPassword(contrasena);
		logueoDesdeInicioPage.Sexo(tipo);
		logueoDesdeInicioPage.CrearCuenta();
	}
	@StepGroup
	public void Logistica(String direccion, String complemento, String dane, String barrio, String comentario,String destinatario) {
		logueoDesdeInicioPage.direccion(direccion);
		if (!complemento.equals("")) {
			logueoDesdeInicioPage.complemento(complemento);
		}
		if (!dane.equals("")) {
			logisiticaPage.SeleccionaDepto(dane);
			logisiticaPage.SeleccionaCity(dane);
		}
		
		if (!barrio.equals("")) {
			logueoDesdeInicioPage.barrio(barrio);
		}
		if (!destinatario.equals("")) {
			logueoDesdeInicioPage.destinatario(destinatario);
		}
			
		if (comentario != null) {
			logueoDesdeInicioPage.comentario(comentario);	
		}
				
	}
	@StepGroup
	public void Datos(String cedula,String celular){
		logueoDesdeInicioPage.TipDoc();
		logueoDesdeInicioPage.Cedula(cedula);
		logueoDesdeInicioPage.celular(celular);
	}
	@Step
	public void verificarDireccion() {
		
		logisiticaPage.verificarDireccion();
	}
}
