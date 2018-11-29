package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.csdp.qa.base.TestBase;

public class JavaScriptExecutorConcept extends TestBase{

	public static void main(String[] args) {
		
		new JavaScriptExecutorConcept();
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yug_chary");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("omsris");
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		flash(loginbtn, driver);	//highlight the element
		//drawBorder(loginbtn, driver);	//draws border
		
		//generateAlert("I love U", driver);
		
		//clickElementbyJS(loginbtn, driver);
		
		//refreshbyJS(driver);
		System.out.println("title "+getPageTitlebyJS(driver));
		
		System.out.println("inner text " + getPageInnerTextbyJS(driver));
		
		//pageScrollyJS(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		
		//scrollIntoViewbyJS(element, driver);
		

	}
	
	public static void flash(WebElement element, WebDriver driver) {
		
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changecolor("rgb(0,200,0)", element, driver);
			changecolor(bgcolor, element, driver);
				
		}
	}
	
	public static void changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);	
		
	}
	
	public static void generateAlert(String msg, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ msg +"')");
		
	}
	
	public static void clickElementbyJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshbyJS(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	
	public static String getPageTitlebyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		return js.executeScript("return document.title;").toString();		
		
	}
	
	public static String getPageInnerTextbyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		return js.executeScript("return document.documentElement.innerText;").toString();
		
	}
	
	public static void pageScrollyJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
		
	public static void scrollIntoViewbyJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static void continuousScrollbyJS(WebDriver driver, int count) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		int i=1;
		while(i<=count) {
			//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");			
			js.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
			System.out.println("i="+i);
			i++;		
			Thread.sleep(6000);
		}	
		System.out.println("continuousScrollbyJS done using scroll");		
	}
	
	
		
	public static void continuousScrollbyJS(int count, WebDriver driver) throws InterruptedException {
		Actions actions = new Actions(driver);
		
		int i=1;
		while(i<=count) {
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();	
			System.out.println("i="+i);
			i++;			
			Thread.sleep(6000);
		}
		System.out.println("continuousScrollbyJS done using control end button");
	}
	
	//below code not working
	public static void rightClickbyJS(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);

		String javaScript = "var evt = document.createEvent('MouseEvents');"
		                + "var RIGHT_CLICK_BUTTON_CODE = 2;"
		                + "evt.initMouseEvent('contextmenu', true, true, window, 1, 0, 0, 0, 0, false, false, false, false, RIGHT_CLICK_BUTTON_CODE, null);"
		                + "arguments[0].dispatchEvent(evt)";

		js.executeScript(javaScript, element);
	}
		
		
			
	
	
	 
	
	

}
