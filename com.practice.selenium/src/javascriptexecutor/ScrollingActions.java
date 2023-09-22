package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingActions {
	
	@Test
	public void scrolling_ScrollBy() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void scrolling_ScrollTo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,400);");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void scrolling_ScrollIntoView() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);", ele);
		Thread.sleep(2000);
		driver.quit();
	}

}
