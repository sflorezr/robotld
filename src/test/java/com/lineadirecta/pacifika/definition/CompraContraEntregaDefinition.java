package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.model.DaneContraEntregaModel;
import com.lineadirecta.pacifika.model.DatosDaneContraEntregaModel;
import com.lineadirecta.pacifika.steps.CompraContraEntregaSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraContraEntregaDefinition {
	@Steps
	CompraContraEntregaSteps compraContraEntregaSteps;
	
	DatosDaneContraEntregaModel DatosDane=new DatosDaneContraEntregaModel();
	public static List<DaneContraEntregaModel> Datos=null;	

	@Given("^Tengo municipios \"([^\"]*)\"$")
	public void tengo_municipios(String ruta) throws Throwable {
		Datos = DatosDane.LlenarLista(ruta);
	}	
	
	
	
	@When("^Selecciono Forma pago contra entrega$")
	public void selecciono_Forma_pago_contra_entrega() throws Throwable {
		compraContraEntregaSteps.IraContraEntrega();
	}
	
	@When("^Selecciono Forma pago contra entrega no feliz$")
	public void selecciono_Forma_pago_contra_entrega_no_feliz() throws Throwable {
		String valida="";
		if (compraContraEntregaSteps.IraContraEntregaVisible()){
			valida="Si";
		}else{
			valida="No";
		}		
		assertThat("No",containsString(valida));
	}
		
}
