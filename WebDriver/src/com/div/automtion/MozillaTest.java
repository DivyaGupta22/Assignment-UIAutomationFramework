package com.div.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Divya\\workspace\\WebDriver\\resources\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			 WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
			 element.sendKeys("shoes");
			 element.submit();
			
			 System.out.println(driver.getTitle());
	}

}
