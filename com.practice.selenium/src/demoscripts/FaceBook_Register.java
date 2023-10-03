package demoscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Register {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		
		//enter first name
		driver.findElement(By.name("firstname")).sendKeys("MAHENDRA SINGH");
		System.out.println("FIRST NAME ENTERED SUCCESSFULLY");
		
		//enter last name
		driver.findElement(By.name("lastname")).sendKeys("DHONI");
		System.out.println("LAST NAME ENTERED SUCCESSFULLY");
		
		//ENTER MAIL
		driver.findElement(By.name("reg_email__")).sendKeys("msd7@gmail.com");
		
		//ReEnter mail
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("msd7@gmail.com");
		System.out.println("EMAIL ENTERED SUCCESSFULLY");
		
		//enter new pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("Msd@123");
		System.out.println("PWD ENTERED SUCCESSFULLY");
		
		//choose day
		WebElement dayDropdown = driver.findElement(By.name("birthday_day"));
		Select sel=new Select(dayDropdown);
		sel.selectByVisibleText("7");
		System.out.println("DAY ENTERED SUCCESSFULLY");
		
		//choose month
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select sel1=new Select(monthDropdown);
		sel1.selectByVisibleText("Jul");
		System.out.println("MONTH ENTERED SUCCESSFULLY");
		
		//choose year
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select sel2=new Select(yearDropdown);
		sel2.selectByVisibleText("1981");
		System.out.println("YEAR ENTERED SUCCESSFULLY");
		
		//choose male option
		driver.findElement(By.xpath("//input[@value='2']")).click();
		System.out.println("MALE OPTION SELECTED SUCCESSFULLY");
		
		//click on signup button
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
	}

}
