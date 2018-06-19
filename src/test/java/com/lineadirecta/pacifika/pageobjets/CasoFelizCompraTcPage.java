package com.lineadirecta.pacifika.pageobjets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://stage.pacifika.com/")
public class CasoFelizCompraTcPage extends PageObject {
	public void BotonVerOrden(){
		findBy(".//*[@id='CartContainer']/div[2]/div/div/div/div[2]/a").and().click();
		Serenity.takeScreenshot();
	}
	public void BotonMiniCar(){
		findBy(".//*[@id='cart-toggle']/span").and().click();
		Serenity.takeScreenshot();
	}	
	public void TextBoxCorreo(String correo){
		findBy(".//*[@id='navbar']/ul/li[3]/div/a").and().type(correo);
		Serenity.takeScreenshot();
	}
	public void BotonCerrarMinicar(){
		findBy("//*[@id='closeCart']").and().click();
		Serenity.takeScreenshot();
	}
	public void BotonContinuar(){
		findBy(".//*[@id='pacifikaLoginForm']/div[2]/button").and().click();
		Serenity.takeScreenshot();
	}
	public void TextBoxPassword(String contrasena){
		findBy(".//*[@id='j_password']").and().type(contrasena);
		Serenity.takeScreenshot();
	}	
	public void BotonIniciarSesion(){
		findBy(".//*[@id='pacifikaLoginForm']/button").and().click();
		Serenity.takeScreenshot();
	}
	public void BotonIraPagar(){
		findBy(".//*[@id='cart-bottom']/div/div[2]/div[2]/div/div/div[2]/button").and().click();
		Serenity.takeScreenshot();
	}			
	public void BotonContinar(){
		findBy(".//*[@id='checkoutRegisterForm']/div[1]/div/div/button").and().click();
		Serenity.takeScreenshot();
	}			
	public void BotonContinar2(){
		findBy(".//*[@id='checkoutChooseConsultantForm']/div[1]/div/div/button").and().click();
		Serenity.takeScreenshot();
	}						
	public void BotonIraPagarCheckOut(){
		findBy(".//*[@id='pacifikaAddressForm']/div[1]/div/div/button").and().click();
		Serenity.takeScreenshot();
	}				
	public void BotonCambiarAliada(){
		findBy("html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/div/div/section/div[2]/form/button").and().click();
	}						
	public void LinkTextDatosP(){
		findBy("html/body/main/div[5]/div[2]/section/div[2]/div/a/div").and().click();
		Serenity.takeScreenshot();
	}
	public void TextBoxNombres(String nombres){
		findBy(".//*[@id='register.firstName']").and().type(nombres);
		Serenity.takeScreenshot();
	}
	public void TextBoxApellidos(String apellidos){		
		findBy(".//*[@id='register.lastname']").and().type(apellidos);
		Serenity.takeScreenshot();
	}	
	public void TextBoxCelular(String celular){
		findBy(".//*[@id='register.mobileNumber']").and().type(celular);
		Serenity.takeScreenshot();
	}
	public void CheckFemenino(){
		findBy(".//*[@id='checkoutRegisterForm']/section/div[4]/div[2]/div/div/div/span[1]/label").and().click();
		Serenity.takeScreenshot();
	}
	public void CheckMasculino(){
		findBy(".//*[@id='checkoutRegisterForm']/section/div[4]/div[2]/div/div/div/span[1]/label").and().click();
		Serenity.takeScreenshot();
	}	
	public void CheckNoTengoAliada(){
		findBy(".//*[@id='checkoutChooseConsultantForm']/section/section/div[2]/div[1]/section/div/div/label/span").and().click();
		Serenity.takeScreenshot();
	}		
	public void CheckSiTengoAliada(){
		findBy(".//*[@id='checkoutChooseConsultantForm']/section/section/div[2]/div[2]/section/div/div[1]/div/label/span").and().click();
		Serenity.takeScreenshot();
	}				
	public void TextBoxAliada(String aliada){
		findBy(".//*[@id='consultantUsername']").and().type(aliada);
		Serenity.takeScreenshot();
	}
	public void LinkTextSeleccionAliada(){
		findBy("html/body/main/div[5]/div[2]/section/div[2]/div/a[2]/div").and().click();
		Serenity.takeScreenshot();
	}			
	public void LinkTextUbicacion(){
		findBy("html/body/main/div[5]/div[2]/section/div[2]/div/a[3]/div").and().click();
		Serenity.takeScreenshot();
	}	
	public void ListBoxDirecciones(String direccion){
		findBy(".//*[@id='address-label-select']").and().selectByValue(direccion);
		Serenity.takeScreenshot();
	}
	public void TextBoxDireccion(String direccion){
		findBy(".//*[@id='address.line1']").and().type(direccion);
	}
	public void TextBoxComplemento(String complemento){
		findBy(".//*[@id='address.line2']").and().type(complemento);
		Serenity.takeScreenshot();
	}
	public void ListBoxDepartamento(String departamento){
		findBy(".//*[@id='address-department']").and().selectByValue(departamento);
		Serenity.takeScreenshot();
	}	
	public void ListBoxMunicipio(String minucipio){
		findBy(".//*[@id='address-city']").and().selectByValue(minucipio);
		Serenity.takeScreenshot();
	}		
	public void TextBoxBarrio(String barrio){
		findBy(".//*[@id='address.neighborhood']").and().type(barrio);
		Serenity.takeScreenshot();
	}
	public void TextBoxComentario(String comentario){
		findBy(".//*[@id='address.taken']").and().type(comentario);
		Serenity.takeScreenshot();
	}
	public void CheckTarjetaCredito(){
		findBy(".//*[@id='credit-card-form']/div/div/div/div/div/label/span").and().click();
		Serenity.takeScreenshot();
	}
	public void ListBoxTarjetaCredito(String numero){
		findBy(".//*[@id='card_cardType_select']").and().selectByValue(numero);		
		Serenity.takeScreenshot();
	}
	public void TextBoxNumero(String numero){
		findBy(".//*[@id='card_accountNumber']").and().type(numero);	
		Serenity.takeScreenshot();
	}
	public void ListBoxMes(String mes){
		findBy(".//*[@id='ExpiryMonth']").and().selectByValue(mes);
	}
	public void ListBoxAno(String ano){
		findBy(".//*[@id='ExpiryYear']").and().selectByValue(ano);
	}
	public void ListBoxNcuotas(String nCuotas){
		findBy(".//*[@id='card_installments']").and().selectByValue(nCuotas);
	}
	public void TextBoxNumeroVerificacion(String numero){
		findBy(".//*[@id='card_cvNumber']").and().type(numero);		
	}
	public void TextBoxTitular(String titular){
		findBy(".//*[@id='register_identificationType']").and().type(titular);	
	}	
	public void ListBoxTipDocumento(String tipo){
		findBy(".//*[@id='register_identificationType']").and().selectByValue(tipo);		
	}		
	public void TextBoxDocumento(String documento){
		findBy(".//*[@id='register_identificationNumber']").and().type(documento);		
	}		
	public void TextBoxTelef(String telefono){
		findBy(".//*[@id='payerPhone']").and().type(telefono);		
	}
	public void TextBoxCorreoTC(String correo){
		findBy(".//*[@id='payerEmail']").and().type(correo);	
		Serenity.takeScreenshot();
	}	
	public void CheckGuardar(){
		findBy(".//*[@id='save-payment-card']/div[1]/div/label/span").and().click();
		Serenity.takeScreenshot();
	}	
	public void CheckRebicibirExtracto(){
		findBy(".//*[@id='silentOrderPostForm']/div[1]/div[2]/div[1]/div/div[12]/div/div/label/span").and().click();
	}	
	public void BotonIraPagarFinal(){
		findBy(".//*[@id='checkout-next-btn']").and().click();
		Serenity.takeScreenshot();
	}
	public void LabelErrorTarjeta(){
		findBy("//*[@id='card_accountNumber_error_msg']").and().getText();
		Serenity.takeScreenshot();
	}
	public void LabelPedido(){
		findBy("/html/body/main/div[5]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/h3/span/span").and().getText();
		Serenity.takeScreenshot();
	}	
	public void LabelExitoTC(){
		findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().getText();
	}
	public void LabelPrecioNeto(Integer posicion){
		findBy("/html/body/main/div[5]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/table/tbody[1]/tr["+Integer.toString(posicion)+"]/td[5]/div/h4").and().getText();
	}
	public void BotonEliminar(Integer posicion){
		findBy("//*[@id='removeEntry_"+Integer.toString(posicion)+"']").and().click();
	}
	public void LabelSubtotal(){
		findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/h4").and().getText();
	}	
	public void LabelTotal(String Descuento){
		if (Descuento.equals("S")){			
			findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[3]/div[2]/h3").and().getText();
		}else {
			findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h3").and().getText();
		}	
		Serenity.takeScreenshot();
	}	
	public void LabelSubTotalFinal(){
		findBy("html/body/main/div[5]/div[2]/section/div[3]/div/div[3]/div[1]/span[2]").and().getText();
	}
	public void LabelTotalFinal(){
		findBy("html/body/main/div[5]/div[2]/section/div[3]/div/div[3]/div[1]/span[2]").and().getText();
	}
	public void LabelTotalTotal(){
		findBy(".//*[@id='orderTotal']").and().getText();
	}	
	public void VerificaLabelFinal(String mensaje){
		assertThat(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().getText(),containsString(mensaje));
	}
}
