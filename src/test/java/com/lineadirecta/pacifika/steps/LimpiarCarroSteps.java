package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.LimpiarCarroPage;

public class LimpiarCarroSteps {
	LimpiarCarroPage limpiarCarroPage;
	
	public void Limpiarcarro(){
		limpiarCarroPage.Eliminar();
	}
	public boolean Valida(){
		return(limpiarCarroPage.Valida());
	}
	public void VerCarro(){
		limpiarCarroPage.VerCarrito();		
	}
	public void IraOrden(){
		limpiarCarroPage.IraOrden();
	}
}
