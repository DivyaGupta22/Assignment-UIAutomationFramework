package com.kayak.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.kayak.helper.Constant;
import com.kayak.helper.HelperClass;

public class BaseTest {
	public WebDriver driver;
	@BeforeSuite	
	public void beforesuite(){
		HelperClass.lodproperties(Constant.PATH+"config.properties");
		
		driver=HelperClass.getDriver();
		
		driver.get(HelperClass.appURL);
		driver.manage().window().maximize();
	}

	

	@AfterSuite
  public void aftersuite(){
	  driver.quit();
  }
}
