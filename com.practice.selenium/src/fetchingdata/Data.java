package fetchingdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Data {
	

	@Test
	public void data() throws EncryptedDocumentException, IOException {
		FetchDataFromExcel f=new FetchDataFromExcel();
		f.readDataFromExcel("login", 1, 2);
	}

}
