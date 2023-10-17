package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//type casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//identify webelement
		WebElement emailTextField = driver.findElement(By.id("email"));
		File temp = emailTextField.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshots/WEss.png");
		FileHandler.copy(temp, perm);
		driver.quit();
	}

}
