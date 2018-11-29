package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class HtmlUnitDriverConcept  {
	
		// This is a ghost driver
		//	eg: 1. HtmlUnit Driver - java
		//		2. PhantonJS - javascript
		// not suitable for Action class - user actoin, mousemovement, double click, drag and drop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.freecrm.com");
		
		System.out.println("before login title"+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yug_chary");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("omsris");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		

		System.out.println("after login title"+ driver.getTitle());

	}

}
