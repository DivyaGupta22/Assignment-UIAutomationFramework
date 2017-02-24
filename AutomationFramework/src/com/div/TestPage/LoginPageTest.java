package com.div.TestPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.div.base.BaseTest;
import com.div.helper.Constant;
import com.div.helper.ExcelHelper;
import com.div.pages.HomePage;
import com.div.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	LoginPage lp;
	HomePage hm;
	
	@ BeforeClass
	public void beforeclass(){
          hm=new HomePage(driver);
          lp=hm.clickSignIn();
}
	
	@DataProvider(name="logindata")
	public Object[][] testdata(){
		Object[][] data=ExcelHelper.getdata(Constant.PATH+"/testdata/loginTestData.xlsx");
		return data;
	}
	@Test(dataProvider="logindata")
	public void testlogin(String username,String passwd){
		Assert.assertNotNull(lp.login(username,passwd));
	}
}
