package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadLessBrowser {
	
	// chrome version should be > 59 in mac and > 60 on  windows

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("window-size=1400,800");
		copt.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(copt);
		
		
			
		
		driver.get("https://www.freecrm.com/index.cfm?");
		
		System.out.println("before login" + driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("yug_chary");
		driver.findElement(By.name("password")).sendKeys("omsris");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		System.out.println("after login" + driver.getTitle());

	}

}
