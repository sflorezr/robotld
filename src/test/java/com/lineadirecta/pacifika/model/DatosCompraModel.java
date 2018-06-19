package com.lineadirecta.pacifika.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class DatosCompraModel {
	@SuppressWarnings("deprecation")
	public List<ComprasModel> LlenarLista (String strRuta) throws FileNotFoundException {
		String error="";
		try {
			List<ComprasModel> DatosTransaccionList= new ArrayList<ComprasModel>();			
    		FileInputStream fis = new FileInputStream(new File(strRuta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
    		FormulaEvaluator formulaEvaluator= wb.getCreationHelper().createFormulaEvaluator();
    		for (Row row : sheet) {   
    			ComprasModel comprasModel = new ComprasModel();
    			for (Cell cell: row) {    				
    				switch (cell.getColumnIndex()) {
    					case 0: comprasModel.setUsuario(cell.getStringCellValue()); break;	 						    
    					case 1: switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
									case Cell.CELL_TYPE_STRING:comprasModel.setNumero(cell.getStringCellValue()); break;
									case Cell.CELL_TYPE_NUMERIC:comprasModel.setNumero(String.valueOf(cell.getNumericCellValue())); break;
								}  break;    						
    					case 3: comprasModel.setEstado(cell.getStringCellValue()); break;
    					case 4: comprasModel.setRevisado(cell.getStringCellValue()); break;
    				}    			
    			}
    			DatosTransaccionList.add(comprasModel);
    		}			
			return DatosTransaccionList;
		}catch(Exception ex) {
			System.out.print(error);
			ex.printStackTrace();
			return null;
		}
	}	
}
