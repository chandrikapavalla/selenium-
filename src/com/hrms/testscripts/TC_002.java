package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_002 {
	@Test
	public void TC_102()
	{
	
	
	BaseClass.openApplication();
	VerifyPage.verifytitle("OrangeHRM");
	LoginPage.login("Admin", "admin123");
	LogoutPage.logout();
	

}
}