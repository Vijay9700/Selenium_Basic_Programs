package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetAttribute {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify firstname textfield
		WebElement firstnameTextfield = driver.findElement(By.id("email"));
		//use of get attribute-->it will give the attribute value
		System.out.println(firstnameTextfield.getAttribute("placeholder"));
		driver.quit();
	}

}
