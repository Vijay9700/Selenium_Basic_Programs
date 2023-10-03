package LearningJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		
//		WebElement ele = driver.findElement(By.id("hide-textbox"));
//		js.executeScript("arguments[0].scrollIntoView(false)",ele);
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement addTocartButton = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", addTocartButton);
	}

}
