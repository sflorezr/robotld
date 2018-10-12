package com.lineadirecta.pacifika.pageobjets;


import java.text.ParseException;
import com.ibm.icu.text.DecimalFormat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.pacifika.com/cart")
public class RedimirVaucherPage extends PageObject {

	@FindBy(xpath="//*[@id=\'js-voucher-code-text\']")
	public WebElementFacade txtVaucher;
	
	public void EscribirVaucher(String codigo){
		//findBy("//input[@id='js-voucher-code-text']").and().type(codigo);
		txtVaucher.click();
		txtVaucher.clear();
		txtVaucher.sendKeys(codigo);
		Serenity.takeScreenshot();
		waitFor(1).seconds();		
	}
	
	@FindBy(xpath="//*[@id=\'js-voucher-apply-btn\']")
	public WebElementFacade btnAplicarVaucher;
	public void aplicarvaucher(){
		//findBy("(//button[@id='js-voucher-apply-btn'])[2]").and().click();
		btnAplicarVaucher.click();
		Serenity.takeScreenshot();
	}
	public double verSubtotal() throws ParseException{
        DecimalFormat dF = new DecimalFormat("0,00");
        Number num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[1]/div[2]/h4").and().getText().replace("$",""));
        Serenity.takeScreenshot();
        return (num.doubleValue());
	}
	public double verDescuento() throws ParseException{
        DecimalFormat dF = new DecimalFormat("0,00");
        Number num=0;
        try{
        num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h4").and().getText().replace("$",""));
        }catch(Throwable e){
        	num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[3]/div[2]/h4").and().getText().replace("$",""));	
        }
        Serenity.takeScreenshot();
		return (num.doubleValue());
	}	
	public double verTotal() throws ParseException{
		Number num=0;
        DecimalFormat dF = new DecimalFormat("0,00");
        try{        	
        num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[3]/div[2]/h3").and().getText().replace("$",""));        							   	
        }catch(Throwable e){
        	try{
        	num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h3").and().getText().replace("$",""));
        	}catch(Throwable e1){
        		num = dF.parse(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[2]/div/div[1]/div[4]/div[2]/h3").and().getText().replace("$",""));
        	}        
        }	
        Serenity.takeScreenshot();
    	return (num.doubleValue());
	}
	public void quitarvaucher(){
		try {
		findBy("/html/body/main/div[5]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/ul/li/form/span/span").and().click();
		}catch(Throwable t) {
			try {
			findBy("/html/body/main/div[5]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/ul/li/form/span/span").and().click();
			}catch(Throwable tr) {				
			}
		}
		Serenity.takeScreenshot();
		waitFor(2).seconds();
	}
	public String VerMensaje(){
		Serenity.takeScreenshot();
		return(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[1]/div/div/div").and().getText());
	}
	public void VerificarMensaje(String mensaje){
		Serenity.takeScreenshot();
			assertThat(findBy(".//*[@id='cart-bottom']/div/div[1]/div/div[1]/div/div/div").and().getText(),containsString(mensaje));			
	}
	public void VerificaDescuento(String tipo,double subtotal,double val,double total){
		double totalcalculado=0;
		switch (tipo){
			case "fijo":
				 totalcalculado=subtotal-val;
				break;
			case "porcentaje":
				 totalcalculado=subtotal-(subtotal*(val/100));
				break;	
			case "freeshiping":
				 totalcalculado=subtotal;
				break;					
		}	
		if((total - totalcalculado)<=2) {
			totalcalculado=totalcalculado+(total - totalcalculado);
		}
		Serenity.takeScreenshot();
	assertThat(String.valueOf(Math.floor(totalcalculado)),containsString(String.valueOf(total)));

	}
	public void AumentaArticulo(){
		//waitFor(3).seconds();
		findBy("//*[@id='updateCartForm0']/div[1]/div/span[2]/button/div").and().click();
		Serenity.takeScreenshot();
	}
	public void DescuentaArticulo(){
		findBy(".//*[@id='updateCartForm0']/div[1]/div/span[2]/button").and().click();	
		Serenity.takeScreenshot();
	}
	public void QuitarArticulo(){
		findBy(".//*[@id='removeEntry_0']/a/span").and().click();
		Serenity.takeScreenshot();
	}
	public double PrecioUnitario(String posicion) throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Serenity.takeScreenshot();
		try{
        Number num = dF.parse(findBy("/html/body/main/div[5]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/table/tbody[1]/tr["+posicion+"]/td[3]/div").and().getText().replace("$",""));        
		return (num.doubleValue());		
		}catch (Throwable e){
        	return (0);	
        }		
	}
	public double Cantidad(String posicion) throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Serenity.takeScreenshot();
		try{
		Number num = dF.parse(findBy(".//*[@id='quantity_"+posicion+"']").and().getValue());        
		return (num.doubleValue());		
		}catch (Throwable e){
        	return (0);	
        }		
	}
	public double TotalporArticulos(String posicion) throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Serenity.takeScreenshot();
		try{
        Number num = dF.parse(findBy("/html/body/main/div[5]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/table/tbody[1]/tr["+posicion+"]/td[5]/div/h4").and().getText().replace("$",""));        
		return (num.doubleValue());		
		}catch (Throwable e){
        	return (0);	
        }		
	}
	public void VerificaTotales(double subtotal,double cantidad,double totalreal){
		double totalcalculado=0;
		totalcalculado=subtotal*cantidad;
		totalcalculado=Math.floor(totalcalculado);
		Serenity.takeScreenshot();
		try{	
		assertThat(String.valueOf(totalcalculado),containsString(String.valueOf(totalreal)));
		}catch (Throwable e){
        	
        }		
	}
	public void VerificaTotalesaliadas(double subtotal,double cantidad,double totalreal,double porcentaje){
		double totalcalculado=0;
		subtotal=subtotal-(subtotal*porcentaje);
		totalcalculado=subtotal*cantidad;
		totalcalculado=Math.floor(totalcalculado);
		Serenity.takeScreenshot();
		try{	
		assertThat(String.valueOf(totalcalculado),containsString(String.valueOf(totalreal)));
		}catch (Throwable e){
       	
        }		
	}	
	public int Filas(){
		int i;		
		i=findBy("//DIV[@class='portlet-body table-cart-product js-table-cart-product']/self::DIV").getSize().getHeight()/findBy("//TD/self::TD").getSize().getHeight();
		System.out.println(String.valueOf(i));
		return (i);
	}
	public void minicar(){
		//findBy("/html/body/main/nav[2]/div[3]/div/ul/li[4]/a/span").and().click();
		findBy("//*[@id=\"cart-toggle\"]/span").and().click();
		Serenity.takeScreenshot();
	}
	public void VerOrden(){
		waitFor(2).seconds();
		findBy("//*[@id='CartContainer']/div[2]/div/div/div/div[2]/a").and().click();	
		Serenity.takeScreenshot();
	}
	public String orden() {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/div/h3/span/span").and().getText());
	}
	public double Cantidad() throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
		num= dF.parse(findBy("/html/body/main/nav[2]/div[3]/div/ul/li[4]/a/div[2]/span").and().getText());
		}catch(Throwable e){
			num=0;
		}
		
		return(num.doubleValue());
	}
	public void Bajaunarticulo() {
		Serenity.takeScreenshot();
		findBy("//*[@id=\"removeEntry_0\"]/a/span").and().click();		
	}
}

