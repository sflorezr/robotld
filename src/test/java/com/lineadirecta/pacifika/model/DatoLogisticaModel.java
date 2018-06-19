package com.lineadirecta.pacifika.model;

import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import au.com.bytecode.opencsv.CSVReader;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DatoLogisticaModel {
	
	public List<LogisticaModel> LlenarLista (String strRuta) throws FileNotFoundException {
		
		try {
			List<LogisticaModel> DatosTransaccionList= new ArrayList<LogisticaModel>();
			@SuppressWarnings("resource")
			CSVReader dtdTransaccion = new CSVReader(new FileReader(strRuta), ',');
			String[] record = null;
			
			while((record = dtdTransaccion.readNext()) != null) {
				LogisticaModel logisticaModel = new LogisticaModel();
				logisticaModel.setCity(record[0]);
				logisticaModel.setDiasn(record[1]);
				logisticaModel.setPrecion(record[2]);
				logisticaModel.setDiasrango2(record[3]);
				logisticaModel.setPreciona(record[4]);
				logisticaModel.setDiasm(record[5]);
				logisticaModel.setPreciom(record[6]);
				logisticaModel.setDiasfree(record[7]);
				logisticaModel.setContraentrega(record[8]);			
				DatosTransaccionList.add(logisticaModel);				
			}
			return DatosTransaccionList;
		}catch(Exception ex) {			
			return null;
		}
	}
	public void Escribir(String cadena) throws Throwable{
		String ruta="src/test/resources/datadriven/log.txt";
		java.util.Date fecha = new Date();
		FileWriter flwriter = null;
		flwriter = new FileWriter(ruta,true);
		BufferedWriter bfwriter = new BufferedWriter(flwriter);
		bfwriter.write(fecha + cadena + "\r\n");
		bfwriter.close();
	}
	@SuppressWarnings("resource")
	public void leer() throws Throwable{
		File file = new File("src/test/resources/datadriven/log.txt");
		Scanner scanner;
		scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				JOptionPane.showMessageDialog(null, scanner.nextLine());
			}
	}
	public void editar(String ruta,int fila) throws BiffException, IOException {
		File file=new File(ruta);
		if (file.exists()) {
			try {						
			Workbook workbook = Workbook.getWorkbook(new File(ruta));
			WritableWorkbook copy=Workbook.createWorkbook(new File(ruta),workbook);
			WritableSheet copysheet=copy.getSheet(0);
			Label label1=new Label(4,fila,"Si");
			copysheet.addCell(label1);
			copy.write();
			copy.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
