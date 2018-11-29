package SeleniumConcepts;



import org.openqa.selenium.By;
import com.csdp.qa.base.*; 

public class FrameHandle extends TestBase {
	
	
	FrameHandle(){
		super();
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		new FrameHandle();
		
		//driver.get("https://www.freecrm.com/index.cfm?CFID=1441627&CFTOKEN=35422249&jsessionid=3e30c8508ca375024e7629525c1824125240");  //launch Browser
		driver.get("https://www.freecrm.com/index.cfm?");
		driver.findElement(By.name("username")).sendKeys("yug_chary");
		driver.findElement(By.name("password")).sendKeys("omsris");
		driver.findElement(By.xpath("//*input[@type='submit']")).submit();
		
		
		
		
		Thread.sleep(10000);
		//tag_name[@attr_name='value1' and attr_name2='value2'][index]
		
		driver.switchTo().frame("mainpanel");		
		
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Contacts")).click();
		
		//only for links - html tag <a>
		
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts']")).click();
		
		//driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Contacts')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(@title,'Contact')]")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("yug");
		
		//driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("starts-with");
		
		
		
		
		
	}

}
