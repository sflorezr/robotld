package com.lineadirecta.pacifika.definition;

import com.lineadirecta.pacifika.steps.CasoFelizCompraTcSteps;
import com.lineadirecta.pacifika.steps.CheckOutSteps;
import com.lineadirecta.pacifika.steps.CompraEfectivoSteps;
import com.lineadirecta.pacifika.steps.LogisiticaSteps;
import com.lineadirecta.pacifika.steps.LogueoDesdeInicioSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;
import com.lineadirecta.pacifika.Mail;
import com.lineadirecta.pacifika.model.ComprasModel;
import com.lineadirecta.pacifika.model.DatosCompraModel;
import com.lineadirecta.pacifika.model.DatosLogueoDesdeInicioModel2;
import com.lineadirecta.pacifika.model.LogueoDesdeInicioModel;
import com.lineadirecta.pacifika.model.SesionModel;

public class LogueoDesdeInicioDefinition {
	public SesionModel sesionModel=new SesionModel();
	public String ruta1="";
	@Steps
	LogueoDesdeInicioSteps logueoDesdeInicioSteps;
	@Steps
	LogisiticaSteps logisiticaSteps;	
	@Steps	
	CheckOutSteps checkOutSteps;
	@Steps
	CasoFelizCompraTcSteps compraTCSteps;
	@Steps
	CompraEfectivoSteps compraEfectivoSteps;
	
	DatosLogueoDesdeInicioModel2 datosLogueoDesdeInicioModel=new DatosLogueoDesdeInicioModel2();
	public static List<LogueoDesdeInicioModel> DatosLogue=null;
	public static String rutausuarios="";
	Mail mail=new Mail();
	@Given("^Estando en pagina de logeo$")
	public void estando_en_pagina_de_logeo() throws Throwable {
		SesionModel.correo="";
		SesionModel.tipo="";
		logueoDesdeInicioSteps.AbrirPaginaLogueo();
	}
	@Given("^Tengo datos a ingresar \"([^\"]*)\"$")
	public void Tengo_datos_a_ingresar(String ruta) throws Throwable {
		rutausuarios=ruta;
		DatosLogue  = datosLogueoDesdeInicioModel.LlenarLista(ruta);
	}	
	@When("^Logueo usuairo normal$")
	public void Logueo_usuairo_normal() throws Throwable {	
		for (int i=1;i<DatosLogue.size();i++ ){		
		if (DatosLogue.get(i).getTipo().equals("normal")){
			logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
			SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
			sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
			SesionModel.tipo="normal";
			SesionModel.posicion=i;
			//JOptionPane.showMessageDialog(null, DatosLogue.get(i).getStrContrasena());
			logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
			i=DatosLogue.size();
			}
		}
		logueoDesdeInicioSteps.Ingresar();
	}
	@When("^Logueo usuairo aliada$")
	public void Logueo_usuairo_aliada() throws Throwable {	
		for (int i=1;i<DatosLogue.size();i++ ){		
		if (DatosLogue.get(i).getTipo().equals("aliada")){
			logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
			logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
			SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
			sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
			SesionModel.tipo="aliada";
			SesionModel.posicion=i;
			i=DatosLogue.size();
			}
		}
		logueoDesdeInicioSteps.Ingresar();
	}	
	
