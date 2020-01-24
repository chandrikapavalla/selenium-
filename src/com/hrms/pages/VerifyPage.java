package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPage extends BaseClass {
	public static void verifytitle(String title)
	{
	if(driver.getTitle().equals(title))
		
	{
	Reporter.log("title matched");
	
	}
	
	else
	{
		Reporter.log("expected title is" +driver.getTitle());
	}
	
}
}