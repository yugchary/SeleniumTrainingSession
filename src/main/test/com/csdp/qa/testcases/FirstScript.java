package com.csdp.qa.testcases;



import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;


import com.csdp.qa.base.TestBase;

public class FirstScript extends TestBase{
	
	public FirstScript(){
		super();
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		new FirstScript();
		driver.get("https://www.facebook.com");	
     
		
		//driver.findElement(By.linkText("Create New Account")).click();
		
		
		
		//driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("yug");;
		
		driver.findElement(By.name("firstname")).sendKeys("yug");
		driver.findElement(By.name("lastname")).sendKeys("akk");
		//driver.findElement(By.xpath("//*[@id='u_0_9']")).click();
		
		//driver.findElement(By.xpath(xpathExpression))
		
		
		Select sel = new Select(driver.findElement(By.id("day")));
		
		//sel.selectByIndex(5);
		sel.selectByVisibleText("6");
		
		
	
		
		
		

		

	}

}
