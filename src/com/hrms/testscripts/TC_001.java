package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_001 {
@Test

public static void TC_101()
{

	BaseClass.openApplication();
	VerifyPage.verifytitle("OrangeHRM");
	LoginPage.login("Admin", "admin123");
	LogoutPage.logout();
	BaseClass.closeapplication();
	
	
	}

}
