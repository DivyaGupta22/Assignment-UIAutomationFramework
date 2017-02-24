package com.div.TestPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.div.base.BaseTest;
import com.div.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	
	HomePage hm;
	@ BeforeClass
	public void beforeclass(){
      hm=new HomePage(driver);

}
	
	@Test
	public void testHeaderNav(){
		Assert.assertEquals(13,hm.headerNavLink());
		
	}
	
	@Test
	public void testSearchbox(){
		//System.out.println(hm.searchBox());
		Assert.assertEquals("laptops on sale - Walmart.com",hm.searchBox());
	}
	
	
	
}