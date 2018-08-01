package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.model.DatosVaucherModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CheckOutSteps;
import com.lineadirecta.pacifika.steps.CompraCreditoSteps;
import com.lineadirecta.pacifika.steps.CompraEfectivoSteps;
import com.lineadirecta.pacifika.steps.CorreoStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraEfectivoDefinition {
	DatosVaucherModel datosRedimirVaucher=new DatosVaucherModel();
	@Steps
	CorreoStep correoStep;
	@Steps
	CompraEfectivoSteps compraEfectivoSteps;
	@Steps
	CompraCreditoSteps compraCreditoSteps;
	
	public String ruta="";
	CheckOutSteps checkOutSteps=new CheckOutSteps();
	@When("^Selecciono \"([^\"]*)\"$")
	public void selecciono(String arg1) throws Throwable {
		ruta=arg1;
		compraEfectivoSteps.SelecionaPago(arg1);
	}
	
	@Then("^Verifica Correo")
	public void verifica_correo() throws Throwable{
		correoStep.VerificaCorreo(SesionModel.correo, SesionModel.contrasena, compraEfectivoSteps.Orden());
	}
	@When("^Guarda orden$")
	public void guardar_orden() throws Throwable {	
		try {
		//compraEfectivoSteps.Escribir(SesionModel.correo,SesionModel.orden);
		String estado="";
		int saldo;
		for(int i=1;i<RedimirVaucherDefinition.cupon.size();i++) {
			if(RedimirVaucherDefinition.cupon.get(i).getUsuaio().equals(SesionModel.correo)) {
				if(RedimirVaucherDefinition.cupon.get(i).getCupon().equals(SesionModel.cupon)) {
					saldo=Integer.parseInt(RedimirVaucherDefinition.cupon.get(i).getCantidad())+1;
					datosRedimirVaucher.editar(SesionModel.rutacupones, i, String.valueOf(saldo));
					estado="editado";
					i=RedimirVaucherDefinition.cupon.size();
				}
			}
		}
		if(estado.equals("editado")) {
		}else {
			datosRedimirVaucher.Escribir(SesionModel.correo, SesionModel.cupon);
		}
		checkOutSteps.ActSaldoStoreCredit(LogueoDesdeInicioDefinition.rutausuarios, String.valueOf(CheckOutSteps.saldo),SesionModel.posicion);
			if (SesionModel.tipo.substring(SesionModel.tipo.length()-1, SesionModel.tipo.length()).equals("n")) {
				switch (SesionModel.tipo){
				case "aliadan": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "aliada",SesionModel.posicion);
				break;
				case "normaln": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "normal",SesionModel.posicion);
				break;
				}
				
			}
		}
		catch(Throwable t) {
			
		}
	}
	@When("^Ir a Compras$")
	public void ir_a_compras() throws Throwable {		
		compraEfectivoSteps.IraCompras();
	}
	@Then("^Verifico Mensaje Pago Final efectivo$")
	public void verifico_mensaje_pago_final_efectivo() throws Throwable {			
		correoStep.VerificaCorreo(SesionModel.correo, SesionModel.contrasena, compraCreditoSteps.Orden());
	}		
}
