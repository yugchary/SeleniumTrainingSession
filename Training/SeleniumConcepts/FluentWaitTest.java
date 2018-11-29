package SeleniumConcepts;

import java.awt.geom.FlatteningPathIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.csdp.qa.base.TestBase;
import com.google.common.base.Function;

public class FluentWaitTest extends TestBase{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start')]")).click();
		
		
		
		/*boolean status = driver.findElement(By.xpath("//p[text()='WebDriver']")).isDisplayed();
		System.out.println("visible ="+ status);*/
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.xpath("//p[text()='WebDriver']"));
			     }
			   });
			 
			   System.out.println("visible ="+ foo.isDisplayed());
		       
		
		//button[text()='Click me to start timer']
		
	}

}
