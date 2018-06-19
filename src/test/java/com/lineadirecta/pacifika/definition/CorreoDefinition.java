package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.Mail;
import com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CorreoDefinition {
	Mail mail=new Mail();
	@Steps
	CompraTarjetaDebitoSteps compraTarjetaDebitoSteps;
	
	@Then("^verifica correo$")
	public void verifica_correo() throws Throwable {
//		String cadena1="hola";
//		String cadena2="a";
//		JOptionPane.showMessageDialog(null, cadena1.indexOf(cadena2));
		
		mail.RecibirEmail("slflorez91@gmail.com", "Cucuta1234+",compraTarjetaDebitoSteps.Orden());
	}
	
	@Given("^correo$")
	public void correo() throws Throwable {
		mail.main(null);
	}
}
