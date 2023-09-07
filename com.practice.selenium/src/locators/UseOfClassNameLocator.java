package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClassNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		WebElement regLink = driver.findElement(By.className("ico-register"));
		regLink.click();
		Thread.sleep(3000);
		WebElement firstnameTextField = driver.findElement(By.className("text-box single-line"));//invalidSelectorException
		firstnameTextField.sendKeys("vijay");
		Thread.sleep(3000);
		
		driver.quit();
	}

}
