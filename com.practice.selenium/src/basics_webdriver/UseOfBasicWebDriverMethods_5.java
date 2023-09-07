package basics_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfBasicWebDriverMethods_5 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//fetch the title of web page
		String title = driver.getTitle();
		System.out.println("TITLE--->"+title);
		
		//fetch the current url
		String currentUrl = driver.getCurrentUrl();
		driver.get("https://www.flipkart.com/");
		System.out.println("CURRENT URL--->"+currentUrl);
		
		//close
		//driver.close();
		
		//quit
		driver.quit();
	}

}
