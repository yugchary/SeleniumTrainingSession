package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.csdp.qa.base.TestBase;

public class DragnDropConcept extends TestBase{
	
	DragnDropConcept(){
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		new DragnDropConcept();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(6000);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		
		

	}

}
