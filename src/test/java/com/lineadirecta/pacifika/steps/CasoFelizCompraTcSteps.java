package com.lineadirecta.pacifika.steps;

import javax.swing.JOptionPane;

import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.pageobjets.CheckOutPage;
import com.lineadirecta.pacifika.pageobjets.LogisiticaPage;
import com.lineadirecta.pacifika.pageobjets.RedimirVaucherPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;


public class CasoFelizCompraTcSteps {
	CheckOutPage casoFelizCompraTcPage;
	RedimirVaucherPage redimirVaucherPage;
	LogisiticaPage logisiticaPage;

	
	@StepGroup
	public void DatosDeTarje(String numero,String mes,String ano,String numverifica,String cuotas,String titular,String tipodoc, String documento,String telefono,String correo){
		casoFelizCompraTcPage.NumTarjeta(numero);
		mes=org.apache.commons.lang3.StringUtils.leftPad(mes, 2,'0');		
		casoFelizCompraTcPage.Mes(mes);
		casoFelizCompraTcPage.ano(ano);
		casoFelizCompraTcPage.NumVerificacion(numverifica);
		casoFelizCompraTcPage.Cuotas(cuotas);
		casoFelizCompraTcPage.titular(titular);
		casoFelizCompraTcPage.TipoDoc("Cédula de Ciudadanía");
		casoFelizCompraTcPage.Documento(documento);
		casoFelizCompraTcPage.Telefono(telefono);
		casoFelizCompraTcPage.Correo(correo);
	}
	@StepGroup
	public void IraPasarela(String tipo){
		try{
		redimirVaucherPage.minicar();
		redimirVaucherPage.VerOrden();
		SesionModel.setOrden(redimirVaucherPage.orden());
		}catch (Throwable e){			
		}
		logisiticaPage.IrChecOut();
		if(tipo.equals("normal")){
		logisiticaPage.Continuar1();
		logisiticaPage.Continuar2();
		} else
		{
			logisiticaPage.Continuar1();
		}
		casoFelizCompraTcPage.pagarAhora2();
	}
	@Step
	public void IraCheckOut() {
		logisiticaPage.IrChecOut();
	}
	@Step
	public void PagarAhora(){
		casoFelizCompraTcPage.PagarAhora();
	}	
	@Step
	public void PagarAhora2(){
		casoFelizCompraTcPage.pagarAhora2();
	}	
	@Step
	public void VerificaFinal(String mensaje){	
		casoFelizCompraTcPage.VerificaLabelFinal(mensaje);		
	}
	@Step
	public boolean MensajeFinal() {
		return(casoFelizCompraTcPage.MensajeFinal());
	}
	@Step
	public boolean VerificaNofeliz(){	
		return(casoFelizCompraTcPage.Nofeliz());		
	}	

	@Step
	public void VerificaNofeliz2(String mensaje){	
		casoFelizCompraTcPage.Nofeliz2(mensaje);		
	}		
	@Step
	public void LogueoePrePasarela() {
		try{
		redimirVaucherPage.minicar();
		redimirVaucherPage.VerOrden();
		logisiticaPage.IrChecOut();
		}catch (Throwable e){	
			logisiticaPage.IrChecOut();
		}				
	}
	@Step
	public void PasarelaPosLogueo(String tipo){
		logisiticaPage.IraCheckOut();
		if(tipo.equals("normal")){
		logisiticaPage.Continuar1();
		
		logisiticaPage.Continuar2();
		} else
		{
			logisiticaPage.Continuar1();
		}
		casoFelizCompraTcPage.pagarAhora2();	
	}
		
	
	@StepGroup
	public void PasarelaPosLogueoNuevo(String aliada,String tipo){		
		logisiticaPage.Continuar1();	
		if (tipo.equals("aliada")){
			
		}else {
			if (tipo.equals("aliadan")){
				
			}else {
				if (aliada.equals("<NONE>")) {
					logisiticaPage.Continuar2();	
				}else {
					if (casoFelizCompraTcPage.CambiaresVisible()) {
						casoFelizCompraTcPage.cambiaraliada();
					}else {
						casoFelizCompraTcPage.Sitengoaliada();
					}
					casoFelizCompraTcPage.DigitoAliada(aliada);
					casoFelizCompraTcPage.ContinuarAliada();
				}	
			}
		}
		
				
	}
	@Step
	public void PasarelaPosLogueoCT(String tipo) {
		logisiticaPage.IraCheckOut();
		if(tipo.equals("normal")){
		logisiticaPage.Continuar1();
		logisiticaPage.Continuar2();
		} else
		{
			logisiticaPage.Continuar1();
		}
		
	}	
	
	
	
}
