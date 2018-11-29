package TestNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	
	@Test(dataProvider="getdata")
	void getTitle(String searchString) {
		
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys(searchString);
		System.out.println("title" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google1", "Incorrect Title, check it?");
	}
	
	@Test
	void verifyLogo() {
		boolean x = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(x);
	}
	
	@DataProvider
	void getdata(){
		//return 1;
		
	}
	
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}

}
