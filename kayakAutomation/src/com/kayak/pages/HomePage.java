package com.kayak.pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kayak.helper.ByClass;

public class HomePage {
	WebDriver driver;
	public  HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	 public String HomePageLogo(){
	    	WebElement elm= driver.findElement(ByClass.getObject("css-PageLogo"));
	    	return elm.getText();
	    }
	
	public boolean Where(){
		WebElement elm= driver.findElement(ByClass.getObject("xpath-where"));
		return  elm.isEnabled();
	    
	}
	
	public Boolean CheckIn(){
		 driver.findElement(ByClass.getObject("xpath-checkIn")).click();
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-calender"))));
			return element.isDisplayed();
	}
	public Boolean CheckOut(){
		 driver.findElement(ByClass.getObject("xpath-checkOut")).click();
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-calender"))));
			return element.isDisplayed();
	}
	
	public Boolean checkRoomGuest(){
		driver.findElement(ByClass.getObject("css-RoomGuest")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("css-RoomGuestSelection"))));
	   return element.isDisplayed();
	}
	   
	   public boolean searchbutton(){
		    driver.findElement(ByClass.getObject("css-search")).click();
		    WebDriverWait wait=new WebDriverWait(driver,20);
		    WebElement element= wait.until(ExpectedConditions.visibilityOf(driver.findElement(ByClass.getObject("class-searchMsg"))));
		    Boolean isdisplay= element.isDisplayed();
		  	    driver.findElement(ByClass.getObject("xpath-acceptMsg")).click();;
		    return isdisplay;
	}
	
	
	


}
