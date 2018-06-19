package com.lineadirecta.pacifika.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class DatosVaucherModel {
	
	@SuppressWarnings("deprecation")
	public List<RedimirVaucherModel> LlenarLista (String strRuta) throws FileNotFoundException {
		String error="";
		try {
			List<RedimirVaucherModel> DatosTransaccionList= new ArrayList<RedimirVaucherModel>();			
    		FileInputStream fis = new FileInputStream(new File(strRuta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
    		FormulaEvaluator formulaEvaluator= wb.getCreationHelper().createFormulaEvaluator();
    		for (Row row : sheet) {   
    			RedimirVaucherModel cuponModel = new RedimirVaucherModel();
    			for (Cell cell: row) {    				
    				switch (cell.getColumnIndex()) {
    					case 0: cuponModel.setCodigo(cell.getStringCellValue()); break;	 						    
    					case 1: cuponModel.setTipo(cell.getStringCellValue()); break;								
    					case 2: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setValor(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setValor(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 3: cuponModel.setMensaje(cell.getStringCellValue()); break;
    					case 4: cuponModel.setUsuarios(cell.getStringCellValue()); break;    						
    					case 5: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setMaxred(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setMaxred(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 6: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setMaxredxp(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setMaxredxp(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;    						
    					case 7: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setRedimidos(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setRedimidos(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 8: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setFecha(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setFecha(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 9: cuponModel.setMensajedr(cell.getStringCellValue()); break;
    					case 10: cuponModel.setMensajedf(cell.getStringCellValue()); break;    						
    					case 11: cuponModel.setMensajer(cell.getStringCellValue()); break;    								
    					}    			
    			}
    			DatosTransaccionList.add(cuponModel);			
    		}
    	return DatosTransaccionList;	
		}catch(Exception ex) {
			System.out.print(error);
			ex.printStackTrace();
			return null;
		}		
	}
	
	public void Escribir(String usuario,String cupon) throws Throwable{
		String ruta="src/test/resources/datadriven/cupones.xls";
		java.util.Date fecha = new Date();
	
    	try {
    		FileInputStream fis = new FileInputStream(new File(ruta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
            Workbook aWorkBook = Workbook.getWorkbook(new File(ruta));
            WritableWorkbook aCopy = Workbook.createWorkbook(new File(ruta), aWorkBook);

            WritableSheet aCopySheet = aCopy.getSheet(0);

            Label anotherWritableCell =  new Label(0,sheet.getLastRowNum()+1,usuario);
            Label anotherWritableCell1 =  new Label(1,sheet.getLastRowNum()+1,cupon);
            Label anotherWritableCell2 =  new Label(2,sheet.getLastRowNum()+1,fecha.toString());
            Label anotherWritableCell3 =  new Label(2,sheet.getLastRowNum()+1,"1");
            aCopySheet.addCell(anotherWritableCell);
            aCopySheet.addCell(anotherWritableCell1);
            aCopySheet.addCell(anotherWritableCell2);
            aCopySheet.addCell(anotherWritableCell3);
            aCopy.write();
            aCopy.close(); 
    	}catch (Exception e) {
    		e.printStackTrace();
    	}		
	}
	
	public void editar(String ruta,int fila,String saldo) throws BiffException, IOException {
		File file=new File(ruta);
		if (file.exists()) {
			try {						
			Workbook workbook = Workbook.getWorkbook(new File(ruta));
			WritableWorkbook copy=Workbook.createWorkbook(new File(ruta),workbook);
			WritableSheet copysheet=copy.getSheet(0);
			Label label1=new Label(2,fila,saldo);
			copysheet.addCell(label1);
			copy.write();
			copy.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}	

	@SuppressWarnings("deprecation")
	public List<CuponesModel> LlenarListaCupones (String strRuta) throws FileNotFoundException {
		String error="";
		try {
			List<CuponesModel> DatosTransaccionList= new ArrayList<CuponesModel>();			
    		FileInputStream fis = new FileInputStream(new File(strRuta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
    		FormulaEvaluator formulaEvaluator= wb.getCreationHelper().createFormulaEvaluator();
    		for (Row row : sheet) {   
    			CuponesModel cuponModel = new CuponesModel();
    			for (Cell cell: row) {    				
    				switch (cell.getColumnIndex()) {
    					case 0: cuponModel.setUsuaio(cell.getStringCellValue()); break;	 						    
    					case 1: cuponModel.setCupon(cell.getStringCellValue()); break;								
    					case 2: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:cuponModel.setCantidad(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:cuponModel.setCantidad(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;								
    					}    			
    			}
    			DatosTransaccionList.add(cuponModel);			
    		}
    	return DatosTransaccionList;	
		}catch(Exception ex) {
			System.out.print(error);
			ex.printStackTrace();
			return null;
		}		
	}
	
}
