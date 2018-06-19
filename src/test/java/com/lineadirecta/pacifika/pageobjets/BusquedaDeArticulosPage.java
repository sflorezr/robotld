package com.lineadirecta.pacifika.pageobjets;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


@DefaultUrl("https://stage.pacifika.com/")
public class BusquedaDeArticulosPage extends PageObject {
	
	public void BotonLupa(){
		findBy("/html/body/main/nav[2]/div[3]/div/ul/li[1]/a/span").and().click();
	}
	
	public void IngresarArticulo(){
		waitFor(10).seconds();
		findBy("//*[@id='js-site-search-input']").and().type("Pantalon");
	}

	public void BotonBuscar(){
		waitFor(2).seconds();
		findBy("/html/body/main/div[2]/div/div/form/div/span[1]").and().click();
	}
	
	public void VerificarImagenes(){
		int j = 0;
		for (int i=1; i<= 15;i++){
			String obj;
			obj = "/html/body/main/div[5]/div[2]/section/div[1]/div[2]/div/div/div/ul/div["+Integer.toString(i)+"]/div/a[1]";
			String strDescripcion = findBy(obj).getAttribute("title");
			j = strDescripcion.indexOf("Pantalon");
			strDescripcion = strDescripcion.substring(j, 8);
			assertThat(strDescripcion,containsString("Pantalon"));			
		}
	}
}

