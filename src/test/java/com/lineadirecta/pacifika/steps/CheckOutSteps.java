package com.lineadirecta.pacifika.steps;

import com.ibm.icu.text.DecimalFormat;
import com.lineadirecta.pacifika.definition.LogueoDesdeInicioDefinition;
import com.lineadirecta.pacifika.model.DatosLogueoDesdeInicioModel2;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.pageobjets.CheckOutPage;

import jxl.read.biff.BiffException;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import static org.hamcrest.Matchers.containsString;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckOutSteps {
	CheckOutPage checkOutPage;
	DatosLogueoDesdeInicioModel2 datosLogueoDesdeInicioModel=new  DatosLogueoDesdeInicioModel2();
	public static int saldo=0;
	String saldo1="";
	@Step
	public void VerificaTotal() throws Throwable{
		double subtotal,fleted,total,storecredit,descuento;		
		String flete;
		if (checkOutPage.totalaPagar()>0) {			
			subtotal=checkOutPage.subtotal();		
			flete=checkOutPage.flete();
			if (flete.equals("GRATIS")){
				fleted=0;
			}else{
				DecimalFormat dF = new DecimalFormat("0,00");
		        Number num = dF.parse(flete.replace("$",""));        	
		        fleted=num.doubleValue();			
			}
			storecredit=checkOutPage.StoreCredit();		
			if (storecredit < 0 ){
				total=subtotal+fleted;
				total=total+storecredit;
			}else{
				total=subtotal+fleted;			
			}
			descuento=checkOutPage.Descuento();		
			if (descuento < 0 ){
				total=total+checkOutPage.Descuento();
			}
			assertThat(String.valueOf(total), containsString(String.valueOf(checkOutPage.totalaPagar())));
			if(total==0) {
				saldo=(int) ((subtotal+fleted)+storecredit);
			}else {
				if (storecredit<0) {
					saldo=0;
				}
			}
		}else {
			subtotal=checkOutPage.subtotal();		
			flete=checkOutPage.flete();
			if (flete.equals("GRATIS")){
				fleted=0;
			}else{
				DecimalFormat dF = new DecimalFormat("0,00");
		        Number num = dF.parse(flete.replace("$",""));        	
		        fleted=num.doubleValue();			
			}
			storecredit=checkOutPage.StoreCredit();		
			if (storecredit < 0 ){
				total=subtotal+fleted;
				total=total+checkOutPage.StoreCredit();
			}else{
				total=subtotal+fleted;			
			}
			descuento=checkOutPage.Descuento();		
			if (descuento < 0 ){
				total=total+descuento;
			}			
			if(total<0) {
				saldo=((int) ((subtotal+fleted)+storecredit))*-1;
			}else {
				if (storecredit<0) {
					saldo=0;
				}	
			}
			
		}
	}
	@Step
	public String convenio(){
		return(checkOutPage.Convenio());
	}
	@Step
	public String Orden(){
		return(checkOutPage.NrOrden());
	}	
	@Step
	public void home(){
		checkOutPage.home();
	}
	@Step
	public String alerta() {
		return checkOutPage.alerta();
	}
	@Step
	public void VerificaMensajeStore(String mensaje){	
		assertThat(checkOutPage.MensajeStore(), containsString(mensaje));
	}
	@StepGroup
	public void VerificaPasarela() throws Throwable{
		String pasarela="";
			if (checkOutPage.IraTC()){
				pasarela="Boton de Tarjeta de Credito: OK";
			}else{
				pasarela="Boton de Tarjeta de Credito: No OK";
			}
			assertThat(pasarela, containsString("Boton de Tarjeta de Credito: No OK"));
			
			if (checkOutPage.IraTD()){
				pasarela="Boton de Tarjeta debito: OK";
			}else{
				pasarela="Boton de Tarjeta debito: No OK";
			}
			assertThat(pasarela, containsString("Boton de Tarjeta debito: No OK"));
			if (checkOutPage.totalaPagarCE()<25000){
				if (checkOutPage.IraCE()){
					pasarela="Boton de Contra Entrega: OK";
				}else{
					pasarela="Boton de Contra Entrega: No OK";
				}
				assertThat(pasarela, containsString("Boton de Contra Entrega: No OK"));
			}
			if (checkOutPage.IraEF()){
				pasarela="Boton de Efectivo: No OK";
			}else{
				pasarela="Boton de Efectivo: OK";
			}
			assertThat(pasarela, containsString("Boton de Efectivo: OK"));			
		
			for(int i=1; i<LogueoDesdeInicioDefinition.DatosLogue.size();i++) {
			
				if(SesionModel.correo.equals(LogueoDesdeInicioDefinition.DatosLogue.get(i).getCorreo())) { 
					if (LogueoDesdeInicioDefinition.DatosLogue.get(i).getCredito()!="0") {
						if (checkOutPage.IraCR()){
							pasarela="Boton de Crédito: OK";
						}else{
							pasarela="Boton de Crédito: No OK";
						}
						assertThat(pasarela, containsString("Boton de Crédito: No OK"));	
						
					}
				}
				
		    }
	}
	@Step
	public void ActSaldoCredit(String ruta,String saldo,int celda) throws Throwable, Throwable {
		datosLogueoDesdeInicioModel.ActSaldoCredit(ruta, saldo, celda);
	}
	@Step
	public void ActSaldoStoreCredit(String ruta,String saldo,int celda) throws Throwable, Throwable {
		datosLogueoDesdeInicioModel.ActSaldoStoreCredit(ruta, saldo, celda);
	}	
	@Step
	public void ActTipoUsuario(String ruta,String tipo,int celda) throws BiffException, IOException {
		datosLogueoDesdeInicioModel.ActTipoUsuario(ruta, tipo, celda);
	}
}
