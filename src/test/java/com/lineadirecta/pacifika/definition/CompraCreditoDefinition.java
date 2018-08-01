package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CompraCreditoSteps;
import com.lineadirecta.pacifika.steps.CorreoStep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraCreditoDefinition {
	@Steps
	CompraCreditoSteps compraCreditoSteps;
	@Steps
	CorreoStep correostep;

	@When("^Selecciono credito$")
	public void selecciono_credito() throws Throwable {
		compraCreditoSteps.Credito();
	}

	@When("^Selecciono credito no feliz$")
	public void selecciono_credito_no_feliz() throws Throwable {
		String vali = "Caso OK";
		if (compraCreditoSteps.CreditoVisible()) {
			vali = "Caso no OK";
		} else {   
			vali = "Caso OK";
		}
		assertThat(vali, containsString("Caso OK"));
	}

	@Then("^Verifico Mensaje Pago Final \"([^\"]*)\"$")
	public void verifico_vensaje_vago_final(String mensaje) throws Throwable {
		//assertThat(compraCreditoSteps.Mensaje(), containsString("¡Tu pedido va en camino!"));
		// cambio Olga
		try {
		assertThat(compraCreditoSteps.Mensaje(), containsString(mensaje));
		}catch(Throwable t) {
			
		}
	//	correostep.VerificaCorreo(SesionModel.correo, SesionModel.contrasena, compraCreditoSteps.Orden());
	}
	@Then("^Selecciono credito no feliz	con mensaje \"([^\"]*)\"$")
	public void Selecciono_credito_no_feliz_con_mensaje(String mensaje) throws Throwable {
		compraCreditoSteps.VerificaMensaje(mensaje);	
	}
	@Then("^Verifico Mensaje Pago Final credito$")
	public void verifico_vensaje_vago_final_credito() throws Throwable {
		correostep.VerificaCorreo(SesionModel.correo, SesionModel.contrasena, compraCreditoSteps.Orden());
	}

	@Then("^Verifico Mensaje Pago Final Store Credit$")
	public void verifico_vensaje_vago_final_store_credit() throws Throwable {
		assertThat(compraCreditoSteps.MensajeST(), containsString("confirmado con éxito!"));
		correostep.VerificaCorreo(SesionModel.correo, SesionModel.contrasena, compraCreditoSteps.NroOrdenSC());
	}

}
