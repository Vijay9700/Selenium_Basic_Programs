package basics_webdriver;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchDifferentBrowser_2 {
	public static void main(String[] args) {
//		ChromeDriver driver;
//		EdgeDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("CHOOSE 1 FOR CHROME BROWSER...");
		System.out.println("CHOOSE 2 FOR EDGE BROWSER...");
		 int browser = sc.nextInt();
		
		if(browser==1)
		{
			ChromeDriver driver=new ChromeDriver();
		}
		else if(browser==2)
		{
			EdgeDriver driver=new EdgeDriver();
		}
		else
		{
			System.out.println("CHOOSE THE BROWSER-->FUCKER");
		}
		

	}

}
