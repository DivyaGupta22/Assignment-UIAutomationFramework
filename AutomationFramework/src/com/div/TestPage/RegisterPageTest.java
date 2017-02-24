package com.div.TestPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.div.base.BaseTest;
import com.div.pages.HomePage;
import com.div.pages.RegisterPage;

public class RegisterPageTest extends BaseTest{

	RegisterPage rp;
	HomePage hm;
	@ BeforeClass
	public void beforeclass(){
	        hm=new HomePage(driver);
	         rp= hm.clickCreateAccount();
}
	
	@Test
	public void testregister(){
		Assert.assertNotNull(rp.Register("Divya", "Gupta","divyastyle22@gmail.com", "1234d"));
	}
}
