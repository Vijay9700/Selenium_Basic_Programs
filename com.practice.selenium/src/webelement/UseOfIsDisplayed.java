package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIsDisplayed {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//validate the firstname textfield
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
		System.out.println(text.isDisplayed());
		
		//validate
		if(text.isDisplayed())
		{
			System.out.println("PASS-->SIGN UP PAGE IS DISPLAYED");
		}
		else {
			System.out.println("FAIL-->SIGN UP PAGE IS NOT DISPLAYED");
		}
		driver.quit();
	}

}
