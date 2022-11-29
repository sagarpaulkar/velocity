package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
			
	public static void main(String[] args) {
		// Browser Evoking 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// Logging to application 
		
		WebElement email= driver.findElement(By.xpath("//input[@name='email' or data-testid='royal_email']"));
		email.sendKeys("1234567890");
		
		WebElement password =driver.findElement(By.xpath("//input[@name='pass' or data-testid='royal_email']"));
		password.sendKeys("sagar123456");
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		//Validation
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
		
		String Expectedsms= driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		
		String Actualsms="The password that you've entered is incorrect. Forgotten password?";
		
		if(Expectedsms.contains(Actualsms))
		{
			System.out.println("validated" );
		}
		else {
			System.out.println("Not Validated");
		}
		
	}
}
