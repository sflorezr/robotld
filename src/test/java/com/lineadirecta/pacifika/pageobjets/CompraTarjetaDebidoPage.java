package com.lineadirecta.pacifika.pageobjets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class CompraTarjetaDebidoPage extends PageObject {
	//objetos para registro de PSE por primera vez
	
	String btnQuieroRegistrarme="//*[@id='all']/div/div[3]/label[2]";
	String txtDocumento="//input[@id='txtNumeroIdentificacion']";
	String txtNombre="//input[@id='txtNombre']";
	String txtCelular="//input[@id='txtNumeroCelular']";
	String txtDireccion="//input[@id='txtDireccionPN']";
	String txtEmail="//input[@id='txtEMail']";
	String txtEmailConfirmacion="//input[@id='txtEMailConfirmacion']";
	String txtRespuesta="//input[@id='txtRespuestaPregunta1']";
	String checkAcepto="//input[@id='chkDisclaimer']";
	String btnRegistrar="//*[@id='all']/div[3]/div[9]/div/div[1]/div/div/div[2]";
	String btnAceptar="//button[@class='btn btn-default']";
	String btnRegresar="//*[@id='btnRegresar']";
	
	
	public void registrarPSE(String documento,String nombre,String celular,String direccion,String email) {
		waitFor(1).seconds();
		findBy("//*[@id='PNEMail']").and().type(email);
		findBy(btnQuieroRegistrarme).click();
		waitFor(1).seconds();
		findBy(txtDocumento).type(documento);
		findBy(txtNombre).type(nombre);
		findBy(txtCelular).type(celular);
		findBy(txtDireccion).type(direccion);
		findBy(txtEmail).type(email);
		findBy(txtEmailConfirmacion).type(email);
		findBy(txtRespuesta).type("pacifika");
		findBy(checkAcepto).click();
		Serenity.takeScreenshot();
		waitFor(2).seconds();
		findBy(btnRegistrar).click();
		waitFor(1).seconds();
		try {
		getDriver().switchTo().alert().accept();
		findBy(btnRegresar).click();
		waitFor(2).seconds();
		findBy("//*[@id='PNEMail']").and().type(email);

		findBy("//*[@id='btnSeguir']").and().click();
		}catch(Throwable t) {
			waitFor(10).seconds();
			findBy(btnAceptar).click();
			
		}		
	}
	

	
	public void TarjetaDebito(){
		waitFor(3).seconds();	
		try {
		findBy("//*[@id='paymentMethod_PSE']/..//span").and().click();
		}catch(Throwable t) {
			findBy("//*[@id='debit-card-form']/div/div/div/div/div/label/span").and().click();
		}
		Serenity.takeScreenshot();
		waitFor(2).seconds();
	}
	public void SeleccionaBanco(String banco){
		waitFor(2).seconds();
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div/select").and().click();
		Serenity.takeScreenshot();
		waitFor(2).seconds();
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/div[1]/div[2]/div[2]/div/div/div[1]/div[1]/div/select").and().selectByVisibleText(banco);
		Serenity.takeScreenshot();        
	}
	public void CorreoPSE(String correo){
		waitFor(2).seconds();
		findBy("//*[@id='PNEMail']").and().type(correo);
		Serenity.takeScreenshot();
	}
	public void IralBanco(){
		waitFor(2).seconds();
		findBy("//*[@id='btnSeguir']").and().click();
		Serenity.takeScreenshot();
		waitFor(2).seconds();
	}
	public void Debug(){
		waitFor(2).seconds();
		findBy("//*[@id='btnDebug']").and().click();
		Serenity.takeScreenshot();
	}
	public void FechaTransaccion(String fecha){
		findBy("//*[@id='txtBankProcessDate']").and().type(fecha);
		Serenity.takeScreenshot();
	}
	public void EstadoResultado(String resultado){
		findBy("//*[@id='ddTransactionState']").and().selectByVisibleText(resultado);
		Serenity.takeScreenshot();
	}
	public void IdAutorizacion(String Id){
		findBy("//*[@id='txtAuthorizationID']").and().type(Id);
		Serenity.takeScreenshot();
	}
	public void Call(){
		waitFor(2).seconds();
		findBy("//*[@id='btnCall']").and().click();
		Serenity.takeScreenshot();
	}
	public String MensajeCall(){
		Serenity.takeScreenshot();
		return(findBy("//*[@id='lblMessage']").and().getText());
	}
	public void RetornaraPSE(){
		waitFor(2).seconds();
		findBy("//*[@id='btnReturnToPPE']").and().click();
		Serenity.takeScreenshot();
	}
	public void Mensaje(String mensaje,String tipo){
		if (tipo.equals("feliz")) {
			assertThat(mensaje,containsString(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().getText()));	
		}else {
			assertThat(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[4]/div[1]/h1/b").and().getText(),containsString(mensaje));
		}
		Serenity.takeScreenshot();
	}
	public String Orden(){
		WebDriver driver = getDriver();
		String orden2=driver.getCurrentUrl().substring(driver.getCurrentUrl().length()-8,driver.getCurrentUrl().length());
		Serenity.takeScreenshot();
		return(orden2);
	}
}
