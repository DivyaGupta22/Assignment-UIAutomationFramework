package com.kayak.testpages;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kayak.base.BaseTest;
import com.kayak.pages.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hm;
	
	@BeforeClass
	public void beforeClass(){
		hm=new HomePage(driver);
	}
   
	@Test
	public void testHomePageLogo(){
	Assert.assertEquals("Search hundreds of hotel sites at once.",hm.HomePageLogo());  
    }
	@Test
    public void testWhere(){
    	Assert.assertTrue(hm.Where());
   }
    @Test  
    public void testCheckIn(){
    	Assert.assertTrue(hm.CheckIn());
    }
    
    @Test  
    public void testCheckOut(){
    	Assert.assertTrue(hm.CheckOut());
    }
    
    @Test(priority=1)
    public void testcheckRoomGuest(){
    	Assert.assertTrue(hm.checkRoomGuest());
    }
    
    @Test(priority=2)
	public void testsearchbutton(){
	Assert.assertNotNull(hm.searchbutton());
    }
    
    

}
