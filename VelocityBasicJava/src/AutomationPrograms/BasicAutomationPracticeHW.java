package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomationPracticeHW {
public static void main(String[] args) throws InterruptedException {
		
		// browser launch.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://zerodha.com/");
		//driver.close();
		//driver.quit();
		
		System.out.println(driver.getCurrentUrl());
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://zerodha.com/";
	
		if(ActualUrl.equalsIgnoreCase(ExpectedUrl)) {
			System.out.println("Link validation successful for Zerodha homepage");
		}else {
			System.out.println("Link validation failed for Zerodha homepage");
		}
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Title validation sucessful for Zerodha homepage");
		}else {
			System.out.println("Title validation failed for Zerodha homepage");
		}
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();  
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// setsize() :- allow you to set the size of your browser
		
		 Dimension d = new Dimension(100, 400);
		 driver.manage().window().setSize(d);
		 
		 // setpostion :- you can set the position of your browser on your screen.
		 
		Point p = new Point(300, 500);
		driver.manage().window().setPosition(p);
		
		
	}
}
