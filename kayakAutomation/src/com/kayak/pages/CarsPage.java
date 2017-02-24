package com.kayak.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.helper.ByClass;

public class CarsPage {
	WebDriver driver;
    public CarsPage(WebDriver driver){
    	this.driver=driver;
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	   }
    
   
    public String carPageLogo(){
    	WebElement elm= driver.findElement(ByClass.getObject("css-PageLogo"));
    	return elm.getText();
    }
    
   public boolean whereTextBox(){
	   WebElement elm=driver.findElement(ByClass.getObject("xpath-where"));
	 return  elm.isEnabled();
   }
    
   public boolean pickUp(){ 	   
	    driver.findElement(ByClass.getObject("xpath-pickUp")).click();
   WebDriverWait wait=new WebDriverWait(driver,20);
    WebElement elm=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("id-datePicker"))));
    return elm.isDisplayed();
}
   
   public int pickUpTime(){
	   WebElement elm = driver.findElement(ByClass.getObject("name-pickUpTime"));
	  elm.click();
	   Select select=new Select(elm);
	   List<WebElement> elms =select.getOptions();
	   return elms.size();
   }
   
   public boolean dropOff(){  
	   driver.findElement(ByClass.getObject("xpath-dropOff")).click();
	   WebDriverWait wait=new WebDriverWait(driver,20);
	   WebElement elm=wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("id-datePicker"))));
	   return elm.isDisplayed();
	}
   
   public int dropOffTime(){
	    WebElement elm = driver.findElement(ByClass.getObject("name-dropOffTime"));
	  elm.click();
	   Select select=new Select(elm);
	   List<WebElement> elms =select.getOptions();
	   return elms.size();
   }
   
   public boolean searchbutton(){
 return driver.findElement(ByClass.getObject("css-search")).isEnabled();
   }
   
}
