package fetchingdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {
	
	public void writeData() throws EncryptedDocumentException, IOException {
		//step 1-->create workbook
		FileInputStream fis=new FileInputStream("./resourse/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		//step 2-->get the control of the sheet
		Sheet sheet = workbook.getSheet("login");
		//step 3-->get the control of the row
		Row row = sheet.getRow(1);
		//step 4-->create a seperate cell to store data
		Cell cell = row.createCell(3);
		cell.setCellType(CellType.STRING);
		//step 5-->pass the data
		cell.setCellValue("ALIABHATT");
		//step 6-->open the workbook in write mode
		FileOutputStream fos=new FileOutputStream("./resourse/testData.xlsx");
		workbook.write(fos);
		//step 7-->close
		workbook.close();
		
		
	}

}
