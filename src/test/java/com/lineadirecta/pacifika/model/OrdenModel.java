package com.lineadirecta.pacifika.model;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class OrdenModel {

	public void Escribir(String usuario,String orden) throws Throwable{
		String ruta="src/test/resources/datadriven/orden.xls";
		String estado="Creado";
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
            Label anotherWritableCell1 =  new Label(1,sheet.getLastRowNum()+1,orden);
            Label anotherWritableCell2 =  new Label(2,sheet.getLastRowNum()+1,fecha.toString());
            Label anotherWritableCell3 =  new Label(3,sheet.getLastRowNum()+1,estado);
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
}
