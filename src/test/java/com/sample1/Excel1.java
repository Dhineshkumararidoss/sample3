package com.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class Excel1 {
	
	public static void main (String[]arg) throws IOException {
		File file = new File ("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");
//	    FileInputStream stream = new FileInputStream(file);
	    Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet("register");
//		Row row = sheet.getRow(8);
//		Cell cell = row.getCell(4);
	  //  replace cell value
	    
//		String value1 = cell.getStringCellValue();
//		if(value1.equals("Super Deluxe")) {
//			cell.setCellValue("Deluxe");	
//		}
	    // Empty Cell Value
	    
//		 Row row2 = sheet.getRow(3);
//		 Cell cell2 = row2.createCell(2);
//       cell2.setCellValue("login");
	    //Empty Row Cell Value
//	    Row createRow = sheet.createRow(12);
//	    Cell createCell = createRow.createCell(0);	    
//	    createCell.setCellValue("FeedBack");
	    
	    Row row = sheet.getRow(8);
	    Cell cell = row.createCell(7);
	    cell.setCellValue("confirm");
	    
	    FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		}
}
