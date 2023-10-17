package fetchingdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataFromExcel {
	
	@Test
	public LocalDateTime readDataFromExcel(String sheetName,int rowNo,int column) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(column);
		LocalDateTime data = cell.getLocalDateTimeCellValue();
		workbook.close();
		return data;
	}
	
}
