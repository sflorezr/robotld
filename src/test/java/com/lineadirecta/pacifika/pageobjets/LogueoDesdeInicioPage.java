package com.lineadirecta.pacifika.pageobjets;	

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class LogueoDesdeInicioPage  extends PageObject{
	
	public void BotonIngresaroRegistrarme(){
		waitFor(2).seconds();
		findBy("(//A[@href='/login/iniciar-sesion'][text()=' Ingresar o Registrarme'][text()=' Ingresar o Registrarme'])[2]").and().click();
		Serenity.takeScreenshot();
	}
	public void DigitarCorreo(String correo){
//		correo=correo.replace("q", "@");
		waitFor(4).seconds();
		findBy(".//*[@id='j_username']").and().type(correo);
		Serenity.takeScreenshot();
	}
	public void Continuar(){		
		findBy(".//*[@id='pacifikaLoginForm']/div[2]/button").and().click();
		Serenity.takeScreenshot();
		
	}
	public void DigitarContrasena(String contrasena){
		findBy(".//*[@id='j_password']").and().type(contrasena);
		Serenity.takeScreenshot();
	}
	public void Ingresar(){
		try{
		findBy(".//*[@id='pacifikaLoginForm']/button").and().click();		
		}catch(Throwable t){
		//	findBy("/html/body/main/nav[2]/div[1]/div[3]/ul/li/a").and().click();
		}
		Serenity.takeScreenshot();
	}
	public void IraPagarPoslogueo() {
		try {
			findBy("//*[@class='btn btn-primary btn--continue-checkout js-continue-checkout-button']").click();
		}catch(Throwable t){
			
		}
	}
	public void Home(){
		findBy("//*[@id='navbar']/ul/li[1]/span/a").and().click();
		Serenity.takeScreenshot();
	}
	public void Nombre(String nombre){
		findBy("//*[@id='register.firstName']").and().type(nombre);
		Serenity.takeScreenshot();
	}
	public void Apellido(String apellido){
		findBy("//*[@id='register.lastName']").and().type(apellido);
		Serenity.takeScreenshot();
	}
	public void NPassword(String password){
		findBy("//*[@id='password']").and().type(password);
		Serenity.takeScreenshot();
	}
	public void ConfirmarPassword(String password){
		findBy("//*[@id='register.checkPwd']").and().type(password);
		Serenity.takeScreenshot();
	}
	public void Sexo(String tipo){
		if (tipo.equals("F")){
			findBy("//form[@id='extendedRegisterForm']/div[6]/div/div/span/label").and().click();
			        
		}else{
			findBy("//form[@id='extendedRegisterForm']/div[6]/div/div/span[2]/label").and().click();
		}
		Serenity.takeScreenshot();
	}
	public void CrearCuenta(){
		findBy("//*[@id='extendedRegisterForm']/div[8]/button").and().click();
		Serenity.takeScreenshot();
	}
	public void direccion(String direccion){
		waitFor(3).seconds();
		findBy("//*[@id='address.line1']").and().type(direccion);
		Serenity.takeScreenshot();
	}
	public void complemento(String complemento){
		findBy("//*[@id='address.line2']").and().type(complemento);
		Serenity.takeScreenshot();
	}
	public void barrio(String barrio){
		findBy("//*[@id='address.neighborhood']").and().type(barrio);
		Serenity.takeScreenshot();
	}
	public void destinatario(String destinatario){
		try {
			findBy("//*[@id='address-label']").and().type(destinatario);
		}catch(Throwable t) {			
		}
		Serenity.takeScreenshot();
		
	}
	public void comentario(String comentario){
		findBy("//*[@id='address.taken']").and().type(comentario);
		Serenity.takeScreenshot();
	}
	public void TipDoc(){
		findBy("//*[@id='register.identificationType']").and().selectByIndex(1);
		Serenity.takeScreenshot();
	}
	public void Cedula(String cedula){
		findBy("//*[@id='register.identificationNumber']").and().type(cedula);
		Serenity.takeScreenshot();
	}
	public void celular(String celular){
		findBy("//*[@id='register.mobileNumber']").and().type(celular);
		Serenity.takeScreenshot();
	}
	public void LogOut() {
		findBy("/html/body/main/nav[2]/div[1]/div[3]/ul/li[2]/a").and().click();
		Serenity.takeScreenshot();
	}
}
