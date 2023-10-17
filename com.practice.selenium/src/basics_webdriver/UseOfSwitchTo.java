package basics_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSwitchTo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		
		for (String wid : allWids) {
			if(wid.equals(pwid))
			{
				
			}
			else {
				Thread.sleep(3000);
				driver.switchTo().window(wid).close();
			}
		}
	}

}
