package com.sample1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class Excel {
	
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Dhinesh\\eclipse-workspace\\FrameWorkClass1\\File\\Reservation.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("adactin");

//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				CellType type = cell.getCellType();
//				switch (type) {
//				case STRING:
//					String txt = cell.getStringCellValue();
//					System.out.println(txt);
//					break;
//				case NUMERIC:
//					if (DateUtil.isCellDateFormatted(cell)) {
//						Date dateCellValue = cell.getDateCellValue();					
//						SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
//						String format2 = format.format(dateCellValue);
//						System.out.println(format2);
//					}else {
//						double d = cell.getNumericCellValue();
//						long round = Math.round(d);
//						System.out.println(round);
//					}
//					break;
//				default:
//					break;
//				}
//			}
//		}
	}

}
	
	
