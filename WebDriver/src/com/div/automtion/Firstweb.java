package com.div.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstweb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\workspace\\WebDriver\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the browser with given url
		driver.get("https://www.walmart.com/");
		System.out.println("Result::"+ driver.getTitle());

		
		//find the element
		By by= By.id("global-search-input");   //By is static class
	 WebElement element=	driver.findElement(by);
		
		//perform action
	 element.sendKeys("laptop");	
	 element.submit();
		
		//assert for the result
		//element=driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn"));
	//element=driver.findElement((By.className("header-GlobalSearch-submit btn")))	;
	 //element.click();
		System.out.println("Result::"+ driver.getTitle());
		driver.close();

	}

}
