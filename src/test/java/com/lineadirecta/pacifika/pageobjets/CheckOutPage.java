package com.lineadirecta.pacifika.pageobjets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import java.text.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.ibm.icu.text.DecimalFormat;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
   
public class CheckOutPage extends PageObject {
	String vali="0";
	JavascriptExecutor js = (JavascriptExecutor) getDriver();	
	public void NumTarjeta(String numero){
		waitFor(3).seconds();
		findBy("//*[@id='card_accountNumber']").and().type(numero);
		Serenity.takeScreenshot();
		findBy("//*[@id='card_accountNumber']").and().sendKeys(Keys.TAB);
		findBy("//*[@id='card_accountNumber']").and().click();
		findBy("//*[@id='card_accountNumber']").and().sendKeys(Keys.TAB);
		waitFor(1).seconds();
	}
	
	public void home(){
		findBy("/html/body/main/div[2]/div/div/div/a[1]/img").and().click();
		Serenity.takeScreenshot();
	}
	
	public void Mes(String Mes){
		waitFor(2).seconds();
		findBy("//*[@id=\"ExpiryMonth\"]").and().selectByVisibleText(Mes);
		Serenity.takeScreenshot();
	}
	public void ano(String ano){
		waitFor(1).seconds();
		findBy("//*[@id=\"ExpiryYear\"]").and().selectByVisibleText(ano);
	}
	public void NumVerificacion(String numverifica){
		waitFor(1).seconds();
		findBy("//*[@id=\"card_cvNumber\"]").and().type(numverifica);
	}
	public void Cuotas(String cuotas){
		waitFor(1).seconds();
		findBy("//*[@id=\"card_installments\"]").and().selectByVisibleText(cuotas);
	}
	public void titular(String titular){
		waitFor(1).seconds();
		findBy("//*[@id='card_nameOnCard']").and().type(titular);
	}
	public void TipoDoc(String tipo){
		waitFor(1).seconds();
		findBy("//*[@id='register_identificationType']").and().selectByVisibleText(tipo);
	}
	public void Documento(String documento){
		waitFor(1).seconds();
		findBy("//*[@id='register_identificationNumber']").and().type(documento);
	}
	public void Telefono(String telefono){
		waitFor(1).seconds();
		findBy("//*[@id='payerPhone']").and().type(telefono);		
	}
	public void Correo(String correo){
		waitFor(1).seconds();
		findBy("//*[@id='payerEmail']").and().type(correo);
	}
	public void PagarAhora(){
		waitFor(1).seconds();
		try {
		findBy("//*[@id=\"checkout-next-btn\"]").and().click();
		}catch(Throwable t) {
			try {
				findBy("//*[@id=\"checkout-next-btn\"]/strong").and().click();	
			}catch(Throwable n) {
				findBy("//*[@id=\"checkout-next-btn\"]/strong").and().click();
			}			
		}
		Serenity.takeScreenshot();
	
	}
	public void pagarAhora2(){
		waitFor(2).seconds();
		findBy("//*[@id=\"pacifikaAddressForm\"]/div[1]/div/div/button/strong").and().click();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		Serenity.takeScreenshot();
		js.executeScript("window.scrollTo(0,230)","");
		Serenity.takeScreenshot();
	}
	
