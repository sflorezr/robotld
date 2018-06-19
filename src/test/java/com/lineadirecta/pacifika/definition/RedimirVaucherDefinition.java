package com.lineadirecta.pacifika.definition;

import java.util.Calendar;
import java.util.List;
import com.lineadirecta.pacifika.model.CuponesModel;
import java.time.LocalDate;
import com.lineadirecta.pacifika.model.DatosVaucherModel;
import com.lineadirecta.pacifika.model.RedimirVaucherModel;
import com.lineadirecta.pacifika.model.SesionModel;
import com.lineadirecta.pacifika.steps.RedimirVaucherSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RedimirVaucherDefinition {
	@Steps
	RedimirVaucherSteps redimirVaucherSteps;
	DatosVaucherModel datosRedimirVaucher=new DatosVaucherModel();
	public List<RedimirVaucherModel> datovaucher=null;
	public static List<CuponesModel> cupon=null;
	@Given("^teniendo datos en lista \"([^\"]*)\"$")
	public void teniendo_datos_en_lista(String ruta) throws Throwable {
		datovaucher=datosRedimirVaucher.LlenarLista(ruta);
		ruta=ruta.substring(0, (ruta.length()-11));
		ruta=ruta+"cupones.xls";
		SesionModel.rutacupones=ruta;
		cupon=datosRedimirVaucher.LlenarListaCupones(ruta);	
	}
	@When("^Estando en orden$")
	public void estando_en_orden() throws Throwable {
		redimirVaucherSteps.IrAOrden();
	}
	@When("^digito vaucher y verifico totales$")
	public void digito_vaucher_y_verifico_totales() throws Throwable {	
		int saldo=0;

        Calendar fecha = Calendar.getInstance();        		
		LocalDate a=LocalDate.of(fecha.get(com.ibm.icu.util.Calendar.YEAR),fecha.get(com.ibm.icu.util.Calendar.MONTH)+1,fecha.get(com.ibm.icu.util.Calendar.DAY_OF_MONTH));		
		for (int i=1;i<datovaucher.size();i++){
			LocalDate b=LocalDate.of(Integer.parseInt(datovaucher.get(i).getFecha().substring(6,10)),Integer.parseInt(datovaucher.get(i).getFecha().substring(3, 5)),Integer.parseInt(datovaucher.get(i).getFecha().substring(0, 2)));			
				if (SesionModel.tipo != null && SesionModel.tipo != "") {
					if (datovaucher.get(i).getUsuarios().equals("ambos")) {
					redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());
					redimirVaucherSteps.Aplicar();
					for(int j=1;j<cupon.size();j++) {
						if(cupon.get(j).getCupon().equals(datovaucher.get(i).getCodigo()) && SesionModel.contrasena.equals(cupon.get(j).getUsuaio())) {
							saldo=saldo+Integer.parseInt(cupon.get(j).getCantidad());
						}
					}
					if(b.isBefore(a)) {
						redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajedf());
					}else {
						if(saldo>Integer.parseInt(datovaucher.get(i).getMaxred())) {
							redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajedr());
						}else {
							redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensaje());
							redimirVaucherSteps.VerificaDescuento(datovaucher.get(i).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(i).getValor(),redimirVaucherSteps.VerTotal() );
							redimirVaucherSteps.QuitarVaucher();
						}
					}
					}else {
						if (SesionModel.tipo.equals(datovaucher.get(i).getUsuarios())){
							redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());
							redimirVaucherSteps.Aplicar();
							for(int j=1;j<cupon.size();j++) {
								if(cupon.get(j).getCupon().equals(datovaucher.get(i).getCodigo())) {
									saldo=saldo+Integer.parseInt(cupon.get(j).getCantidad());
								}
							}
							if(b.isBefore(a)) {
								redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajedf());
							}else {
								if (saldo>Integer.parseInt(datovaucher.get(i).getMaxredxp().replaceAll(".0",""))) {
									redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajedr());
								}else {
									redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensaje());
									redimirVaucherSteps.VerificaDescuento(datovaucher.get(i).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(i).getValor(),redimirVaucherSteps.VerTotal() );
									redimirVaucherSteps.QuitarVaucher();	
								}	
							}
						}else {
							redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());
							redimirVaucherSteps.Aplicar();
							redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajer());
						}
					}
				}else {
					if (datovaucher.get(i).getUsuarios().equals("ambos")||datovaucher.get(i).getUsuarios().equals("normal")) {
						redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());
						redimirVaucherSteps.Aplicar();
						redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensaje());
						redimirVaucherSteps.VerificaDescuento(datovaucher.get(i).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(i).getValor(),redimirVaucherSteps.VerTotal() );
						redimirVaucherSteps.QuitarVaucher();
					}else {
						redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());
						redimirVaucherSteps.Aplicar();
						redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensajer());
					}
				}
			}
	}

	@When("^digito vaucher de tipo \"([^\"]*)\"$")
	public void digito_vaucher_de_tipo(String tipo) throws Throwable {	
		redimirVaucherSteps.IrAOrden();
		for (int i=1;i<datovaucher.size();i++){
			if ((datovaucher.get(i).getTipo().equals(tipo)) && ((SesionModel.tipo.equals(datovaucher.get(i).getUsuarios())||datovaucher.get(i).getUsuarios().equals("ambos")))){				
			redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());			
			redimirVaucherSteps.Aplicar();			
			redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensaje());
			redimirVaucherSteps.VerificaDescuento(datovaucher.get(i).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(i).getValor(),redimirVaucherSteps.VerTotal() );
			SesionModel.cupon=datovaucher.get(i).getCodigo();
			i=datovaucher.size();
			}
		}
	}
	
	@When("^digito vaucher de tipo \"([^\"]*)\" usuario \"([^\"]*)\"$")
	public void digito_vaucher_de_tipo_usuario(String tipo, String usuario) throws Exception {
		redimirVaucherSteps.IrAOrden();
		for (int i=1;i<datovaucher.size();i++){
			if ((datovaucher.get(i).getTipo().equals(tipo)) && ((usuario.equals(datovaucher.get(i).getUsuarios())||datovaucher.get(i).getUsuarios().equals("ambos")))){				
			redimirVaucherSteps.EscribirVaucher(datovaucher.get(i).getCodigo());			
			redimirVaucherSteps.Aplicar();			
			redimirVaucherSteps.VerificarMensaje(datovaucher.get(i).getMensaje());
			redimirVaucherSteps.VerificaDescuento(datovaucher.get(i).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(i).getValor(),redimirVaucherSteps.VerTotal() );
			SesionModel.cupon=datovaucher.get(i).getCodigo();
			i=datovaucher.size();
			}
		}		
	}	
		@When("^verifica totales$")
	public void verifica_totales() throws Throwable{
		for (int i=1;i<=redimirVaucherSteps.Filas();i++){
				redimirVaucherSteps.verificartotales(redimirVaucherSteps.PrecioUnitario(String.valueOf(i)),redimirVaucherSteps.Cantidad(String.valueOf(i-1)),redimirVaucherSteps.TotalPorArticulos(String.valueOf(i)));
		}		
	}
		@When("^verifica totales aliada$")
	public void verifica_totales_alaidas() throws Throwable{
		for (int i=1;i<=redimirVaucherSteps.Filas();i++){
				redimirVaucherSteps.verificartotalesaliadas(redimirVaucherSteps.PrecioUnitario(String.valueOf(i)),redimirVaucherSteps.Cantidad(String.valueOf(i-1)),redimirVaucherSteps.TotalPorArticulos(String.valueOf(i)),25);				
		}		
	}

		@When("^verifica totales normal$")
	public void verifica_totales_normal() throws Throwable{
		for (int i=1;i<=redimirVaucherSteps.Filas();i++){
				redimirVaucherSteps.verificartotales(redimirVaucherSteps.PrecioUnitario(String.valueOf(i)),redimirVaucherSteps.Cantidad(String.valueOf(i-1)),redimirVaucherSteps.TotalPorArticulos(String.valueOf(i)));				
		}		
	}		
		@When("^Ir a orden$")
	public void ir_a_orden() throws Throwable {
			redimirVaucherSteps.AbrirCar();
		}	
		@When("^Aumenta articulos$")
	public void aumenta_articulos() throws Throwable {
			redimirVaucherSteps.AumentarArticulo();
		}
		
		@When("^disminuye articulos$")
		public void disminuye_articulos() throws Throwable {
				redimirVaucherSteps.DisminuyeArticulo();
			}
		@When("^Baja un articulo$")
		public void baja_un_articulo() throws Throwable {
				redimirVaucherSteps.BajaunArticulo();
			}		
	@Then("^verifica label de descuento y total$")
	public void verifica_label_de_descuento_y_total() throws Throwable {		
		redimirVaucherSteps.VerificarMensaje(datovaucher.get(1).getMensaje());
		redimirVaucherSteps.VerificaDescuento(datovaucher.get(1).getTipo(),redimirVaucherSteps.VerSubtotal(),datovaucher.get(1).getValor(),redimirVaucherSteps.VerTotal() );
//		redimirVaucherSteps.QuitarVaucher();	
	}
}