	@When("^Logueo usuairo \"([^\"]*)\"$")
	public void Logueo_usuairo(String tipo) throws Throwable {	
		for (int i=1;i<DatosLogue.size();i++ ){		
		if (DatosLogue.get(i).getTipo().equals(tipo)){
			logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
			logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
			SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
			sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
			SesionModel.tipo=tipo;
			SesionModel.posicion=i;
			SesionModel.celular=DatosLogue.get(i).getCelular();
			SesionModel.nombre=DatosLogue.get(i).getNombre();
			SesionModel.direccion=DatosLogue.get(i).getDirecccion();
			SesionModel.documento=DatosLogue.get(i).getCedula();
			i=DatosLogue.size();
			}
		}
		logueoDesdeInicioSteps.Ingresar();
	}	
	@When("^Logueo e Ir a Pasarela \"([^\"]*)\"$")
	public void Logueo_e_ir_a_Pasarela(String tipo) throws Throwable {
		compraTCSteps.LogueoePrePasarela();
		for (int i=1;i<DatosLogue.size();i++ ){	
			if (DatosLogue.get(i).getTipo().equals(tipo)){
				logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
				SesionModel.tipo=tipo;
				SesionModel.posicion=i;
				if (tipo.equals("normaln")) {
					logueoDesdeInicioSteps.UsuarioNuevo(DatosLogue.get(i).getNombre(), DatosLogue.get(i).getApellido(),DatosLogue.get(i).getContrasena(), DatosLogue.get(i).getSexo());
					if (SesionModel.tipo.substring(SesionModel.tipo.length()-1, SesionModel.tipo.length()).equals("n")) {
						switch (SesionModel.tipo){
						case "aliadan": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "aliada",SesionModel.posicion);
						break;
						case "normaln": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "normal",SesionModel.posicion);
						break;
						}
						
					}
					logueoDesdeInicioSteps.Datos(DatosLogue.get(i).getCedula(),DatosLogue.get(i).getCelular());
				}else {
					logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
					SesionModel.tipo=tipo;
					SesionModel.posicion=i;	
					if (SesionModel.tipo.substring(SesionModel.tipo.length()-1, SesionModel.tipo.length()).equals("n")) {
						switch (SesionModel.tipo){
						case "aliadan": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "aliada",SesionModel.posicion);
						break;
						case "normaln": checkOutSteps.ActTipoUsuario(LogueoDesdeInicioDefinition.rutausuarios, "normal",SesionModel.posicion);
						break;
						}
						
					}
					compraTCSteps.IraCheckOut();
				}
				SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
				sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
				SesionModel.tipo=tipo;
				SesionModel.posicion=i;	
				SesionModel.celular=DatosLogue.get(i).getCelular();
				SesionModel.nombre=DatosLogue.get(i).getNombre();
				SesionModel.direccion=DatosLogue.get(i).getDirecccion();
				SesionModel.documento=DatosLogue.get(i).getCedula();
				
