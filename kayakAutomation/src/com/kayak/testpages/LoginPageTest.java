package com.kayak.testpages;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.kayak.base.BaseTest;
import com.kayak.helper.Constant;
import com.kayak.helper.ExcelHelper;
import com.kayak.helper.HelperClass;
import com.kayak.pages.CommonPage;
import com.kayak.pages.LoginPage;


public class LoginPageTest extends BaseTest {

	LoginPage lg;
	CommonPage cp;
	@ BeforeClass
	public void beforeclass(){
		
          cp=new CommonPage(driver);
          lg=cp.myaccountSignup();
}
	 @Test
	 public void testfbORgooglelogin(){
		 try {
				if(HelperClass.loginWith.equalsIgnoreCase("google"))
				Assert.assertEquals("Sign in - Google Accounts", lg.fbORgooglelogin());
			
			else if(HelperClass.loginWith.equalsIgnoreCase("facebook"))
				Assert.assertEquals("Facebook", lg.fbORgooglelogin());
				
			else 
				System.out.println("It will be kayak login ");
			
					} catch (InterruptedException e) {
							e.printStackTrace();
			}
		}
		 
	 
	@DataProvider(name="logindata")
	 public Object[][] testData(){
			Object[][] data=ExcelHelper.getData(Constant.PATH+"/testdata/loginTestData.xlsx");
				return data;
	}
		
	
	@Test(dataProvider="logindata",priority=1)
	public void testKayakLogin(String username, String passwd){		
		if(HelperClass.loginWith.equalsIgnoreCase("kayak"))
			Assert.assertNotNull(lg.kayakLogin(username, passwd));	
		 
		
	}

}
