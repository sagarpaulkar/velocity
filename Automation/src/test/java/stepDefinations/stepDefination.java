package stepDefinations;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
 WebDriver driver= null; 
    @Given("^Evoke Browser$")
    public void evoke_browser() throws Throwable {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar Paulkar\\Documents\\WebDriver\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.myntra.com/");			
			driver.manage().window().maximize();			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
    }


@When("^Men Phone Cases$")
public void men_phone_cases() throws Throwable {
    
	WebElement M= driver.findElement(By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]"));
	Actions a= new Actions(driver);
	a.moveToElement(M).build().perform();	
	driver.findElement(By.xpath("//a[contains(text(),'Phone Cases')]")).click();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
}
    @Then("^Option Child$")
    public void option_child() throws Throwable {
    	List<WebElement> options= driver.findElements(By.cssSelector("li[class='product-base']"));
		
		for (WebElement option:options) {
							
			if(option.getText().contains("Women Textured Mobile Pouch")) {
											
				driver.findElement(By.className("product-productMetaInfo")).click();
								
				
    }
		}
    }

    @And("^Price Cart$")
    public void price_cart() throws Throwable {
    	Set<String> window=	driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent =	it.next();
		String Child= it.next();
		driver.switchTo().window(Child);
		
		System.out.println(driver.findElement(By.className("pdp-price")).isDisplayed());
		String price = driver.findElement(By.className("pdp-price")).getText();
		 String[] p= price.split(" ");
		 p[1]="1253";
		 
		System.out.println(p[1]);
							
		System.out.println(driver.findElement(By.className("pdp-add-to-bag")).isDisplayed());
    }
}