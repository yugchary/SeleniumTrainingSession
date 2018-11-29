package TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



//	1.invocationCount - to repeat the test
//	2.groups - divide by test type 
//	3.priority - set the test case order
//	4.timout
// testcases starts with @Test
//Pre-conditions annotations -- starting with @Before

public class TestNGBasics {
	
	
	
	@BeforeSuite
	public void setUP() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass");
	}
	
	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("*********************");
		System.out.println("BeforeMethod");
	}
	
	
	
	@Test(priority=1, groups="Basic",invocationCount=2)	//insert the input data
	public void getPageTitle() {
		System.out.println("getPageTitle");
		
	}
	
	@Test(priority=2, groups="Basic",dependsOnMethods="getPageTitle",invocationTimeOut=1,invocationCount=1)
	public void goolgeLogo() throws InterruptedException {
		System.out.println("goolgeLogo");
		Thread.sleep(2000);
		int i=1;
		while(i==1)
			System.out.println(i);
		
	}
	
	@Test (priority=3, groups="Adv",dependsOnMethods="getPageTitle",expectedExceptions=ArithmeticException.class)
	public void googleSerch() {
		System.out.println("googleSerch");
		int k = 3/0;
	}
		
	@AfterMethod()
	public void logoutURL() {
		System.out.println("AfterMethod");
		System.out.println("*********************");
	}
	
	//Post-conditions annotations -- starting with @After
	
	@AfterClass
	public void closeBroswer() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("AfterTest");
	}
	

}
