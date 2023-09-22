package popup_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
//	@Test
//	public  void simpleAlert() throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(5000);
//		driver.quit();
//	}
//	
//	@Test
//	public void confirmationAlert() throws InterruptedException
//	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		//accept
//		alert.accept();
//		//dismiss
//		//alert.dismiss();
//		Thread.sleep(5000);
//		driver.quit();
//	}
//	
//	@Test
//	public void textBoxAlert() throws InterruptedException
//	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.sendKeys("vijay");
//		//accept
//		Thread.sleep(2000);
//		alert.accept();
//		//dismiss
//		//Thread.sleep(2000);
//		//alert.dismiss();
//		Thread.sleep(5000);
//		driver.quit();
//	}
	
	@Test
	public void auth_Popup() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void notificationPopup() {
		
	}

}
