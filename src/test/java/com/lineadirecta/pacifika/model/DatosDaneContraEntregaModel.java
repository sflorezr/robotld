package com.lineadirecta.pacifika.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class DatosDaneContraEntregaModel {

	public List<DaneContraEntregaModel> LlenarLista (String strRuta) throws FileNotFoundException {
		
		try {
			List<DaneContraEntregaModel> DatosTransaccionList= new ArrayList<DaneContraEntregaModel>();
			@SuppressWarnings("resource")
			CSVReader dtdTransaccion = new CSVReader(new FileReader(strRuta), ',');
			String[] record = null;
			
			while((record = dtdTransaccion.readNext()) != null) {					
				DaneContraEntregaModel DaneModel = new DaneContraEntregaModel();
				DaneModel.setDane(record[0]);
				DaneModel.setContraentrega(record[1]);	
				DatosTransaccionList.add(DaneModel);				
			}
			return DatosTransaccionList;
		}catch(Exception ex) {			
			return null;
		}	
	}	
	
}
