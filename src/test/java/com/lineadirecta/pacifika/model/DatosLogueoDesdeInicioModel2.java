package com.lineadirecta.pacifika.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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

public class DatosLogueoDesdeInicioModel2 {

		
	@SuppressWarnings("deprecation")
	public List<LogueoDesdeInicioModel> LlenarLista (String strRuta) throws FileNotFoundException {
		String error="";
		try {
			List<LogueoDesdeInicioModel> DatosTransaccionList= new ArrayList<LogueoDesdeInicioModel>();			
    		FileInputStream fis = new FileInputStream(new File(strRuta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
    		FormulaEvaluator formulaEvaluator= wb.getCreationHelper().createFormulaEvaluator();
    		for (Row row : sheet) {   
    			LogueoDesdeInicioModel LogueoModel = new LogueoDesdeInicioModel();
    			for (Cell cell: row) {    				
    				switch (cell.getColumnIndex()) {
    					case 0: LogueoModel.setCorreo(cell.getStringCellValue()); break;	 						    
    					case 1: switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
									case Cell.CELL_TYPE_STRING:LogueoModel.setContrasena(cell.getStringCellValue()); break;
									case Cell.CELL_TYPE_NUMERIC:LogueoModel.setContrasena(String.valueOf(cell.getNumericCellValue())); break;
								}  break;    						
    					case 2: LogueoModel.setNombre(cell.getStringCellValue()); break;
    					case 3: LogueoModel.setApellido(cell.getStringCellValue()); break;
    					case 4: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setCelular(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setCelular(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 5: LogueoModel.setAliada(cell.getStringCellValue()); break;
    					case 6: LogueoModel.setTipo(cell.getStringCellValue()); break;
    					case 7: LogueoModel.setSexo(cell.getStringCellValue()); break;
    					case 8: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setContrasenacorreo(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setContrasenacorreo(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 9: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setStorec(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setStorec(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 10: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setCredito(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setCredito(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 11: LogueoModel.setDestinatario(cell.getStringCellValue()); break;
    					case 12: LogueoModel.setDirecccion(cell.getStringCellValue()); break;
    					case 13: LogueoModel.setComplemento(cell.getStringCellValue()); break;
    					case 14: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setDane(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setDane(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;
    					case 15: LogueoModel.setBarrio(cell.getStringCellValue()); break;
    					case 16: LogueoModel.setComentario(cell.getStringCellValue()); break;
    					case 17: 
    						switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
							case Cell.CELL_TYPE_STRING:LogueoModel.setCedula(cell.getStringCellValue()); break;
							case Cell.CELL_TYPE_NUMERIC:LogueoModel.setCedula(String.valueOf(cell.getNumericCellValue())); break;
    						}  break;    					
    				}    			
    			}
    			DatosTransaccionList.add(LogueoModel);
				
    		}
    	return DatosTransaccionList;	
		}catch(Exception ex) {
			System.out.print(error);
			ex.printStackTrace();
			return null;
		}		
	}	
	
	public void ActSaldoCredit(String ruta,String saldo,int fila) throws BiffException, IOException {
		File file=new File(ruta);
		if (file.exists()) {
			try {						
			Workbook workbook = Workbook.getWorkbook(new File(ruta));
			WritableWorkbook copy=Workbook.createWorkbook(new File(ruta),workbook);
			WritableSheet copysheet=copy.getSheet(0);
			Label label1=new Label(10,fila,saldo);
			copysheet.addCell(label1);
			copy.write();
			copy.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}	

	public void ActSaldoStoreCredit(String ruta,String saldo,int fila) throws BiffException, IOException {
		File file=new File(ruta);
		if (file.exists()) {
			try {						
			Workbook workbook = Workbook.getWorkbook(new File(ruta));
			WritableWorkbook copy=Workbook.createWorkbook(new File(ruta),workbook);
			WritableSheet copysheet=copy.getSheet(0);
			Label label1=new Label(9,fila,saldo);
			copysheet.addCell(label1);
			copy.write();
			copy.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void ActTipoUsuario(String ruta,String tipo,int fila) throws BiffException, IOException {
		File file=new File(ruta);
		if (file.exists()) {
			try {						
			Workbook workbook = Workbook.getWorkbook(new File(ruta));
			WritableWorkbook copy=Workbook.createWorkbook(new File(ruta),workbook);
			WritableSheet copysheet=copy.getSheet(0);
			Label label1=new Label(6,fila,tipo);
			copysheet.addCell(label1);
			copy.write();
			copy.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
