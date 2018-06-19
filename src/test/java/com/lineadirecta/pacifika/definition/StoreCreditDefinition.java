package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.model.DatosVaucherModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CasoFelizCompraTcSteps;
import com.lineadirecta.pacifika.steps.CheckOutSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StoreCreditDefinition {
	@Steps
	CheckOutSteps checkOutSteps;
	
	@Steps
	CasoFelizCompraTcSteps compraTCSteps;

	DatosVaucherModel datosRedimirVaucher=new DatosVaucherModel();	
	
	@When("^Pagar Ahora Store Credit$")
	public void pagar_Ahora__store_credit() throws Throwable {
		checkOutSteps.VerificaTotal();		
		compraTCSteps.PagarAhora();	
		int saldo=0;
		if (SesionModel.cupon != "") {
			for(int i=1;i<RedimirVaucherDefinition.cupon.size();i++) {
				if(SesionModel.cupon.equals(RedimirVaucherDefinition.cupon.get(i).getCupon()) && SesionModel.correo.equals(SesionModel.correo)) {
					saldo=Integer.parseInt(RedimirVaucherDefinition.cupon.get(i).getCantidad())+1;
					datosRedimirVaucher.editar(SesionModel.rutacupones, i,String.valueOf(saldo));
				}
			}
		}
		checkOutSteps.ActSaldoStoreCredit(LogueoDesdeInicioDefinition.rutausuarios, String.valueOf(CheckOutSteps.saldo),SesionModel.posicion);
	}	
	
	
	@Then("^No encuentra Pasarela \"([^\"]*)\"$$")
	public void no_encuentra_Pasarela(String mensaje) throws Throwable {
		checkOutSteps.VerificaMensajeStore(mensaje);
	}
	
	@Then("^Verifica Pasarela$")
	public void verifica_pasarela() throws Throwable {
		checkOutSteps.VerificaPasarela();
	}


}
