package com.lineadirecta.pacifika.steps;

import java.text.ParseException;

import com.lineadirecta.pacifika.pageobjets.RedimirVaucherPage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
@DefaultUrl("https://stage.pacifika.com/cart")
public class RedimirVaucherSteps {
	RedimirVaucherPage redimirVaucherPage;
	@Step
	public void EscribirVaucher(String codigo){
		redimirVaucherPage.EscribirVaucher(codigo);
	}
	@Step
	public void Aplicar(){
		redimirVaucherPage.aplicarvaucher();
	}
	@Step
	public String VerMensaje(){
		return(redimirVaucherPage.VerMensaje());
	}
	@Step
	public double VerSubtotal() throws ParseException{
		return(redimirVaucherPage.verSubtotal());
	}
	@Step
	public double VerDescuento() throws ParseException{
		return(redimirVaucherPage.verDescuento());
	}	
	@Step
	public double VerTotal() throws ParseException{
		return(redimirVaucherPage.verTotal());
	}	
	@Step
	public void QuitarVaucher(){
		redimirVaucherPage.quitarvaucher();		
	}
	@Step
	public void IrAOrden(){
		redimirVaucherPage.minicar();
		redimirVaucherPage.VerOrden();
	}
	@Step
	public void VerificarMensaje(String mensaje){
		redimirVaucherPage.VerificarMensaje(mensaje);
	}	
	@Step
	public void VerificaDescuento(String tipo,double subtotal,double val,double total){
		redimirVaucherPage.VerificaDescuento(tipo, subtotal, val, total);	
	}
	@Step
	public double PrecioUnitario(String posicion) throws ParseException{
		return(redimirVaucherPage.PrecioUnitario(posicion));
	}
	@Step
	public double Cantidad(String posicion) throws ParseException{
		return(redimirVaucherPage.Cantidad(posicion));
	}
	@Step
	public double TotalPorArticulos(String posicion) throws ParseException{
		return(redimirVaucherPage.TotalporArticulos(posicion));
	}	
	@Step
	public void verificartotales(double subtotal,double cantidad,double totalreal){
		redimirVaucherPage.VerificaTotales(subtotal, cantidad, totalreal);
	}
	@Step
	public void verificartotalesaliadas(double subtotal,double cantidad,double totalreal,double porcentaje){
		redimirVaucherPage.VerificaTotalesaliadas(subtotal, cantidad, totalreal, porcentaje);
	}	
	@Step
	public int Filas(){
		return(redimirVaucherPage.Filas());
	}
	@StepGroup
	public void AbrirCar(){
		redimirVaucherPage.minicar();
		redimirVaucherPage.VerOrden();
	}
	@Step
	public void AumentarArticulo(){		
		redimirVaucherPage.AumentaArticulo();
	}
	@Step
	public void DisminuyeArticulo(){		
		redimirVaucherPage.DescuentaArticulo();
	}
	@Step
	public void BajaunArticulo(){		
		redimirVaucherPage.Bajaunarticulo();
	}	
}