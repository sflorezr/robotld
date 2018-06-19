package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.pageobjets.Generales;
import com.lineadirecta.pacifika.steps.LimpiarCarroSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LimpiarCarroDefinition {
	@Steps
	LimpiarCarroSteps limpiarCarroSteps;	
	Generales generales;

	@When("^Voy al Carro$")
	public void voy_al_Carro() throws Throwable {
		limpiarCarroSteps.VerCarro();
		try{
		limpiarCarroSteps.IraOrden();
		}catch(NumberFormatException e){
			
		}
	}
	
	@When("^Limpia Carro$")
	public void limpia_Carro() throws Throwable {
		boolean valida=true;
		while (valida){
			try{
	    	limpiarCarroSteps.Limpiarcarro();
			}catch(NumberFormatException e){
				 valida=false;
			}
	    }
	}
	@When("^Vuelvo al home$")
	public void vuelvo_al_home() throws Throwable {
		generales.open();
	}	
		
}
