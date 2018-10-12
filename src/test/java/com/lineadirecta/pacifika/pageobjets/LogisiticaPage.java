package com.lineadirecta.pacifika.pageobjets;

import java.text.ParseException;
import com.ibm.icu.text.DecimalFormat;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogisiticaPage extends PageObject {
	public void Continuar1 (){
		findBy("//button[@type='submit']").and().click();
		waitFor(2).seconds();
		try {
			if(findBy("//*[@id='firstName.errors']").isVisible()) {
				findBy("//button[@type='submit']").and().click();
				waitFor(2).seconds();		
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Serenity.takeScreenshot();
	}
	public void Continuar2(){
		findBy("(//button[@type='submit'])[2]").and().click();	
		waitFor(2).seconds();
		Serenity.takeScreenshot();
	}
	
	public void ubicacion(String tipo) {
		if (tipo.equals("normal")) {
			findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/a[3]/div[1]/span").and().click();
		}else {
			findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/a[2]/div[1]/span").and().click();
		}
		waitFor(2).seconds();
		Serenity.takeScreenshot();		
	}
	
	public void volverAlHome() {
	    
		findBy("/html/body/main/div[2]/div/div/div/a[1]/img").and().click();
		Serenity.takeScreenshot();				
	}
	

	public void SeleccionaDepto(String departamento){
		waitFor(2).seconds();
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/section/div/div[2]/div[2]/div[2]/div/div/select").and().click();
		Serenity.takeScreenshot();
		departamento=org.apache.commons.lang3.StringUtils.leftPad(departamento, 5,'0');
		switch (departamento.substring(0, 2))		
		{
		case "05":departamento="ANTIOQUIA"; break;
		case "08":departamento="ATLANTICO"; break;
		case "11":departamento="BOGOTA"; break;
		case "13":departamento="BOLIVAR"; break;
		case "15":departamento="BOYACA"; break;
		case "17":departamento="CALDAS"; break;
		case "18":departamento="CAQUETA"; break;
		case "19":departamento="CAUCA"; break;
		case "20":departamento="CESAR"; break;
		case "23":departamento="CORDOBA"; break;
		case "25":departamento="CUNDINAMARCA"; break;
		case "26":departamento="BOLIVAR"; break;
		case "27": departamento="CHOCO"; break;
		case "41": departamento="HUILA"; break;
		case "44": departamento="LA GUAJIRA"; break;
		case "47": departamento="MAGDALENA"; break;
		case "50": departamento="META"; break;
		case "52": departamento="NARI�O"; break;
		case "54": departamento="N. DE SANTANDER"; break;
		case "63": departamento="QUINDIO"; break;
		case "66": departamento="RISARALDA"; break;
		case "68": departamento="SANTANDER"; break;
		case "70": departamento="SUCRE"; break;
		case "73": departamento="TOLIMA"; break;
		case "76": departamento="VALLE DEL CAUCA"; break;
		case "81": departamento="ARAUCA"; break;
		case "85": departamento="CASANARE"; break;
		case "86": departamento="PUTUMAYO"; break;
		case "88": departamento="SAN ANDRES"; break;
		case "91": departamento="AMAZONAS"; break;
		case "94": departamento="GUAINIA"; break;
		case "95": departamento="GUAVIARE"; break;
		case "97": departamento="VAUPES"; break;
		case "99": departamento="VICHADA"; break;		
		}
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/section/div/div[2]/div[2]/div[2]/div/div/select").and().selectByVisibleText(departamento);
		Serenity.takeScreenshot();
	}
	public void SeleccionaCity(String city){
		city=org.apache.commons.lang3.StringUtils.leftPad(city, 5,'0');
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/section/div/div[2]/div[3]/div[1]/div/div/select").and().click();
		Serenity.takeScreenshot();
		findBy("/html/body/main/div[5]/div[2]/section/div[2]/div/div/div/div/form/section/div/div[2]/div[3]/div[1]/div/div/select").and().selectByValue(city);
		Serenity.takeScreenshot();
		waitFor(3).seconds();
	}
	public double Dias() throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
        num =dF.parse(findBy("//*[@id='description-days']").and().getText());
		}catch(Throwable e){			
		}
		Serenity.takeScreenshot();
		return(num.doubleValue());
	}
	public double Flete(){
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		try{
        num =dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[2]/span[2]").and().getText().replace("$",""));
		}catch(Throwable e){
			num=0;
		}
		Serenity.takeScreenshot();
		return(num.doubleValue());
	}
	public void IrChecOut(){
		try {
			findBy("/html/body/main/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/button").and().click();
		}catch(Throwable t) {			
			try {
			findBy("//*[@id='cart-bottom']/div/div[2]/div[2]/div/div/div[2]/button").and().click();
			}catch(Throwable t2) {				
			}
		}
		Serenity.takeScreenshot();
	}
	public void IraCheckOut(){
		try{
		if (findBy("//*[@id=\"cart-toggle\"]/span").and().isVisible()) {
			findBy("//*[@id=\"cart-toggle\"]/span").and().click();
			waitFor(2).seconds();
			findBy("//*[@id='CartContainer']/div[2]/div/div/div/div[2]/a").and().click();
		}
		
		findBy("//*[@id='cart-bottom']/div/div[2]/div[2]/div/div/div[2]/button").and().click();
		}catch(Throwable t){			
		}
		Serenity.takeScreenshot();
	}
	public void VerificarDias(String dias){
		waitFor(4).seconds();
		//JOptionPane.showMessageDialog(null, findBy("//*[@id='description-days']").and().getText());
		assertThat(String.valueOf(dias),containsString(findBy("//*[@id='description-days']").and().getText()));
	}
	public void VerificaFlete(double precio) throws ParseException{
		//waitFor(2).seconds();
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
			try{
	        num =dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[2]/span[2]").and().getText().replace("$",""));
			}catch(Throwable t){
				num=0;
			}	
			Serenity.takeScreenshot();
			assertThat(String.valueOf(Math.floor(precio)),containsString(String.valueOf(num.doubleValue())));	        

	}
	public double Subtotal() throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		num=dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[1]/span[2]").and().getText().replace("$",""));
		Serenity.takeScreenshot();
		return(num.doubleValue());
	}
	public double Total() throws ParseException{
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		num=dF.parse(findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[3]/span").and().getText().replace("$",""));
		Serenity.takeScreenshot();
		return(num.doubleValue());
	}
	public void verificarDireccion() {
		
		  if (findBy("//*[@id=\"address-label-select\"]").and().isVisible()==false) {
			  
			  if (findBy("/html/body/main/div[5]/div[2]/section/div[3]/div/div[2]/div[2]/span[2]").and().isVisible()) {				  
					assertThat("Esta cobrando Flete, no debería porque el usuario es nuevo",containsString("Error"));
			  }
			  
			  
		  }
		  Serenity.takeScreenshot();
		
	}	
	
}
