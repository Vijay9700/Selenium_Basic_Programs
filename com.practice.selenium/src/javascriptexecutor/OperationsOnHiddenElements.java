package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsOnHiddenElements {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		//identify hiddenelement--->gender(optional)
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
		
		//JSE
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='aleans'", hiddenElement);
	}

}
