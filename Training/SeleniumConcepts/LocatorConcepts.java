package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;


public class LocatorConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?_trksid=m570.l2621"); //launch Browser
		
		
		
		//There are 8 locators in selenium 
		
		//1. xpath  -2
		//absolute path should not be used (hierarchy based) --.//*[@id='loginForm']/div/input[1]
		//only relative should be used -- //*[@id='lastname'
		
		driver.findElement(By.xpath("*//input[@id='firstname']")).sendKeys("yug.xpath");
		//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("akk.xpath");
		
		//2. id -1
		
		//driver.findElement(By.id("firstname")).sendKeys("yug.id");
		//driver.findElement(By.id("lastname")||By.name("lastname")).sendKeys("yug.id");
		driver.findElement(By.xpath("//*[@name='lastname' and @id='lastname']")).sendKeys("yug.id");
		
		//By myBy = new ByChained(By.id("lastname"),By.name("lastname"));
		
		//By myBy = new ByChained(By.id("firstName"),By.className("personName"));
		//driver.findElement(myBy).sendKeys("lastname");
		
		//input[@id='lastname' and @name='lastname']
		
		//driver.findElement(By.name("lastname")).sendKeys("yug.id");
		
		//3. name  -3
		
		driver.findElement(By.name("firstname")).sendKeys("yug.name");
		//driver.findElement(By.name("lastname")).sendKeys("yug.name");
		
		//4. linkText (for links only)
		
		//a- angular tag
		driver.findElement(By.linkText("User Privacy Notice")).click();
		
		
		//5. partialLinkText not useful
		//driver.findElement(By.partialLinkText("Agreement")).click();
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//6. cssSelector  -2
		// if id is present > cssSelector will be #<id>
		// if class is present > cssSelector will be .<class>
		driver.findElement(By.cssSelector("#firstname")).sendKeys("yug.cssselector");
		
		//7 className  not useful -4
		driver.findElement(By.className("chk-lb")).click();
		
		//driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='showPASSWORD']//span[@class='gspr chk-off']"));
		/*Actions actions = new Actions(driver);
		actions.moveToElement(ele);
		actions.build().perform();*/
		
		ele.click();
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("akk.xpath");
		
		
		//8. tagName
		
		//9 drop down selection
		//Select sel = new Select(driver.findElement(By.id("day")));
		
		//sel.selectByIndex(5);
		//sel.selectByVisibleText("6");
		
		
		//xPath functions
		
		//starts-with
		//eg: 1.test_123, test_345, test_456
		
		//driver.findElement(By.xpath("//input[starts-with(@type,'test_')]")).submit();
				
		////a[@rel='nofollow' and contains(text(),'Log In')]
		
		//endswith
		//driver.findElement(By.xpath("//input[ends-with(@type,'submit')]")).submit();
		
		
		//contains
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
		
		//	parent
		//	preceding-sibling::
		//	parent::
		//	following-sibling::
		
		//td > column
		//tr > row
		
	}

}
