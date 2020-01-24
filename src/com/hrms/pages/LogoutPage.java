package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.openqa.selenium.interactions.Actions;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
	
	static By logout=By.linkText("Logout");
	

	public static void logout()
	{
		  Actions a=new Actions(driver);
		    a.moveToElement(driver.findElement(By.id("welcome"))).click().build().perform();
		     a.moveToElement(driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[2]/a"))).click().build().perform();  
		    	    	   
		
		
		Reporter.log("application closed");
	}

	}


