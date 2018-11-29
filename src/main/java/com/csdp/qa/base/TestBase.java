package com.csdp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	public static long PAGE_LOAD_TIMEOUT = 120;
	public static long IMPLICIT_WAIT = 120;

	public TestBase()  {

		Properties prop = new Properties();

		FileInputStream fileip;
		try {
			fileip = new FileInputStream(
					"C:\\Users\\akkyu01\\eclipse-workspace\\JavaTraining\\SeleniumTrainingSession\\src\\main\\java\\com\\csdp\\qa\\config\\config.properties");
			prop.load(fileip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		String BrowserType = prop.getProperty("browser");

		if (BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\chromedriver.exe");
			// WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver();
		} else if (BrowserType.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (BrowserType.equalsIgnoreCase("FF")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		// driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Yug\\From Old Laptop\\From LoanLap\\Yug\\Selenium\\IEDriverServer.exe");
		 * WebDriver driver = new InternetExplorerDriver();
		 */

		//
	}

}
