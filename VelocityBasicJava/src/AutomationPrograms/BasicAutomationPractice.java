package AutomationPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomationPractice {
	
public static void main(String[] args) {
		
		// browser launch.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.axisbank.com/");
		driver.get("https://www.amazon.com/");
		driver.get("https://www.airtel.com/");
		driver.get("https://www.makemytrip.com/");
		driver.get("https://www.policybazaar.com/");
		driver.get("https://www.redbus.com/");
		driver.get("https://zerodha.com/");
	}
}
