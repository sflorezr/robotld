package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.BusquedaDeArticulosPage;

import net.thucydides.core.annotations.Step;

public class BusquedaDeArticulosSteps {
	BusquedaDeArticulosPage busquedaDeArticulosPage; 
	
	@Step
	public void DarClicEnLaLupa(){
		busquedaDeArticulosPage.open();
		busquedaDeArticulosPage.BotonLupa();
	}
	
	@Step
	public void IngresarArticulo(){
		busquedaDeArticulosPage.IngresarArticulo();
	}
	
	@Step
	public void ClicBotonBuscar(){
		busquedaDeArticulosPage.BotonBuscar();
	}	
	
	@Step
	public void VerificarResulatdo(){
		busquedaDeArticulosPage.VerificarImagenes();
	}		
}
