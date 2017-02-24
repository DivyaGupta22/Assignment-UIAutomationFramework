package com.div.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest  {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\workspace\\WebDriver\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
			driver.findElement(By.cssSelector("#lst-ib")).sendKeys("disney princess");
			Thread.sleep(3000);
            driver.findElement(By.cssSelector("#_fZl")).click();
 
            Thread.sleep(2000);

            driver.findElement(By.linkText("Videos")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#vidthumb9")).click();
            
	
	}
}
