package com.div.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\workspace\\WebDriver\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement element=driver.findElement(By.className("nav-line-2"));
		element.click();
		 element=driver.findElement(By.id("twotabsearchtextbox"));
		
		 element.sendKeys("shoes");
		 element.submit();
		 driver.findElement(By.className("refinementLink")).click();;
}
}
