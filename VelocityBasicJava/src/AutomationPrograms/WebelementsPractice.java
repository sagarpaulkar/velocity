package AutomationPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsPractice {
public static void main(String[] args) throws InterruptedException {
		
		// webelement interface ==> we can perform the respective actions on the webelements.
		
		// browser launch.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1. Sendkeys() :- method present in webelement interface ==> used to pass the data to the webelement
		
		// username.
		//WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		//username.sendKeys("velocity3rdSeptEveningBatch");
		
		// password 
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password@34567");
		
		//2. Click() :- used to click on buttons/ radio button
		//WebElement LogingBtn = driver.findElement(By.xpath("//button[@name='login']"));
		//LogingBtn.click();
		
		//3. isEnabled :- will help you to understand the current state of the webelement  ==> active /passive ==> boolean values.
		
		//System.out.println(LogingBtn.isEnabled());
//		if(LogingBtn.isEnabled()== true) {
//			LogingBtn.click();
//		}else {
//			System.out.println("The login button is disabled");
//		}
		
//		driver.navigate().to("https://www.facebook.com/reg/");
//		Thread.sleep(1500);
		
		//4. isDisplayed :- will help you to check the presence of webelement on the webpage
		
//		WebElement fblogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		System.out.println(fblogo.isDisplayed());
//		if(fblogo.isDisplayed()== true) {
//			System.out.println("Facebook logo is displayed on registration page");
//		}else {
//			System.out.println("Facebook logo is not displayed on registration page");
//		}
		
		
		// 5. isselected :- will help you to check the selection state of the webelement
//		driver.navigate().to("https://www.facebook.com/reg/");
//		Thread.sleep(1500);
//		
//		WebElement femaleopt = driver.findElement(By.xpath("//input[@value='1']"));
//		//femaleopt.click();
//		
//		if(femaleopt.isSelected()==false) {
//			femaleopt.click();
//		}else {
//			System.out.println("female option is by default selected");
//		}
		
		
	}
}
