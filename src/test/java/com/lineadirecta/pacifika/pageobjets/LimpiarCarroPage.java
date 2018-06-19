package com.lineadirecta.pacifika.pageobjets;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class LimpiarCarroPage  extends PageObject{
	public void Eliminar(){
		findBy(".//*[@id='removeEntry_0']/a/span").and().click();
		Serenity.takeScreenshot();
	}
	public boolean Valida(){
		return(findBy(".//*[@id='removeEntry_0']/a/span").and().isEnabled());
		
	}
	public void VerCarrito(){
		waitFor(2).seconds();
		findBy(".//*[@id='cart-toggle']").and().click();
		Serenity.takeScreenshot();
	}
	public void IraOrden(){
		findBy("//*[@id='CartContainer']/div[2]/div/div/div/div[2]/a").and().click();
		Serenity.takeScreenshot();
	}

}
