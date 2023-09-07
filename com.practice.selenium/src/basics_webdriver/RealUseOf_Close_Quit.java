package basics_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealUseOf_Close_Quit {
	
	//==1==Back ground termination
	//==2==close will close only the page which is under the driver ref/control
	   //quit will close all the pages which is present in current selenium session
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		//driver.close();
		driver.quit();
		
	}

}
