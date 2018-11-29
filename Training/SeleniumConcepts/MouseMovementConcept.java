package SeleniumConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.csdp.qa.base.TestBase;

public class MouseMovementConcept extends TestBase{
	
	MouseMovementConcept(){
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new MouseMovementConcept();
		
		/*driver.get("http://spicejet.com/");
		Thread.sleep(6000);
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Seat + Meal Combo")).click();*/
		
		
		driver.get("http://toolsqa.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//li[@class]//span[starts-with(text(),'Tools')]"))).build().perform();
				
				
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.xpath("//li[@class]//span[contains(text(),'UI')]"))).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='sub-nav hover-style-click-bg level-arrows-on']//span[contains(text(),'Selenium Tutorial')]")).click();
		
		
		
		/*driver.switchTo().frame(1);		
		
		
		List<WebElement> listobj = driver.findElements(By.xpath("//ul[@role='menu']//li"));
		
		List<WebElement> listobj = driver.findElements(By.xpath("//ul[@role='menu']//li//a/descendant::span[@class='menu-text']"));
		
		
		System.out.println(listobj.size());
		
		for(int i=0;i<listobj.size(); i++) {
			System.out.println(listobj.get(i).getText());
			String txt = listobj.get(i).getText();
			if (txt.equalsIgnoreCase("tools")) {
				action.moveToElement(listobj.get(i)).build().perform();
				Thread.sleep(3000);			
				
				
				break;
			}		
		
		}	
		
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Tools')]"))).build().perform();
		
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'UI Automation')]"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Selenium Tutorial')]")).click();*/
		

	}

}
