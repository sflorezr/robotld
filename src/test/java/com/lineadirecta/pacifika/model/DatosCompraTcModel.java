package com.lineadirecta.pacifika.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import au.com.bytecode.opencsv.CSVReader;

public class DatosCompraTcModel {
	public List<CompraTCModel> LlenarLista (String strRuta) throws FileNotFoundException {
		
		try {
			List<CompraTCModel> DatosCompraList= new ArrayList<CompraTCModel>();
			@SuppressWarnings("resource")
			CSVReader dtdCompra = new CSVReader(new FileReader(strRuta), ',');
			String[] record = null;
			
			while((record = dtdCompra.readNext()) != null) {
				CompraTCModel compraTCModel = new CompraTCModel();
				if (record[0] != ""){
				compraTCModel.setNumero(record[0]);
				compraTCModel.setMes(record[1]);
				compraTCModel.setAnos(record[2]);
				compraTCModel.setNumverifica(record[3]);
				compraTCModel.setCuotas(record[4]);
				compraTCModel.setTitular(record[5]);
				compraTCModel.setTipodoc(record[6]);
				compraTCModel.setDocumento(record[7]);
				compraTCModel.setTelefono(record[8]);
				compraTCModel.setCorreo(record[9]);
				compraTCModel.setEstado(record[11]);
				compraTCModel.setMensaje(record[12]);
				DatosCompraList.add(compraTCModel);
				}
			}
			return DatosCompraList;
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "no paso");
			return null;
		}
	}	
}
