package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");  //launch Browser
		
		//type='file' should be present  for browse/Attache file/Upload file
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\debug.log");
	}

}
