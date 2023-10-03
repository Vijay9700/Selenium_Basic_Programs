package basics_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		//avoid the login window
//		driver.findElement(By.xpath("//span[@role='button']")).click();
//		//search a product
//		driver.findElement(By.name("q")).sendKeys("IPHONE",Keys.ENTER);
//		//click on first product
//		driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[1]")).click();
//		//use of getWindowHandles
//		Set<String> wids = driver.getWindowHandles();
//		System.out.println(wids);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> cwids = driver.getWindowHandles();
		System.out.println(cwids);
		for (String childId : cwids) {
			if(childId.equals(pWid))
			{
				
			}
			else
			{
				Thread.sleep(3000);
				driver.switchTo().window(childId).close();
			}
		}
		
	}

}
