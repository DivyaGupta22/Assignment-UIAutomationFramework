package com.kayak.pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.helper.ByClass;

public class PackagesPage {
	WebDriver driver;
	
   public PackagesPage(WebDriver driver)
   {
	   this.driver=driver;
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   
   public String packagePageLogo(){
   	WebElement elm= driver.findElement(ByClass.getObject("css-PageLogo"));
   	return elm.getText();
   }
   
   public boolean fromTextBox(){
	   WebElement elm=driver.findElement(ByClass.getObject("xpath-from"));
	 return  elm.isEnabled();
   }
   
   public boolean destinationTextBox(){
	   WebElement elm=driver.findElement(ByClass.getObject("xpath-destination"));
	 return  elm.isEnabled();
   }
   
   public boolean departDate(){ 	  
	    driver.findElement(ByClass.getObject("xpath-pickUp")).click();
   WebDriverWait wait=new WebDriverWait(driver,20);
    WebElement elm=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("id-datePicker"))));
    return elm.isDisplayed();
}
   public boolean returnDate(){ 	  
	    driver.findElement(ByClass.getObject("xpath-dropOff")).click();
  WebDriverWait wait=new WebDriverWait(driver,20);
   WebElement elm=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("id-datePicker"))));
   return elm.isDisplayed();
}
   public Boolean travelers(){	  
	driver.findElement(ByClass.getObject("css-travelers")).click();;
	   WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("xpath-travelerSelection"))));
	   return element.isDisplayed();
	}
   
   public boolean searchbutton(){
	  	  driver.findElement(ByClass.getObject("css-search")).click();
		   WebDriverWait wait=new WebDriverWait(driver,20);
	   WebElement   element= wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("class-searchMsg"))));
	    Boolean isdisplay= element.isDisplayed();
	  	    driver.findElement(ByClass.getObject("xpath-acceptMsg")).click();;
	    return isdisplay;
	    
	  
	  
	   
   }
   
}
