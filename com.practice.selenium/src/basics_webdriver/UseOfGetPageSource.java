package basics_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetPageSource {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
