package com.kayak.pages;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.helper.ByClass;



public class CommonPage {	
	WebDriver driver;
	
		public  CommonPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public  boolean kayakLogo(){
     return driver.findElement(ByClass.getObject("id-kayaklogo")).isDisplayed();		
	}
	
	public int kayakOptions(){
		List<WebElement> elements=driver.findElements(ByClass.getObject("css-kayakOptions"));
	    return elements.size();
	}
	 
   public Boolean moreOptions(){
	     driver.findElement(ByClass.getObject("link-moreMenu")).click();
	     WebElement elm=driver.findElement(ByClass.getObject("css-Moredropdown"));
	     return elm.isDisplayed();
   }
	
	public LoginPage myaccountSignup(){
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ByClass.getObject("link-myAccount")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-signup"))));
		element.click();
			return new LoginPage(driver);
	 
		
	}
		

	public CarsPage clickOnCars(){
		  driver.findElement(ByClass.getObject("link-forCars")).click();    	
		return new CarsPage(driver);
		
	}

	public PackagesPage clickOnPackages(){
		  driver.findElement(ByClass.getObject("link-forPackages")).click();  
		ArrayList<String> tab= new ArrayList<String> (driver.getWindowHandles());
	     driver.switchTo().window(tab.get(1));	  
		return new PackagesPage(driver);
		
	}
	
	
	
	
	

}
 
 