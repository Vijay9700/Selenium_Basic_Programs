package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetTagName {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify firstname textfield
		WebElement firstnameTextfield = driver.findElement(By.id("email"));
		//use of getTagName-->It will give the tag name of the particular element
		System.out.println(firstnameTextfield.getTagName());
		driver.quit();
	}

}
