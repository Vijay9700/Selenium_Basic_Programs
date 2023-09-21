package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIsSelected {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//pass first name
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("VIJAY");
		//choose male radio button
		WebElement maleRadiobutton = driver.findElement(By.xpath("//input[@value='2']"));
		maleRadiobutton.click();
		System.out.println(maleRadiobutton.isSelected());
		
		if(maleRadiobutton.isSelected())
		{
			System.out.println("USER SELECTED MALE OPTION...");
		}
		else {
			System.out.println("USER NOT SELECTED MALE...");
		}
		driver.quit();
	}

}
