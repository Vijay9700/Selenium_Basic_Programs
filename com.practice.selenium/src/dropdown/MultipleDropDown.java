package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleDropDown {
	
	@Test
	public void multiDropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//drop down
		WebElement carsDropdown = driver.findElement(By.id("cars"));
		//select
		Select select=new Select(carsDropdown);
		System.out.println(select.isMultiple());
		
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("500");
		Thread.sleep(2000);
		select.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}

}
