package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.csdp.qa.base.TestBase;

public class HandleWindowPopUp extends TestBase{
	
		//1. alerts - java script popup - Alert API  - (accept, dismiss)
		//2. file upload popup - Browse button type (type -file , sendkeys(path)
		//3. Browser popup window - WindowHandler API - getWindowHandles()

	public static void main(String[] args) throws InterruptedException {
		
		new HandleWindowPopUp();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Set<String> winhan = driver.getWindowHandles();
		
		Iterator<String> it = winhan.iterator();
		
		String parenthandle = it.next();
		System.out.println("parent window name "+ parenthandle);
		
		String childhandle = it.next();
		System.out.println("child window handle"+ childhandle);
		
		driver.switchTo().window(childhandle);
		
		System.out.println("child window title "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parenthandle);
		
		Thread.sleep(2000);
		
		System.out.println("parent window title "+ driver.getTitle());
		
		driver.close();
		
			
		

	}

}
