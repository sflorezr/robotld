package com.lineadirecta.pacifika.definition;

import java.util.List;
import com.lineadirecta.pacifika.model.AgregarArticulosDesdePDRModel;
import com.lineadirecta.pacifika.model.DatosAgregarArticulosDesdePDRModel;
import com.lineadirecta.pacifika.steps.BusquedaDeaArticulosPorSubcategoriaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgregarArticuloDefinition {
	@Steps
	BusquedaDeaArticulosPorSubcategoriaSteps busquedaDeaArticulosPorSubcategoriaSteps;	
	
	DatosAgregarArticulosDesdePDRModel datosAgregarArticulosDesdePDRModel=new DatosAgregarArticulosDesdePDRModel();
	public List<AgregarArticulosDesdePDRModel> DatosArticulo=null;
	
	@Given("^Estando en Home$")
	public void estando_en_Home() throws Throwable {
		busquedaDeaArticulosPorSubcategoriaSteps.AbrirPagina();		
	}

	@Given("^Teniendo articulos a seleccionar \"([^\"]*)\"$")
	public void teniendo_articulos_a_seleccionar(String ruta) throws Throwable {
	    DatosArticulo = datosAgregarArticulosDesdePDRModel.LlenarLista(ruta);	    
	}
	@When("^Limpia carro$")
	public void limpia_carro() throws Throwable {

		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
	}

	@When("^Selecciona articulos desde PDR mayor aliada \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDR_mayor_aliada(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		double unitario=0;
		int i=1;
		int j=1;
		while (total < valor ){
			i=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){			
					busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());
					unitario=busquedaDeaArticulosPorSubcategoriaSteps.Total();
					unitario=unitario-(unitario*0.25);
				total=(int) (unitario);					
				busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
				System.out.println(total);
				System.out.println(valor);
				j=j+1;
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}
				}
				i=i+1;			
			}

		}
	}

	@When("^Selecciona articulos desde PDP mayor aliada \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDP_mayor_aliada(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		double unitario=0;
		int i=1;
		int j=1;
		while (total < valor ){
			i=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){			
					busquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(DatosArticulo.get(i).getPosicion());
					busquedaDeaArticulosPorSubcategoriaSteps.anadearticulodesdePDP(DatosArticulo.get(i).getCategoria()+DatosArticulo.get(i).getTalla(),DatosArticulo.get(i).getPlu());
					unitario=busquedaDeaArticulosPorSubcategoriaSteps.Total();
					unitario=unitario-(unitario*0.25);
				total=(int) (unitario);					
				busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();				
				j=j+1;
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}
				}
				i=i+1;			
			}

		}
	}	
	
	@When("^Selecciona articulos desde PDR mayor normal \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDR_mayor_normal(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;
		while (total < valor ){
			i=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){			
					busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());
					total=(int) (busquedaDeaArticulosPorSubcategoriaSteps.Total());	
				busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();			
				j=j+1;
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}
				}
				i=i+1;			
			}

		}
	}

	@When("^Selecciona articulos desde PDR cantidad mayor normal \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDR_cantidad_mayor_normal(int cantidad) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;
		while (total <= cantidad ){
			i=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){			
					busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());
					total=(int) (busquedaDeaArticulosPorSubcategoriaSteps.Cantidad());	
				busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();			

					if (total > cantidad){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}
					j=j+1;					
				}
				i=i+1;			
			}

		}
	}	
	@When("^Selecciona articulos desde PDP mayor normal \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDP_mayor_normal(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;
		while (total < valor ){
			i=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){			
					busquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(DatosArticulo.get(i).getPosicion());
					busquedaDeaArticulosPorSubcategoriaSteps.anadearticulodesdePDP(DatosArticulo.get(i).getCategoria()+DatosArticulo.get(i).getTalla(),DatosArticulo.get(i).getPlu());
					total=(int) (busquedaDeaArticulosPorSubcategoriaSteps.Total());	
				busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();			
				j=j+1;
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}
				}
				i=i+1;			
			}

		}
	}
	
	@When("^Selecciona articulos desde PDR menor normal \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDR_menor_normal(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){					
					total=(int) (total+busquedaDeaArticulosPorSubcategoriaSteps.TotxProd(DatosArticulo.get(i).getPosicion()));
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}else{					
					busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());						
					busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
					j=j+1;
					}
				}
				i=i+1;			
			}
	}
	
	@When("^Selecciona articulos desde PDP menor normal \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDP_menor_normal(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
			busquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(DatosArticulo.get(i).getPosicion());
				while(j<=DatosArticulo.get(i).getCantidad()){
					total=(int) (total+busquedaDeaArticulosPorSubcategoriaSteps.TotxProdPDP());
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}else{					
					busquedaDeaArticulosPorSubcategoriaSteps.anadearticulodesdePDP(DatosArticulo.get(i).getCategoria()+DatosArticulo.get(i).getTalla(),DatosArticulo.get(i).getPlu());
					busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
					j=j+1;
					}
				}
				i=i+1;			
			}
	}		

	@When("^Selecciona articulos desde PDR menor aliada \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDR_menor_aliada(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){						
					total=(int) (total+busquedaDeaArticulosPorSubcategoriaSteps.TotxProd(DatosArticulo.get(i).getPosicion()));
					total= (int) (total-(total * 0.25));
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}else{					
					busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());						
					busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
					j=j+1;
					}
				}
				i=i+1;			
			}
	}	
	@When("^Selecciona articulos desde PDP menor aliada \"([^\"]*)\"$")
	public void selecciona_articulos_desde_PDP_menor_aliada(int valor) throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		int total=0;
		int i=1;
		int j=1;			
			while (i<DatosArticulo.size()){	
			j=1;	
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
			busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
				while(j<=DatosArticulo.get(i).getCantidad()){	
					busquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(DatosArticulo.get(i).getPosicion());
					total=(int) (total+busquedaDeaArticulosPorSubcategoriaSteps.TotxProdPDP());
					total= (int) (total-(total * 0.25));
					if (total > valor){
						j=DatosArticulo.get(i).getCantidad()+1;
						i=(DatosArticulo.size()-1);						
					}else{					
					busquedaDeaArticulosPorSubcategoriaSteps.anadearticulodesdePDP(DatosArticulo.get(i).getCategoria()+DatosArticulo.get(i).getTalla(),DatosArticulo.get(i).getPlu());						
					busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
					j=j+1;
					}
				}
				i=i+1;			
			}
	}	
	@When("^Selecciona articulos desde PDR$")
	public void selecciona_articulos_desde_PDR() throws Throwable {
	//	JOptionPane.showMessageDialog(null, String.valueOf(DatosArticulo.size()));
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		for (int i=1;i<DatosArticulo.size();i++ ){		
		busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());		
		busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
		for (int j=1;j<=DatosArticulo.get(i).getCantidad();j++){			
			busquedaDeaArticulosPorSubcategoriaSteps.Seleccionaarticulo(DatosArticulo.get(i).getTalla(), DatosArticulo.get(i).getCodigo(), DatosArticulo.get(i).getPosicion(),DatosArticulo.get(i).getCategoria(),j,DatosArticulo.get(i).getPlu());
		busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
		}
		
		}
	}

	@When("^Selecciona articulos desde PDP$")
	public void selecciona_articulos_desde_PDP() throws Throwable {
		busquedaDeaArticulosPorSubcategoriaSteps.LimpiarCarro();
		for (int i=1;i<DatosArticulo.size();i++ ){				
		busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaMenuPrincipal(DatosArticulo.get(i).getCategoria());
		busquedaDeaArticulosPorSubcategoriaSteps.SeleccionaSubcategoria(DatosArticulo.get(i).getCategoria(),DatosArticulo.get(i).getSubcategoria());
		busquedaDeaArticulosPorSubcategoriaSteps.AbrirPDP(DatosArticulo.get(i).getPosicion());
		for (int j=1;j<=DatosArticulo.get(i).getCantidad();j++){
		busquedaDeaArticulosPorSubcategoriaSteps.anadearticulodesdePDP(DatosArticulo.get(i).getCategoria()+DatosArticulo.get(i).getTalla(),DatosArticulo.get(i).getPlu());
		busquedaDeaArticulosPorSubcategoriaSteps.CerrarMiniCarro();
		}
		}
	}	
	@Then("^Cerrar minicarro$")
	public void cerrar_minicarro() throws Throwable {
	    
	}

}
