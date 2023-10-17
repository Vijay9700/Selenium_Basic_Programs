package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfFindElements {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement allLinks = driver.findElement(By.xpath("//a"));
		System.out.println(allLinks);
//		System.out.println(allLinks.size());
//		for (WebElement webElement : allLinks) {
//			System.out.println(webElement);
//		}
		driver.quit(); 
	}

}
