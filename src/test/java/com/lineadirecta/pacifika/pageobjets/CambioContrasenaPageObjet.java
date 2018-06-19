package com.lineadirecta.pacifika.pageobjets;

import net.serenitybdd.core.pages.PageObject;

public class CambioContrasenaPageObjet extends PageObject{
	public void IngresaroRegistrarme() {
		findBy("/html/body/main/nav[2]/div[1]/div[3]/ul/li/a").and().click();
	}

}
