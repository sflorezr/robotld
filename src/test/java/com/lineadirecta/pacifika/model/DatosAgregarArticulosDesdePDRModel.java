package com.lineadirecta.pacifika.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class DatosAgregarArticulosDesdePDRModel {	
	public List<AgregarArticulosDesdePDRModel> LlenarLista (String strRuta) throws FileNotFoundException {		
		try {
			List<AgregarArticulosDesdePDRModel> DatosTransaccionList= new ArrayList<AgregarArticulosDesdePDRModel>();
			@SuppressWarnings("resource")
			CSVReader dtdTransaccion = new CSVReader(new FileReader(strRuta), ',');
			String[] record = null;
			
			while((record = dtdTransaccion.readNext()) != null) {
				AgregarArticulosDesdePDRModel agregarArticulosDesdePDRModel = new AgregarArticulosDesdePDRModel();
				agregarArticulosDesdePDRModel.setCategoria(record[0]);
				agregarArticulosDesdePDRModel.setSubcategoria(record[1]);
				agregarArticulosDesdePDRModel.setTalla(record[2]);
				agregarArticulosDesdePDRModel.setCantidad(record[3]);
				agregarArticulosDesdePDRModel.setCodigo(record[4]);				
				agregarArticulosDesdePDRModel.setPosicion(record[5]);
				agregarArticulosDesdePDRModel.setPlu(record[6]);
				DatosTransaccionList.add(agregarArticulosDesdePDRModel);				
			}
			return DatosTransaccionList;
		}catch(Exception ex) {			
			return null;
		}
	}	

}
