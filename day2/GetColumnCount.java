package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetColumnCount {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./DataforExcel/CreateLead.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		for (int i = 1; i <=lastRowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		short lastCellNum = row.getLastCellNum();
			for (int j = 0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				wb.close();
			}
	
		}
		
	}
	}


