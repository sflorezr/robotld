package com.lineadirecta.pacifika.pageobjets;

import org.openqa.selenium.WebDriver;
import com.lineadirecta.pacifika.model.OrdenModel;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class CompraEfectivoPage extends PageObject {
	OrdenModel ordenModel=new OrdenModel();
	public void escribir(String correo,String orden) throws Throwable {
		WebDriver driver = getDriver();
		String orden2=driver.getCurrentUrl().substring(driver.getCurrentUrl().length()-8,driver.getCurrentUrl().length());
		ordenModel.Escribir(correo, orden2);	
	}
	public void IraCompras() {
		Serenity.takeScreenshot();
		findBy("//*[@id=\"sideBarMenu\"]/li[2]/a").and().click();		
	}
	public void BuscaOrden(String orden) {
		orden=org.apache.commons.lang3.StringUtils.leftPad(orden, 8,'0');
		Serenity.takeScreenshot();
		findBy("/html/body/main/div[5]/div[2]/section/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/form/div/div[1]/div/div/input").and().type(orden);
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		findBy("/html/body/main/div[5]/div[2]/section/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/form/div/div[4]/input").and().click();
	}
	public String Estado() {
		Serenity.takeScreenshot();
		return(findBy("/html/body/main/div[5]/div[2]/section/div/div[2]/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[6]/span").and().getText());
	}	
}
