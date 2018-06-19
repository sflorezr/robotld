package com.lineadirecta.pacifika.steps;

import com.lineadirecta.pacifika.pageobjets.CheckOutPage;

public class CompraContraEntregaSteps {
	CheckOutPage checkOutPage;
	
	public void IraContraEntrega(){
		checkOutPage.PagoContraEntrega();
	}
	public boolean IraContraEntregaVisible(){
		return(checkOutPage.PagoContraEntregaVisible());
	}	
}
