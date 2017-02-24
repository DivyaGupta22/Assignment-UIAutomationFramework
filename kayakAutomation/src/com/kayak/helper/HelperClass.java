package com.kayak.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelperClass {
	private static Logger logger=Logger.getLogger(HelperClass.class);
	public static  String browserName;
	public static String  appURL;
	public static String loginWith;
	public static void lodproperties(String filename){
		logger.info("Reading the config file");
    Properties prop=new Properties();		
	try {
		prop.load(new FileInputStream(filename));
	} catch (FileNotFoundException e) {
		 logger.error("File not found - please give valid file name");
	} catch (IOException e) {
		 logger.error("Issue in reading given config properties file");
	}
	browserName=prop.getProperty("Browser");
	appURL= prop.getProperty("appUrl");
	loginWith=prop.getProperty("loginwith");
	
	}
	
	public static WebDriver getDriver(){
		WebDriver driver=null;
		switch(browserName){
		case "Firefox":
		System.setProperty("webdriver.gecko.driver",Constant.PATH+"geckodriver.exe");
		driver=new FirefoxDriver();
		break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",Constant.PATH+"chromedriver.exe");
			driver=new ChromeDriver();
		break;
		case "IE":
			System.setProperty("webdriver.ie.driver",Constant.PATH+"IEDriverServer.exe");
			driver=new  InternetExplorerDriver();
		break;
		
		default:
			System.setProperty("webdriver.chrome.driver",Constant.PATH+"chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		return driver;
	}

}
