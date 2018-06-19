package com.lineadirecta.pacifika.model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;

public class DatosLogueoDesdeInicioModel {

		
		public List<LogueoDesdeInicioModel> LlenarLista (String strRuta) throws FileNotFoundException {
			
			try {
				List<LogueoDesdeInicioModel> DatosTransaccionList= new ArrayList<LogueoDesdeInicioModel>();
				@SuppressWarnings("resource")
				CSVReader dtdTransaccion = new CSVReader(new FileReader(strRuta), ',');
				String[] record = null;
				
				while((record = dtdTransaccion.readNext()) != null) {					
					LogueoDesdeInicioModel logueoDesdeInicioModel = new LogueoDesdeInicioModel();
					logueoDesdeInicioModel.setStrCorreo(record[0]);
					logueoDesdeInicioModel.setStrContrasena(record[1]);
					logueoDesdeInicioModel.setNombre(record[2]);
					logueoDesdeInicioModel.setApellido(record[3]);
					logueoDesdeInicioModel.setCelular(record[4]);	
					logueoDesdeInicioModel.setAliada(record[5]);
					logueoDesdeInicioModel.setTipo(record[6]);
					logueoDesdeInicioModel.setSexo(record[7]);
					logueoDesdeInicioModel.setContrasenacorreo(record[8]);
					logueoDesdeInicioModel.setStorec(record[9]);
					logueoDesdeInicioModel.setDestinatario(record[10]);
					logueoDesdeInicioModel.setDirecccion(record[11]);
					logueoDesdeInicioModel.setComplemento(record[12]);
					logueoDesdeInicioModel.setDane(record[13]);
					logueoDesdeInicioModel.setBarrio(record[14]);
					logueoDesdeInicioModel.setComentario(record[15]);
					logueoDesdeInicioModel.setCedula(record[16]);	
					DatosTransaccionList.add(logueoDesdeInicioModel);				
				}
				return DatosTransaccionList;
			}catch(Exception ex) {			
				return null;
			}	
		}	
}
