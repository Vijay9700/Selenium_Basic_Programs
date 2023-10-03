package LearningJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScrollByView {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.id("hide-textbox"));
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		
	}

}
