package SeleniumConcepts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


import com.csdp.qa.base.TestBase;

public class AlertPopUpHandle extends TestBase{

	AlertPopUpHandle(){
		super();
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		new AlertPopUpHandle();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //launch Browser
		
		Thread.sleep(5000);
			
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(10000);
		
		
		Alert altwindow = driver.switchTo().alert();
		
		String x = altwindow.getText();
		
		
		System.out.println(x);
		
		
		altwindow.accept();		//click ok
		
		//altwindow.dismiss();   //click cancel
		
		
		
		

	}

}
