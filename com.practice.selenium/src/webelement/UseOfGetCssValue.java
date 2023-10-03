package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCssValue {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify firstname textfield
		WebElement firstnameTextfield = driver.findElement(By.id("email"));
		//use of getCssValue
		System.out.println(firstnameTextfield.getCssValue("color"));
		System.out.println(firstnameTextfield.getCssValue("font-size"));
		Thread.sleep(2000);
		driver.quit();
	}

}
