package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetRect {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//identify create new account button
		driver.findElement(By.linkText("Create new account")).click();
		//validate the firstname textfield
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
		Rectangle poss = text.getRect();
		//System.out.println(poss.getDimension());
		System.out.println(poss.getX());
		System.out.println(poss.getY());
		driver.quit();
	}

}
