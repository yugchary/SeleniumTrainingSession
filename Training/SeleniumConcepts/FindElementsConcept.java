package SeleniumConcepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class FindElementsConcept extends TestBase {

	FindElementsConcept(){
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new FindElementsConcept();
		
		
			
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(20000);
		
		
		
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		
		for(WebElement s: list) {
			System.out.println(s.getText());
		}
			
			

	}

}
