package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	
	public static void closeapplication() {
		driver.quit();
	}

	}


