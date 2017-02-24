package com.kayak.testpages;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kayak.base.BaseTest;
import com.kayak.pages.CommonPage;
import com.kayak.pages.PackagesPage;	

public class PackagesPageTest extends BaseTest {
	CommonPage cp;
	PackagesPage pp;
	
	
	@BeforeClass
  public void beforeClass(){
		cp=new CommonPage(driver);
		pp=cp.clickOnPackages();
		
	}
	
@Test
	public void testpackagePageLogo(){
	Assert.assertEquals("Search for the best deals on vacation packages.",pp.packagePageLogo());  
    }
	
	@Test
	public void testfromTextBox(){
	Assert.assertTrue(pp.fromTextBox());
    }
	
	@Test
	public void testdestinationTextBox(){
	Assert.assertTrue(pp.destinationTextBox());
    }
	
  @Test
	public void testdepartDate(){
	Assert.assertTrue(pp.departDate());
    }
	
	
  @Test
	public void testreturnDate(){
	Assert.assertTrue(pp.returnDate());
    }
	
	@Test(priority=1)
	public void testtravelers(){
		Assert.assertTrue(pp.travelers());
    }
	
	@Test(priority=2)
	public void testsearchbutton(){
	Assert.assertNotNull(pp.searchbutton());
    }
	
}