				compraTCSteps.PasarelaPosLogueoNuevo(DatosLogue.get(i).getAliada(),tipo);	
				if (DatosLogue.get(i).getDirecccion()!=null) {
				logueoDesdeInicioSteps.verificarDireccion();
				logueoDesdeInicioSteps.Logistica(DatosLogue.get(i).getDirecccion(),DatosLogue.get(i).getComplemento(),DatosLogue.get(i).getDane(),DatosLogue.get(i).getBarrio(),DatosLogue.get(i).getComentario(),DatosLogue.get(i).getNombre());
				}
				compraTCSteps.PagarAhora2();
				i=DatosLogue.size();
			}
		}
	}	
	
	
	@When("^Logueo e Ir a Pasarela \"([^\"]*)\" mayor a \"([^\"]*)\"$")
	public void logueo_e_Ir_a_Pasarela_mayor_a(String tipo, int Sc) throws Throwable {
		compraTCSteps.LogueoePrePasarela();		
		for (int i=1;i<DatosLogue.size();i++ ){	
		if (DatosLogue.get(i).getTipo().equals(tipo) && (DatosLogue.get(i).getStorec() >= Sc) ){
			logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
			logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
			SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
			sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
			SesionModel.tipo=tipo;
			SesionModel.posicion=i;
			SesionModel.celular=DatosLogue.get(i).getCelular();
			SesionModel.nombre=DatosLogue.get(i).getNombre();
			SesionModel.direccion=DatosLogue.get(i).getDirecccion();
			SesionModel.documento=DatosLogue.get(i).getCedula();
			i=DatosLogue.size();
			compraTCSteps.PasarelaPosLogueo(tipo);
			}					
		}
	}	
	
	@Then("^Ingreso a la cuenta del usuario$")
	public void ingreso_a_la_cuenta_del_usuario() throws Throwable {
		
	}
	@When("^Ingreso a la cuenta del usuario para limpieza$")
	public void ingreso_a_la_cuenta_del_usuario_para_limpieza() throws Throwable {
		
	}
	@Then("^Verifica correo efectivo$")
	public void Verifica_correo_efectivo() throws Throwable{
		
		for (int i=1;i<DatosLogue.size();i++ ){		
		if (DatosLogue.get(i).getTipo().equals("normal")){
			mail.RecibirEmail(DatosLogue.get(i).getStrCorreo(),"Cucuta1234+",checkOutSteps.convenio());
			i=DatosLogue.size();
			}
		}		
		
	}
	DatosCompraModel datosCompra=new DatosCompraModel();
	public List<ComprasModel> Datos=null; 
	
	@Given("^Busco compras \"([^\"]*)\"$")
	public void busco_compras(String ruta) throws Throwable {
		ruta1=ruta;
		Datos = datosCompra.LlenarLista(ruta);
	}
	
	@When("^Logueo e Ir a Pasarela \"([^\"]*)\" con municipio sin contra entrega$")
	public void logueo_e_Ir_a_Pasarela_con_municipio_sin_contra_entrega(String tipo) throws Exception {
	
		compraTCSteps.LogueoePrePasarela();
		for (int i=1;i<DatosLogue.size();i++ ){	
		if (DatosLogue.get(i).getTipo().equals(tipo)){
			logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
			SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());			
				if (tipo.equals("nuevo")) {
					logueoDesdeInicioSteps.UsuarioNuevo(DatosLogue.get(i).getNombre(), DatosLogue.get(i).getApellido(),DatosLogue.get(i).getContrasena(), DatosLogue.get(i).getSexo());
					logueoDesdeInicioSteps.Datos(DatosLogue.get(i).getCedula(),DatosLogue.get(i).getCelular());
				}else {
					logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getContrasena());
					sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());
				}
				SesionModel.tipo=tipo;	
				SesionModel.celular=DatosLogue.get(i).getCelular();
				SesionModel.nombre=DatosLogue.get(i).getNombre();
				SesionModel.direccion=DatosLogue.get(i).getDirecccion();
				SesionModel.documento=DatosLogue.get(i).getCedula();
			compraTCSteps.PasarelaPosLogueoNuevo(DatosLogue.get(i).getAliada(),tipo);
			logueoDesdeInicioSteps.Logistica(DatosLogue.get(i).getDirecccion(),DatosLogue.get(i).getComplemento(),DatosLogue.get(i).getDane(),DatosLogue.get(i).getBarrio(),DatosLogue.get(i).getComentario(),DatosLogue.get(i).getNombre());
			for (int j=1;j<=CompraContraEntregaDefinition.Datos.size();j++) {
				if(CompraContraEntregaDefinition.Datos.get(j).getContraentrega().equals("N")) {
					logisiticaSteps.SeleccionaDepartamento(CompraContraEntregaDefinition.Datos.get(j).getDane());
					logisiticaSteps.SelecionMuncipio(CompraContraEntregaDefinition.Datos.get(j).getDane());
					j=CompraContraEntregaDefinition.Datos.size();
				}
			}
			compraTCSteps.PagarAhora2();
			i=DatosLogue.size();
		}
		}
	}
	
	
	@Then("^Verifica ordenes")
	public void verifica_ordenes() throws Throwable{
		int i=1;
		SesionModel.setCorreo("");
		for(i=1;i<Datos.size();i++) {
		 if (Datos.get(i).getRevisado() == null) {
			if (i==1) {
			for(int j=1;j<DatosLogue.size();j++) {
				if(Datos.get(i).getUsuario().equals(DatosLogue.get(j).getCorreo())){
					logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(i).getStrCorreo());
					logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(i).getStrContrasena());
					SesionModel.setCorreo(DatosLogue.get(i).getStrCorreo());
					sesionModel.setContrasena(DatosLogue.get(i).getStrContrasenaCorreo());			
					j=DatosLogue.size();
					compraEfectivoSteps.IraCompras();
					compraEfectivoSteps.DigitayVerifica(Datos.get(i).getNumero(),Datos.get(i).getEstado(),ruta1,i);
				}
					if (Datos.get(i).getUsuario().equals(Datos.get(i+1).getUsuario())) {					
						compraEfectivoSteps.DigitayVerifica(Datos.get(i+1).getNumero(),Datos.get(i+1).getEstado(),ruta1,i+1);
						i=i+1;
					}
			}
			}else {
				if(SesionModel.correo.equals(Datos.get(i).getUsuario())){
					compraEfectivoSteps.DigitayVerifica(Datos.get(i).getNumero(),Datos.get(i).getEstado(),ruta1,i);
					i=i++;
				}else {
					if (SesionModel.correo != "") {
					logueoDesdeInicioSteps.LogOuteIngresar();
					}
					for(int j=1;j<DatosLogue.size();j++) {											
						if(Datos.get(i).getUsuario().equals(DatosLogue.get(j).getCorreo())){
							logueoDesdeInicioSteps.DigitarCorreo(DatosLogue.get(j).getStrCorreo());
							logueoDesdeInicioSteps.DigitarContrasena(DatosLogue.get(j).getStrContrasena());
							SesionModel.setCorreo(DatosLogue.get(j).getStrCorreo());
							sesionModel.setContrasena(DatosLogue.get(j).getStrContrasenaCorreo());							
							j=DatosLogue.size();
							compraEfectivoSteps.IraCompras();
							compraEfectivoSteps.DigitayVerifica(Datos.get(i).getNumero(),Datos.get(i).getEstado(),ruta1,i);						
						}						
					}
				}
			}
		 }
		}
	}	
	public String RetornaCorreo(){
		return(sesionModel.getContrasena());
	}
}
