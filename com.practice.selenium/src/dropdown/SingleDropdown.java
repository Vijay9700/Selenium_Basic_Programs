package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SingleDropdown {
	
	@Test
	public void handlinkSingleDropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//day dropdown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		//select
		Select select=new Select(dayDropdown);
		System.out.println(select.isMultiple());
		select.selectByIndex(8);
		Thread.sleep(3000);
		select.selectByValue("25");
		Thread.sleep(3000);
		select.selectByVisibleText("20");
		Thread.sleep(3000);
//		select.deselectByValue("25");//unsupported operation exception
//		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void selectAllDataOneByOne() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//day dropdown
		WebElement dayDropdown = driver.findElement(By.id("day"));
		//select
		Select select=new Select(dayDropdown);
		System.out.println(select.isMultiple());
		int options = select.getOptions().size();
		for (int i=0;i<options;i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		driver.quit();
	}

}
