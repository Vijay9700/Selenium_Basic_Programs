package basics_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		Set<String> wids = driver.getWindowHandles();
		System.out.println(wids);
		
		//iterate
		for (String wid : wids) {
			System.out.println(wid);
		}
		driver.quit();
	}


}
