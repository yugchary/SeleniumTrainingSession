package SeleniumConcepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class GoogleElasticSearch extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new GoogleElasticSearch();
		
		/*driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("test");;
		
		//List<WebElement> listobj = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		List<WebElement> listobj = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		*/
		
		
		driver.get("https://demo.codeforgeek.com/ajaxbox/");
		
		driver.findElement(By.name("typeahead")).sendKeys("a");
		
		Thread.sleep(5000);
		
		List<WebElement> listobj = driver.findElements(By.xpath("//span[@class='tt-suggestions']//div/descendant::p")); 
		
		//List<WebElement> listobj = driver.findElements(By.xpath("//span[@class='tt-suggestions']//div"));
		
		//
		
		System.out.println(listobj.size());
		
		for(int i=0;i<listobj.size();i++) 
			System.out.println(listobj.get(i).getText());
			
		

	}

}
