package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class SelectCalenderByJS extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SelectCalenderByJS();
		
		driver.get("http://spicejet.com/");
		
		WebElement element = driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']"));
		
		String element1 = "view_fulldate_id_1";
		
		selectByJS(driver, element1, "Thu, Aug 25 2018");
		
	}
	
	public static void selectByJS(WebDriver driver, String element, String date) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].setAttribute('a','"+ date +"');", element);
		
		js.executeScript("document.getElementById(" + element + ").innerHTML="+ date + ";");
		
		
		//document.getElementById("myspan").textContent="newtext";
				
		
	}
}
