package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfIsEnabled {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledTextbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(disabledTextbox.isEnabled());
		
		//validation
		if(disabledTextbox.isEnabled())
		{
			System.out.println("FAIL--->IT SHOULD NOT BE ENABLED");
		}
		else {
			System.out.println("PASS--->IT IS DISABLED");
		}
		driver.quit();
	}

}
