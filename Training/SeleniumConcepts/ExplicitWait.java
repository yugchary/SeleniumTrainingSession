package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.csdp.qa.base.TestBase;

public class ExplicitWait extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ExplicitWait();
		
		driver.get("https://www.facebook.com/");
		clickOn(driver, driver.findElement(By.xpath("//*[@id='loginbutton']")), 20);
		
		

	}
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
