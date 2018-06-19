package com.lineadirecta.pacifika.steps;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.lineadirecta.pacifika.model.DatoLogisticaModel;
import com.lineadirecta.pacifika.model.OrdenModel;
import com.lineadirecta.pacifika.pageobjets.CheckOutPage;
import com.lineadirecta.pacifika.pageobjets.CompraEfectivoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class CompraEfectivoSteps {
	OrdenModel ordenModel=new OrdenModel();
	CheckOutPage checkOutPage;
	CompraEfectivoPage compraEfectivoPage;
	DatoLogisticaModel datoLogisticaModel=new DatoLogisticaModel();
	@StepGroup
	public void SelecionaPago(String tipo){
		checkOutPage.IraEfectivo();
		checkOutPage.SeleccionaVia(tipo);
	}
	@Step
	public String Orden(){
		return(checkOutPage.OrdenEfectivo());	
	}
	@Step
	public void Escribir(String correo, String orden) throws Throwable {
		compraEfectivoPage.escribir(correo, orden);
	}
	@Step
	public void IraCompras() {
		compraEfectivoPage.IraCompras();
	}
	@StepGroup
	public void DigitayVerifica(String orden,String estado,String ruta,int fila) {
		compraEfectivoPage.BuscaOrden(orden);
		assertThat(estado, containsString(compraEfectivoPage.Estado()));
		try {
		datoLogisticaModel.editar(ruta, fila);
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
}
