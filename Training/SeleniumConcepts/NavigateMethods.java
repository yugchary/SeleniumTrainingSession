package SeleniumConcepts;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.csdp.qa.base.TestBase;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class NavigateMethods extends TestBase{

	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		new NavigateMethods();


		driver.get("https://www.google.com/");
		
		//driver.navigate().to("http://yahoo.com/");
		
		driver.get("https://www.linkedin.com/feed/");
		
		driver.navigate().back();
		
	
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		TakesScreenshot scnsht = ((TakesScreenshot)driver);
		
				
		File src = scnsht.getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		
		String pathname = currentDir + "/screenshots/" + System.currentTimeMillis() + ".png";
		
		System.out.println(pathname);
		
		//FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		FileUtils.copyFile(src, new File(pathname));
		
		//FileUtils.copyFile(src, new File("C:\\Users\\akkyu01\\eclipse-workspace\\JavaTraining\\SeleniumTrainingSession\\yahoo.png"));
		
		
		
		
		

	}

}
 