package handling_svg_tag;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Svg_Tag {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/4");
		//fetch parent id
		String parentWid = driver.getWindowHandle();
		System.out.println(parentWid);
		//click on compare icon
		driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		//fetching child ids
		Set<String> childWids = driver.getWindowHandles();
		System.out.println(childWids);
		for (String childId : childWids) {
			if(childId.equals(parentWid))
			{
				
			}
			else {
				driver.switchTo().window(childId).close();
				Thread.sleep(1000);
			}
			
		}
	}

}
