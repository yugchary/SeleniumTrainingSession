package SeleniumConcepts;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class BootStrapDropDownConcept extends TestBase{

	public static void main(String[] args) {
		
		new BootStrapDropDownConcept();
		
		
		
		String url = "https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&hl=en&flowName=GlifWebSignIn&flowEntry=SignUp";
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		
		
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='ry3kXd Ulgu9']//div//content"));
		
		//List<WebElement> list = driver.findElements(By.xpath("//div[@id='lang-chooser']//div//div//div//content"));
		
		
		
		
		
		
		
		/*driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@class]//li//a//label//b"));   //only 3 values
		
		//List<WebElement> list = driver.findElements(By.xpath("//ul[@class]//li//a//label"));	//14 values	
			
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class]//li//a//label[text()]"));  //11 values
*/		
		
		
		
		//ul[@class='multiselect-container dropdown-menu']//li//a//label
		
		
		//div[@role='listbox']//div//div//div//content
		
		System.out.println(list.size());
		
		Iterator<WebElement> t = list.iterator();
		
		int i=0;
		while(t.hasNext()) {
			i++;
			//System.out.println(t.next().getText());
			
			
			//WebElement el = webDriver.findElement(By.xpath("//div[@id='grid']/div[2]/table/tbody/tr["+i+"]/td[16]"));
	        JavascriptExecutor js = (JavascriptExecutor) driver; 
	        String returnText = js.executeScript("return arguments[0].innerHTML", t.next()).toString();
	        //String returnText = js.executeScript("return arguments[0].outerHTML", t.next()).toString();
			
	        
			
			//System.out.println(t.next().getAttribute("default"));
			
			//List<WebElement> list1 = t.next().findElements(By.xpath("text()"));
			//System.out.println(list1.get(0).getText());
			
			//driver.findElements(By.xpath("//div[@role='listbox']//div//div//div[@aria-selected='false']//content")).toString();
			System.out.println("i value" + i + returnText);
			
		}
			

		//ul[@class]//a//input

	}

}
