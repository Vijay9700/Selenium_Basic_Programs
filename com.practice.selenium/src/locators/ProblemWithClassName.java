package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithClassName {
	//=============>SPACE
	 //=============>DOUPLICATE
	public  void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//SPACE
		driver.get("https://demowebshop.tricentis.com");
		WebElement regLink = driver.findElement(By.className("ico-register"));
		regLink.click();
		Thread.sleep(3000);
		WebElement firstnameTextField = driver.findElement(By.className("text-box single-line"));//invalidSelectorException
		firstnameTextField.sendKeys("vijay");
		Thread.sleep(3000);
		
		//DOUPLICATE
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.className("_8esa")).click();//always it will select female
		Thread.sleep(2000);
		driver.quit();
	}
}
	
	
	