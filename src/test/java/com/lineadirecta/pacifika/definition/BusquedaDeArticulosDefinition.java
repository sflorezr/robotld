package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.steps.BusquedaDeArticulosSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaDeArticulosDefinition {
	@Steps
	BusquedaDeArticulosSteps busquedaDeArticulosSteps; 
	
	@Given("^Ingreso al home$")
	public void ingreso_al_home() throws Throwable {	
		busquedaDeArticulosSteps.DarClicEnLaLupa();
	}

	@When("^Realizo una busqueda de articulo especifico$")
	public void realizo_una_busqueda_de_articulo_especifico() throws Throwable {
		busquedaDeArticulosSteps.IngresarArticulo();
		busquedaDeArticulosSteps.ClicBotonBuscar();
	}

	@Then("^Aparecera los resultados buscandos$")
	public void aparecera_los_resultados_buscandos() throws Throwable {
		busquedaDeArticulosSteps.VerificarResulatdo();
	}


}
