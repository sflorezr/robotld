package com.lineadirecta.pacifika.steps;

import java.text.ParseException;

import com.lineadirecta.pacifika.pageobjets.CheckOutPage;
import net.thucydides.core.annotations.Step;

public class CompraCreditoSteps {
 CheckOutPage checkOutPage;
 public static int saldo=0;
 public static boolean credito=false; 
 @Step
 public void Credito() throws ParseException{
	 checkOutPage.IraCredito();
	 saldo=checkOutPage.SaldoCredito();
	 credito=true;
 }
 @Step
 public String Mensaje(){
	 return(checkOutPage.MensajePagoCredito());
 }
 
 @Step
 public String MensajeST(){
	 return(checkOutPage.mensajeST());
 }
 @Step
 public String Orden(){
	 return(checkOutPage.NrOrden());
 }
 @Step
 public String NroOrdenSC(){
	 return(checkOutPage.NroOrdenSC());
 }
 @Step
 public boolean CreditoVisible() {
	 return(checkOutPage.CreditoVisible());
 }
 @Step
 public void VerificaMensaje(String mensaje) {
	 checkOutPage.VerificaLabelFinal(mensaje);
 }
}
