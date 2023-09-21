package basics_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfManage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		Options obj1 = driver.manage();
//		Window obj2 = obj1.window();
//		obj2.maximize();
//		Thread.sleep(2000);
//		obj2.minimize();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.quit();
		
		
	}

}
