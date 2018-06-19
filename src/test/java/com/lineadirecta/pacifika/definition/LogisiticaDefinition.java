package com.lineadirecta.pacifika.definition;

import java.util.List;

import com.ibm.icu.text.DecimalFormat;
import com.lineadirecta.pacifika.model.DatoLogisticaModel;
import com.lineadirecta.pacifika.model.LogisticaModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.CasoFelizCompraTcSteps;
import com.lineadirecta.pacifika.steps.LogisiticaSteps;
import com.lineadirecta.pacifika.steps.LogueoDesdeInicioSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogisiticaDefinition {
	public double cantidad=0;
	@Steps
	LogisiticaSteps logisiticaSteps; 
	@Steps
	LogueoDesdeInicioSteps logueoDesdeInicioSteps;
	@Steps
	CasoFelizCompraTcSteps casoFelizCompraTcSteps;
	
	DatoLogisticaModel datosLogisticaModel=new DatoLogisticaModel();
	public static List<LogisticaModel> DatosLog=null;



	@Given("^Tengo datos a verificar \"([^\"]*)\"$")
	public void tengo_datos_a_verificar(String ruta) throws Throwable {
		DatosLog = datosLogisticaModel.LlenarLista(ruta);
	}
	@When("^tengo cantidad$")
	public void tengo_cantidad() throws Throwable {		
	    cantidad=logisiticaSteps.cantidad();
	    logisiticaSteps.cantidadTotal(cantidad); 
	    datosLogisticaModel.Escribir("tiene cantidad");
	}
	
	@When("^Ir a CheckOut$")
	public void ir_a_CheckOut() throws Throwable {
		logisiticaSteps.IrChecOut();
		datosLogisticaModel.Escribir("checkout");
	}
	
	@When("^Ir a Logistica \"([^\"]*)\"$")
	public void ir_a_Logistica(String tipo) throws Throwable {	
		String ntipo=tipo;
		ntipo=tipo.substring(tipo.length()-1, tipo.length());	
		if (ntipo.equals("n")) {
			logisiticaSteps.Continuar(tipo.substring(0, tipo.length()-1));			
		}else {
			logisiticaSteps.Continuar(tipo);
		}


		if (ntipo.equals("n")){
			for(int i=1;i<LogueoDesdeInicioDefinition.DatosLogue.size();i++) {
				if(LogueoDesdeInicioDefinition.DatosLogue.get(i).getCorreo().equals(SesionModel.correo)) {
					logueoDesdeInicioSteps.verificarDireccion();
					logueoDesdeInicioSteps.Logistica(LogueoDesdeInicioDefinition.DatosLogue.get(i).getDirecccion(),LogueoDesdeInicioDefinition.DatosLogue.get(i).getComplemento(),LogueoDesdeInicioDefinition.DatosLogue.get(i).getDane(),LogueoDesdeInicioDefinition.DatosLogue.get(i).getBarrio(),LogueoDesdeInicioDefinition.DatosLogue.get(i).getComentario(),LogueoDesdeInicioDefinition.DatosLogue.get(i).getNombre());
					i=LogueoDesdeInicioDefinition.DatosLogue.size();
				}
			}
			casoFelizCompraTcSteps.PagarAhora2();
			logisiticaSteps.VolveraUbicacion(tipo);
		}
		
	}
	@When("^Vuelvo a ubicacion$")
	public void vuelvo_a_ubicacion() throws Throwable {
		logisiticaSteps.VolveraUbicacion("normal");
	}
	
	@When("^Volver al Home$")
	public void volver_al_home() throws Throwable {
		logisiticaSteps.VolveralHome();
	}
	
	
	@When("^Verifica Datos logistica usuario normal$")
	public void verifica_Datos_logistica_usuario_normal() throws Throwable {
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		for(int i=1;i<DatosLog.size();i++){
			logisiticaSteps.SeleccionaDepartamento(DatosLog.get(i).getCity());
			logisiticaSteps.SelecionMuncipio(DatosLog.get(i).getCity());		
			//datosLogisticaModel.Escribir("verifica " + DatosLog.get(i).getCity());
			num =dF.parse(DatosLog.get(i).getPrecion());
			if (logisiticaSteps.flete()>0){
				logisiticaSteps.VerificaDias(DatosLog.get(i).getDiasn(),num.doubleValue());	
			}else{
				logisiticaSteps.VerificaDias(DatosLog.get(i).getDiasfree(),0);
			}
						
		}
	
	}

	@When("^Verifica Datos logistica usuario aliada$")
	public void verifica_Datos_logistica_usuario_aliada() throws Throwable {
		DecimalFormat dF = new DecimalFormat("0,00");
		Number num=0;
		if(cantidad<=10){
		for(int i=1;i<DatosLog.size();i++){
			logisiticaSteps.SeleccionaDepartamento(DatosLog.get(i).getCity());
			logisiticaSteps.SelecionMuncipio(DatosLog.get(i).getCity());		
			num =dF.parse(DatosLog.get(i).getPreciona());
			datosLogisticaModel.Escribir("verifica " + DatosLog.get(i).getCity());
			logisiticaSteps.VerificaDias(DatosLog.get(i).getDiasrango2(),num.doubleValue());
		}
		}else{
			for(int i=1;i<DatosLog.size();i++){
				logisiticaSteps.SeleccionaDepartamento(DatosLog.get(i).getCity());
				logisiticaSteps.SelecionMuncipio(DatosLog.get(i).getCity());		
				num =dF.parse(DatosLog.get(i).getPreciom());
				datosLogisticaModel.Escribir("verifica " + DatosLog.get(i).getCity());
				logisiticaSteps.VerificaDias(DatosLog.get(i).getDiasm(),num.doubleValue());
			}	
		}
	
	}
	@Then("^Verifica subtotal y total$")
	public void Verifica_subtotal_y_total() throws Throwable {
		logisiticaSteps.verificatotales(logisiticaSteps.subtotal(),logisiticaSteps.flete(),logisiticaSteps.total());
		//datosLogisticaModel.leer();
	}
}
