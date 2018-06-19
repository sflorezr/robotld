package com.lineadirecta.pacifika.pageobjets;

import com.lineadirecta.pacifika.Mail;
import net.serenitybdd.core.pages.PageObject;

public class CorreoPage extends PageObject{
	static Mail mail=new Mail();
	
	public void verificaCorreo(String correo, String password, String cadena) throws Throwable {
		waitFor(60).seconds();
		mail.RecibirEmail(correo, password, cadena);		
	}

}
