package basics_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigate {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.get("https://www.flipkart.com/");
		
		Navigation nav = driver.navigate();
		
		//to move back
		nav.back();
		Thread.sleep(2000);

		//to move forword
		nav.forward();
		Thread.sleep(2000);
		
		//to refresh
		nav.refresh();
		Thread.sleep(2000);
		
		//to(URL url)
		URL url = new URL("https://joinindianarmy.nic.in/Authentication.aspx");
		nav.to(url);
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
