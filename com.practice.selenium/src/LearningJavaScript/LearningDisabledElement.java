package LearningJavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDisabledElement {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(5000);
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].value='Qspiders'",ele);
		
		driver.findElement(By.id("show-textbox")).click();
	}

}
