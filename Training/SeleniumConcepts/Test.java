package SeleniumConcepts;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.csdp.qa.base.TestBase;

public class Test extends TestBase{

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		new Test();
		String url = "https://www.youtube.com/watch?v=0Gew2XOuum8&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=27";
		
		//url = "https://www.youtube.com/";
		//url = "https://www.amazon.in/?tag=googhydrabk1-21&ref_=pd_mn_ABKror1115";
		
		url = "https://www.google.co.in/";
		driver.get(url);
		
		Thread.sleep(5000);
		
		//WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Selenium - 3 WebDriver Tutorials - By Naveen AutomationLabs')]"));
		
		//WebElement ele = driver.findElement(By.xpath("//div[@class='style-scope ytd-playlist-panel-renderer' and @id='container']"));
		
		//WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'TestNG Framework- Selenium Tutorial Part-1')]"));
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		
		
		//Actions action = new Actions(driver);
		
		System.out.println("start");
		
		/*action.moveToElement(ele).build().perform();
		Thread.sleep(8000);
		ele.click();
		System.out.println("before");*/
		
		Thread.sleep(3000);
		//action.contextClick(ele).build().perform();
		
		//Thread.sleep(3000);
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		//robot.keyRelease(KeyEvent.VK_UP);
		//robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_ESCAPE);*/
		
		//Thread.sleep(3000);
		
		//ele.click();
		System.out.println("before");
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		//WebElement elementOpen = driver.findElement(By.linkText("Open link in new tab"));
		
		//elementOpen.click();
		//
		/*action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();*/
		
		//action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		//Thread.sleep(1000);
		//action.sendKeys(Keys.ARROW_UP).build().perform();
		//Thread.sleep(1000);
		/*action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);*/
		//action.sendKeys(Keys.ENTER).build().perform();
		
		//action.sendKeys(Keys.ESCAPE);
		
		
		
		
		
		//ele.click();
		//Thread.sleep(2000);
		
		//System.out.println("start");
		//ele.click();
		//Thread.sleep(2000);
		
		
		
		/*
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Toys & Games best sellers')]"));
		JavaScriptExecutorConcept.scrollIntoViewbyJS(element, driver);
		
		System.out.println("first break");
		
		Thread.sleep(10000);*/
		
		//JavaScriptExecutorConcept.pageScrollyJS(driver);S
		
		JavaScriptExecutorConcept.rightClickbyJS(driver, ele);
		
		//JavaScriptExecutorConcept.continuousScrollbyJS(driver, 2);
		
		//JavaScriptExecutorConcept.continuousScrollbyJS(driver);
		//JavaScriptExecutorConcept.continuousScrollbyJS(3);
		
		/*Thread.sleep(3000);
		
		System.out.println("one");
		JavaScriptExecutorConcept.continuousScrollbyJS();
		
		Thread.sleep(3000);
		
		System.out.println("two");*/
		
		System.out.println("done");

	}

}
