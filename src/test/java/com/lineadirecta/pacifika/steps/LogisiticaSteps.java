package com.lineadirecta.pacifika.steps;

import java.text.ParseException;

import com.lineadirecta.pacifika.pageobjets.LogisiticaPage;
import com.lineadirecta.pacifika.pageobjets.RedimirVaucherPage;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class LogisiticaSteps {
	LogisiticaPage logisiticaPage;
	RedimirVaucherPage redimirVaucherPage;
	@Step
	public void IrChecOut(){
		logisiticaPage.IrChecOut();
	}
	@StepGroup
	public void Continuar(String tipo)
	{
		if(tipo.equals("normal")){
		logisiticaPage.Continuar1();
		logisiticaPage.Continuar2();
		} else
		{
			logisiticaPage.Continuar1();
		}
	}
	@Step
	public void cantidadTotal (double cantidadTotal) {
		// mostrar el total de la cantidad de productos para calcualr flete 
		
	}
	@Step
	public void VolveraUbicacion(String tipo) {
		logisiticaPage.ubicacion(tipo);
	}
	
	@Step
	public void VolveralHome() {
		logisiticaPage.volverAlHome();
	}
	
	@Step
	public void SeleccionaDepartamento(String departamento){
		logisiticaPage.SeleccionaDepto(departamento);
	}
	@Step
	public void SelecionMuncipio(String city){
		logisiticaPage.SeleccionaCity(city);
	}
	@StepGroup
	public void VerificaDias(String dias,double valor) throws ParseException{
		logisiticaPage.VerificarDias(dias);
		logisiticaPage.VerificaFlete(valor);
	}
	@Step
	public double cantidad() throws ParseException{
		return(redimirVaucherPage.Cantidad());
	}
	@Step
	public double dias() throws ParseException{
		return (logisiticaPage.Dias());
	}
	@Step
	public double flete() throws ParseException{
		return (logisiticaPage.Flete());
	}
	@Step
	public double subtotal() throws ParseException{
		return(logisiticaPage.Subtotal());
	}
	@Step
	public double total() throws ParseException{
		return(logisiticaPage.Total());
	}	
	@Step
	public void verificatotales(double subtotald,double fleted,double totald) throws ParseException{
		double subtotal,flete,totalcalculado,total;
		subtotal=subtotald;
		flete=fleted;
		total=totald;
		totalcalculado=subtotal+flete;
		assertThat(String.valueOf(totalcalculado), containsString(String.valueOf(total)));
	}
}
