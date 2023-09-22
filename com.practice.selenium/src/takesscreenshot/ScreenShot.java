package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		//type casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//taking ss and storing in tempoary variable
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
//		//creating permanent location to store ss
//		File dest=new File("./screenshots/ss.png");
		
		//to add date and time
		Date date=new Date();
		String cdate = date.toString().replace(" ", "_").replace(":", "_");
		File dest=new File("./screenshots/"+cdate+".png");
		
		//copy from temp to permanent
		FileHandler.copy(temp, dest);
		
		driver.quit();
		
	}

}
