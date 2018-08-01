package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.BusquedaDeArticulosPorSubcategoriaPage;
import com.lineadirecta.pacifika.pageobjets.Generales;
import net.thucydides.core.annotations.Step;

public class BusquedaDeaArticulosPorSubcategoriaSteps {
	BusquedaDeArticulosPorSubcategoriaPage busquedaArticulosPorSubcategoriaPage;
	Generales general;	
	@Step 
	public void AbrirPagina(){
		general.open();
		general.exceptionie();
	}
	@Step
	public int Total(){
		return(busquedaArticulosPorSubcategoriaPage.total());
	}
	@Step
	public int Cantidad(){
		return(busquedaArticulosPorSubcategoriaPage.Cantidad());
	}	
	@Step
	public void SeleccionaMenuPrincipal(String opcion){		
		busquedaArticulosPorSubcategoriaPage.MenuPrincipal(opcion);		
	}
	@Step
	public void LimpiarCarro() {
		busquedaArticulosPorSubcategoriaPage.LimpiaCarro();
	}
	@Step
	public void SeleccionaSubcategoria(String opcion,String subcategoria){
		busquedaArticulosPorSubcategoriaPage.Subcategoria(opcion, subcategoria);
	}
	@Step
	public void Seleccionaarticulo(String talla,String codigo,String posicion,String tipo,int j,String PLU){
		if (j < 2)
		{
			busquedaArticulosPorSubcategoriaPage.seleccionatalla(talla, posicion,tipo);	
		}		
		busquedaArticulosPorSubcategoriaPage.anadiralcarrito(codigo);
	}
	@Step
	public void CerrarMiniCarro(){		
		busquedaArticulosPorSubcategoriaPage.CerrarMiniCar();
	}
	@Step
	public void anadearticulodesdePDP(String tallatipo,String PLU){
		busquedaArticulosPorSubcategoriaPage.anadealcarrocontalla(tallatipo);
	}
	@Step 
	public void AbrirPDP(String posicion){
		busquedaArticulosPorSubcategoriaPage.abrirpaginadeproducto(posicion);
	}
	@Step
	public int TotxProd(String posicion){
		return(busquedaArticulosPorSubcategoriaPage.ValorXproduc(posicion));
	}
	@Step
	public int TotxProdPDP(){
		return(busquedaArticulosPorSubcategoriaPage.ValorXproducPDP());
	}	
}
