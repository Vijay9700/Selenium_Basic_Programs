package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Special_Functionalities {
	
	@Test
	public void refresh_Using_JS() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("history.go();");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void cleartext_Using_Js() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("vijay");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=''", firstname);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void scrollTOBottom() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.quit();
	}

}
