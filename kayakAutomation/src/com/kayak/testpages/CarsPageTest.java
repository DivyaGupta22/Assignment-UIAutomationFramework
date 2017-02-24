package com.kayak.testpages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kayak.base.BaseTest;
import com.kayak.pages.CarsPage;
import com.kayak.pages.CommonPage;

public class CarsPageTest extends BaseTest{
	CarsPage ca;
	CommonPage cp;
	
	@BeforeClass
	public void beforeClass(){
		cp=new CommonPage(driver);
		ca=cp.clickOnCars();
	}
	
	@Test
	public void testcarPageLogo(){
	Assert.assertEquals("Search for the best deals on rental cars.",ca.carPageLogo());  
    }
	
	@Test
	public void testwhereTextBox(){
	Assert.assertTrue(ca.whereTextBox());
    }
	
	@Test
	public void testpickUp(){
	Assert.assertTrue(ca.pickUp());
    }
	
  @Test
	public void testpickUpTime(){
	Assert.assertEquals(24, ca.pickUpTime());
    }
	
	@Test
	public void testdropOff(){
	Assert.assertTrue(ca.dropOff());
    }
	
	@Test
	public void testdropOffTime(){
		Assert.assertEquals(24, ca.dropOffTime()); 
    }
	
	@Test
	public void testsearchbutton(){
	Assert.assertTrue(ca.searchbutton());
    }
	
}
