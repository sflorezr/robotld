package com.lineadirecta.pacifika.definition;

import java.util.List;
import com.lineadirecta.pacifika.model.CompraTarjetaDebitoModel;
import com.lineadirecta.pacifika.model.DatosCompraTarjetaDebitoModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CheckOutSteps;
import com.lineadirecta.pacifika.steps.CompraTarjetaDebitoSteps;
import com.lineadirecta.pacifika.steps.CorreoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CompraTarjetaDebitoDefinition  {	
	@Steps
	CompraTarjetaDebitoSteps compraTarjetaDebitoSteps;
	@Steps
	CorreoStep correostep;
	@Steps
	CheckOutSteps checkOutSteps;
	
	DatosCompraTarjetaDebitoModel catosCompraTarjetaDebitoModel=new DatosCompraTarjetaDebitoModel();
	public List<CompraTarjetaDebitoModel> Datos =null;
	
	@Given("^Teniendo datos TD \"([^\"]*)\"$")
	public void teniendo_datos_TD(String ruta) throws Throwable {
	    Datos = catosCompraTarjetaDebitoModel.LlenarLista(ruta);
	}	
	@When("^Ir a PSE$")
	public void Ir_a_PSE() throws Throwable {		
		compraTarjetaDebitoSteps.SeleccionaForma();
		compraTarjetaDebitoSteps.SeleccionaBanco(Datos.get(1).getBanco());
	}
	@When("^Pasos para pago tarjeta debito \"([^\"]*)\"$")
	public void pasos_para_pago_tarjeta_debito(String tipo) throws Throwable {
		if (SesionModel.tipo.equals("aliadan")) {
			compraTarjetaDebitoSteps.RegistrarPSE(SesionModel.documento,SesionModel.nombre, SesionModel.celular, SesionModel.direccion, SesionModel.correo);
		}else {
			if (SesionModel.tipo.equals("normaln")) {
				compraTarjetaDebitoSteps.RegistrarPSE(SesionModel.documento,SesionModel.nombre, SesionModel.celular, SesionModel.direccion, SesionModel.correo);
			}else {
			compraTarjetaDebitoSteps.DigitaCorreo(SesionModel.correo);
			}
		}

		compraTarjetaDebitoSteps.Debug();
		for (int i=1;i<=Datos.size();i++) {
			if (Datos.get(i).getCorreo().equals(SesionModel.correo) && Datos.get(i).getTipo().equals(tipo)  ) {
				compraTarjetaDebitoSteps.DatosPSE(Datos.get(i).getFecha(),Datos.get(i).getEstado(),Datos.get(i).getId());
				i=Datos.size();
			}
		}		
	}
	@Then("^Verifico Mensaje Pago Tarjeta Debito \"([^\"]*)\"$")
	public void Verifico_Mensaje_Pago_Tarjeta_Debito(String tipo) throws Throwable {
		for (int i=1;i<=Datos.size();i++) {
			if (Datos.get(i).getTipo().equals(tipo)) {
				compraTarjetaDebitoSteps.VerificaMensaje(Datos.get(i).getMensaje(),tipo);	
				i=Datos.size();
			}
		}
		if (tipo.equals("feliz")){
			String correo,contrasena;
			correo=SesionModel.correo;
			contrasena=SesionModel.contrasena;
			//correostep.VerificaCorreo(correo,contrasena, compraTarjetaDebitoSteps.Orden());
		}
	}		
}