	public void VerificaLabelFinal(String mensaje){
		Serenity.takeScreenshot();
		waitFor(500).millisecond();
		assertThat(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().getText(),containsString(mensaje));
	}
	public boolean MensajeFinal() {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().isVisible());
	}

	public void PagoContraEntrega(){
		waitFor(2).seconds();
		findBy("//*[@id='cash-on-delivery-form']/div/div/div/div/div/label/span").and().click();
		Serenity.takeScreenshot();
	}
	public boolean PagoContraEntregaVisible(){
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		return(findBy("//*[@id='cash-on-delivery-form']/div/div/div/div/div/label").and().isVisible());
		
	}	
	public void IraEfectivo() {
		waitFor(2).seconds();
		findBy("//*[@id='cash-form']/div/div/div/div/div/label/span").and().click();
		Serenity.takeScreenshot();
	}
	public boolean IraEF(){
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		return(findBy("//*[@id='cash-form']/div/div/div/div/div/label/span").and().isVisible());
	}	
	public boolean IraTC(){
		Serenity.takeScreenshot();
		return(findBy("//*[@id='credit-card-form']/div/div/div/div/div/label").and().isVisible());
	}	

	public boolean IraTD(){
		Serenity.takeScreenshot();
		return(findBy("//*[@id='debit-card-form']/div/div/div/div/div/label").and().isVisible());
	}		
	public boolean IraCE(){
		Serenity.takeScreenshot();
		return(findBy("//*[@id='cash-on-delivery-form']/div/div/div/div/div/label").and().isVisible());
	}	
	public boolean IraCR(){
		Serenity.takeScreenshot();
		return(findBy("//*[@id=\"consultant-credit-form\"]/div/div/div/div/div/label/span").and().isVisible());
	}	
	public void SeleccionaVia(String via){
		waitFor(2).seconds();
		if (via.equals("efecty")){
			findBy("//*[@id='silentOrderPostForm']/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div[1]/div[1]/label/span").and().click();			
		}else {
			findBy("//*[@id='silentOrderPostForm']/div[1]/div[2]/div[3]/div/div/div[1]/div[1]/div/div[1]/div[2]/label/span").and().click();
		}
		Serenity.takeScreenshot();
	}
	public void IraCredito() {
		waitFor(2).seconds();
		findBy("//*[@id='consultant-credit-form']/div/div/div/div/div/label/span").and().click();
		Serenity.takeScreenshot();
	}
	public int SaldoCredito() throws ParseException {
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num;
		Number total;
		int saldo=0;
		num = dF.parse(findBy("//*[@id=\"silentOrderPostForm\"]/div[1]/div[2]/div[4]/div/div[1]/p[1]/span[1]/span").and().getText().replace("$",""));
		total = dF.parse(findBy("//*[@id=\"silentOrderPostForm\"]/div[1]/div[2]/div[4]/div/div[1]/div[2]/span[2]/strong").and().getText().replace("$",""));
		if(num.doubleValue() <= total.doubleValue()) {
			saldo=0;
		}else {
			saldo=num.intValue()- total.intValue();
		}
		return(saldo);
	}
	public boolean CreditoVisible(){
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		return(findBy("//*[@id='consultant-credit-form']/div/div/div/div/div/label/span").and().isVisible());
	}	
	public double subtotal() throws Throwable{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num;
		try{
        num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[2]/div[1]/span[2]").and().getText().replace("$",""));        					   	
        }catch(Throwable e){
        	try {
        	num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[2]/span[2]").and().getText().replace("$",""));        						   	
        	}catch(Throwable t) {
        		num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[3]/div[1]/span[2]").and().getText().replace("$",""));
        	}
		}
		Serenity.takeScreenshot();
        return (num.doubleValue());
	}
	public String flete(){
		try {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[2]/div[2]/span[2]").and().getTextValue());
		}catch(Throwable t) {
			try {
			return(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[3]/div[3]/span[2]").and().getTextValue());
			}catch(Throwable t2) {
				return(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[3]/div[2]/span[2]").and().getTextValue());
			}
		}
		
	}				 
	public double total() throws Throwable{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
        num=dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[2]/div[3]/span").and().getText().replace("$",""));        				     
		}catch (Throwable t){
			num=dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[4]/strong").and().getText().replace("$",""));
		}
//        Number num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[4]/strong/div").and().getText().replace("$",""));
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Serenity.takeScreenshot();
		
        return (num.doubleValue());  
	}
	public double StoreCredit() throws ParseException{
 		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		double store=0;
		try{
		num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[3]/strong[2]").and().getText().replace("$", "").replace(".",""));
		}catch(Throwable t){
			try {
				num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[4]/strong[2]").and().getText().replace("$", "").replace(".",""));
				vali="1";
			}catch(Throwable n) {
				num=0;
			}
		}
		store=num.doubleValue();
		Serenity.takeScreenshot();
		return (store);
	}	
	public double Descuento() throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
			if (vali.equals("")) {
				num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[4]/strong[2]").and().getTextValue().replace("$", "").replace(".", ""));
			}else {
				num = dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div[1]/div/div/div[4]/strong[4]").and().getTextValue().replace("$", "").replace(".", ""));
			}							      
		}catch(Throwable t){
			num=0;
		}
		Serenity.takeScreenshot();
		return (num.doubleValue());		
	}	
	public double totalaPagar() throws Throwable{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
        num = dF.parse(findBy("//*[@id='orderTotal']").and().getText().replace("$",""));
		}catch(Throwable e){
			num = dF.parse(findBy("//*[@id='cashOnDeliveryTotal']").and().getText().replace("$",""));	
		}	
		Serenity.takeScreenshot();
        return (num.doubleValue());
	}
	public double totalaPagarCE() throws Throwable{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
        num = dF.parse(findBy("//*[@id='cashOnDeliveryTotal']").and().getText().replace("$",""));
		}catch(Throwable e){
			num = dF.parse(findBy("//*[@id='orderTotal']").and().getText().replace("$",""));	
		}	
		Serenity.takeScreenshot();
        return (num.doubleValue());
	}	
	public String Convenio(){
		waitFor(2).minutes();
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div[1]/div/p[2]/strong").and().getText());
	}	
	public String NrOrden(){
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		return(findBy("//div[@class='cod-confirmation-info-block']/..//p[1]/strong[1]").and().getText());		
	}
	public String NroOrdenSC() {
		waitFor(1).seconds();
		String numero=findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/p/b").and().getText();
		return(numero.substring(18,numero.length()));
	}
	public String alerta() {
		Serenity.takeScreenshot();
		return (findBy("/html/body/main/div[5]/div[1]").and().getText());
	}
	public String MensajePagoCredito(){
		Serenity.takeScreenshot();
		return(findBy("//h2").and().getText());
	}
	public String Orden() {
		Serenity.takeScreenshot();
		return (findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div[1]/p/b").and().getText());		
			            
	}
	public String mensajeST() {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div/h1/strong").and().getText());
	}
	public String OrdenEfectivo(){
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/div[2]/div/div[1]/div/div/section/div[2]/div[3]/div[1]/div/p[3]/b").and().getText());
	}
	public String MensajeStore(){
		waitFor(3).seconds();
		Serenity.takeScreenshot();
		return(findBy("//*[@id='silentOrderPostForm']/p").and().getText());
	}
	public void Sitengoaliada() {
		Serenity.takeScreenshot();
		findBy("//*[@id=\"checkoutChooseConsultantForm\"]/section/section/div[2]/div[2]/section/div/div[1]/div/label/span").and().click();
	}
	public void DigitoAliada(String aliada) {
		Serenity.takeScreenshot();
		findBy("//*[@id=\"consultantUsername\"]").and().type(aliada);		
	}
	public void ContinuarAliada(){		
		findBy("//*[@id=\"checkoutChooseConsultantForm\"]/div[1]/div/div/button").and().click();
		Serenity.takeScreenshot();
		waitFor(2).seconds();
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/div/div/div/div/form/div/button").and().click();
		Serenity.takeScreenshot();
	}
	public void cambiaraliada() {
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/div/div/section/div[2]/form/button").and().click();
	}
	public boolean CambiaresVisible() {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/div/div/section/div[2]/form/button").and().isVisible());
	}
	public boolean Nofeliz() {
		waitFor(3).seconds();
		Serenity.takeScreenshot();
		return(findBy("//*[@id=\"card_accountNumber_error_msg\"]").and().isVisible());		
	}
	public void Nofeliz2(String mensaje) {
		Serenity.takeScreenshot();
		assertThat(findBy("//*[@id=\"card_accountNumber_error_msg\"]").and().getText(),containsString(mensaje));		
		
	}
}
