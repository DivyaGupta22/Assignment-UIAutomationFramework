package com.kayak.pages;

import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.helper.ByClass;
import com.kayak.helper.HelperClass;

public class LoginPage {
	
		 WebDriver driver;
		  public LoginPage(WebDriver driver){
		  	this.driver=driver;
		  }
		  
		public String fbORgooglelogin() throws InterruptedException{
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement element1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-social"))));
			Actions action =new Actions(driver);
			action.moveToElement(element1).perform();
			if(HelperClass.loginWith.equalsIgnoreCase("google")){
			element1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-googleLink"))));
			element1.click();
			}else if(HelperClass.loginWith.equalsIgnoreCase("facebook")){
				element1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-facebookLink"))));	
				element1.click();
			}
			
			
			String currentWin=driver.getWindowHandle();
			Set<String> windows=driver.getWindowHandles();

			for(String win:windows){
				if(win!=currentWin){
					Thread.sleep(500);
				driver.switchTo().window(win);
				Thread.sleep(500);
								
				}
			}
			return driver.getTitle();
				
			
		}
		
		
		//Data Driven Testing
		
		public String kayakLogin(String username,String passwd){
			if(HelperClass.loginWith.equalsIgnoreCase("kayak")){
				WebElement userId=driver.findElement(ByClass.getObject("name-userName"));
			WebElement pwd=driver.findElement(ByClass.getObject("name-password"));
			userId.clear();
			pwd.clear();
            userId.sendKeys(username);
			 pwd.sendKeys(passwd+"\n");
			
			 return driver.getTitle();}
			else return null;
		}


		}
