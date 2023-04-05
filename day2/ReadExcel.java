package week6.day2;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//open excel
		XSSFWorkbook wb = new XSSFWorkbook("./DataforExcel/createLead.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		//XSSFRow row = sheet.getRow(0);
		//XSSFCell cell = row.getCell(0);
		//String cellValue = cell.getStringCellValue();
	//	System.out.println(cellValue);
	for (int i = 0; i <=2; i++) {
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
	}
		wb.close();
	}

}
