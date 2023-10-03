package LearningJavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScrollBy 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,100)");
	}

}
