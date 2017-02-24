package com.kayak.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ByClass {
	private static Logger logger=Logger.getLogger(ByClass.class);
	
 public static By getObject(String key){
	 By by =null;
	 
	 Properties prop=new Properties();
	 try {
		prop.load(new FileInputStream(Constant.PATH+"/locator/UI_Locator.properties"));
			
		
	} catch (FileNotFoundException e) {	
		 logger.error("File not found - please give valid file name");
	} catch (IOException e) {	
		 logger.error("Issue in reading given locator properties file");
	} 
	 if(key.startsWith("css")){
		 return By.cssSelector(prop.getProperty(key));
	 }else if(key.startsWith("xpath")){
		 return By.xpath(prop.getProperty(key));
	 }else if(key.startsWith("name")){
		 return By.name(prop.getProperty(key));
	 }else if(key.startsWith("id")){
		 return By.id(prop.getProperty(key));		 
	 }else if (key.startsWith("class")){
		 return By.className(prop.getProperty(key));
	 }else if (key.startsWith("link")){
		 return By.linkText(prop.getProperty(key));	
	 }else if (key.startsWith("plink")){
		 return By.partialLinkText(prop.getProperty(key));
	 }else if (key.startsWith("tag")){
		 return By.tagName(prop.getProperty(key));
	 }
	 
	 
	 return by; 
 }
}