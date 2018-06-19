package com.lineadirecta.pacifika.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class DatosCompraTarjetaDebitoModel {
	public List<CompraTarjetaDebitoModel> LlenarLista (String strRuta) throws FileNotFoundException {
		
		try {
			List<CompraTarjetaDebitoModel> DatosTransaccionList= new ArrayList<CompraTarjetaDebitoModel>();
			@SuppressWarnings("resource")
			CSVReader dtdTransaccion = new CSVReader(new FileReader(strRuta), ',');
			String[] record = null;
			
			while((record = dtdTransaccion.readNext()) != null) {
				CompraTarjetaDebitoModel compraTarjetaDebitoModel = new CompraTarjetaDebitoModel();
				compraTarjetaDebitoModel.setBanco(record[0]);
				compraTarjetaDebitoModel.setCorreo(record[1]);
				compraTarjetaDebitoModel.setFecha(record[2]);
				compraTarjetaDebitoModel.setEstado(record[3]);
				compraTarjetaDebitoModel.setId(record[4]);
				compraTarjetaDebitoModel.setMensaje(record[5]);
				compraTarjetaDebitoModel.setTipo(record[6]);
				DatosTransaccionList.add(compraTarjetaDebitoModel);				
			}
			return DatosTransaccionList;
		}catch(Exception ex) {			
			return null;
		}
	}	
}
