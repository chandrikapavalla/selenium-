package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass {

    static  By loginname=By.name("txtUsername");
	static By password=By.name("txtPassword");
	static By button=By.name("Submit");
	
	public static void login(String un,String pw)
	{
		
		driver.findElement(loginname).sendKeys(un);
		
		driver.findElement(password).sendKeys(pw);
		driver.findElement(button).click();
		
		Reporter.log("login completed");
	}
	
	
	
}
