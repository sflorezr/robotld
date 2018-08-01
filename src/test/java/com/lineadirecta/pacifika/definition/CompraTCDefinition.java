package com.lineadirecta.pacifika.definition;

import java.util.List;
import com.lineadirecta.pacifika.model.CompraTCModel;
import com.lineadirecta.pacifika.model.DatosCompraTcModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CasoFelizCompraTcSteps;
import com.lineadirecta.pacifika.steps.CheckOutSteps;
import com.lineadirecta.pacifika.steps.CompraCreditoSteps;
import com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps;
import com.lineadirecta.pacifika.steps.CorreoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraTCDefinition {
	@Steps
	CasoFelizCompraTcSteps compraTCSteps;
	@Steps
	CheckOutSteps checkOutSteps;
	@Steps
	CorreoStep correostep;
	@Steps
	CompraTarjetaDebitoSteps compraTarjetaDebitoSteps;
	@Steps
	CompraCreditoSteps compraCreditoSteps;
	
	public static boolean vali=true;
	DatosCompraTcModel datosCompraTcModel=new DatosCompraTcModel();
	public List<CompraTCModel> Datos =null;
	
	@Given("^Teniendo datos TC \"([^\"]*)\"$")
	public void teniendo_datos_TC(String ruta) throws Throwable {
	    Datos = datosCompraTcModel.LlenarLista(ruta);
	}

	@When("^Ir a Pasarela \"([^\"]*)\"$")
	public void ir_a_Pasarela(String tipo) throws Throwable {
		compraTCSteps.IraPasarela(tipo);
	}


	@When("^Digito Datos de TC$")
	public void digito_Datos_de_TC() throws Throwable {
		for (int i=1;i<Datos.size();i++ ){	
			if (Datos.get(i).getCorreo().equals(SesionModel.correo)){
				if(Datos.get(i).getEstado().equals("feliz")) {
				compraTCSteps.DatosDeTarje(Datos.get(i).getNumero(),Datos.get(i).getMes(),Datos.get(i).getAnos(),Datos.get(i).getNumverifica(),Datos.get(i).getCuotas(),Datos.get(i).getTitular(),Datos.get(i).getTipodoc(),Datos.get(i).getDocumento(),Datos.get(i).getTelefono(),Datos.get(i).getCorreo());
				i=Datos.size();
				}
			}
		}
	}
	@When("^Digito Datos de TC no feliz$")
	public void digito_Datos_de_TC_no_feliz() throws Throwable {
		for (int i=1;i<Datos.size();i++ ){	
			if (Datos.get(i).getCorreo().equals(SesionModel.correo)){
				if(Datos.get(i).getEstado().equals("no feliz")) {
				compraTCSteps.DatosDeTarje(Datos.get(i).getNumero(),Datos.get(i).getMes(),Datos.get(i).getAnos(),Datos.get(i).getNumverifica(),Datos.get(i).getCuotas(),Datos.get(i).getTitular(),Datos.get(i).getTipodoc(),Datos.get(i).getDocumento(),Datos.get(i).getTelefono(),Datos.get(i).getCorreo());
				i=Datos.size();
				}
			}
		}
	}	
	
	@When("^Pagar Ahora intentos \"([^\"]*)\"$")
	public void pagar_Ahora_intentos(int intentos) throws Throwable {
		checkOutSteps.VerificaTotal();		
		compraTCSteps.PagarAhora();
		for(int i=1;i<=intentos;i++)
		{
			if(compraTCSteps.MensajeFinal() != true)
			{
				digito_Datos_de_TC();
				compraTCSteps.PagarAhora();	
			}else {
				i=intentos+1;
			}			
		}
	}
	
	@When("^Pagar Ahora$")
	public void pagar_Ahora() throws Throwable {
		//checkOutSteps.VerificaTotal();		
		compraTCSteps.PagarAhora();	
		if (CompraCreditoSteps.credito) {
			checkOutSteps.ActSaldoCredit(LogueoDesdeInicioDefinition.rutausuarios, String.valueOf(CompraCreditoSteps.saldo),SesionModel.posicion);
		}
		
	}	



	@Then("^Verifico Mensaje Pago$")
	public void verifico_Mensaje_Pago() throws Throwable {
			for (int i=1;i<Datos.size();i++ ){	
				if (Datos.get(i).getCorreo().equals(SesionModel.correo)){
					if(Datos.get(i).getEstado().equals("feliz")) {
						compraTCSteps.VerificaFinal(Datos.get(i).getMensaje());
					i=Datos.size();
					}
				}
			}	
			String correo,contrasena;
			correo=SesionModel.correo;
			contrasena=SesionModel.contrasena;
			correostep.VerificaCorreo(correo,contrasena, compraTarjetaDebitoSteps.Orden());				
	}	

	@Then("^Verifico Mensaje Pago no feliz$")
	public void verifico_Mensaje_Pago_no_feliz() throws Throwable {
		
		for (int i=1;i<Datos.size();i++ ){	
			if (Datos.get(i).getCorreo().equals(SesionModel.correo)){
				if(Datos.get(i).getEstado().equals("no feliz")) {
					compraTCSteps.VerificaNofeliz2(Datos.get(i).getMensaje());
				i=Datos.size();
				}
			}
		}	
	}	
}
