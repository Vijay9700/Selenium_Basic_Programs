package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//avoid the login window
		driver.findElement(By.xpath("//span[@role='button']")).click();
		//search a product
		driver.findElement(By.name("q")).sendKeys("IPHONE",Keys.ENTER);
		//click on first product
		driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[1]")).click();
		
		WebElement price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']/../..//div/div/div/div"));
		System.out.println(price.getText());
		driver.quit();
	}

}
