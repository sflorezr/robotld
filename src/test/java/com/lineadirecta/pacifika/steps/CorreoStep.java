package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.CorreoPage;

import net.thucydides.core.annotations.Step;

public class CorreoStep {
	CorreoPage correoPage;
	@Step
	public void VerificaCorreo(String correo,String password, String cadena) throws Throwable{
		correoPage.verificaCorreo(correo, password, cadena);
	}
}
