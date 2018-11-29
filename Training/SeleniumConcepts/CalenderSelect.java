package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.csdp.qa.base.TestBase;

public class CalenderSelect extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CalenderSelect();
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yug_chary");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("omsris");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		driver.switchTo().frame("mainpanel");
		
		//driver.findElement(By.xpath("//select[@name='slctMonth']"));
		
		Select selmon = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		
		selmon.selectByVisibleText("November");
		
		Select selyr = new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		
		selyr.selectByVisibleText("2016");
		
		driver.findElement(By.xpath("//td[contains(text(), '23')]")).click();
		
		

	}

}
