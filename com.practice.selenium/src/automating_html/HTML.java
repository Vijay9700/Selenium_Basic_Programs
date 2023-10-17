package automating_html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP%20ELITEBOOK/OneDrive/Desktop/A.html");
		System.out.println("TITLE OF THE PAGE..."+driver.getTitle());
		System.out.println("URL OF THE PAGE..."+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("vijay");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ganesan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
