package com.kayak.testpages;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kayak.base.BaseTest;
import com.kayak.pages.CommonPage;

public class CommonPageTest extends BaseTest {

	CommonPage cp;
	
	@BeforeClass
	public void beforeClass(){		
		cp=new CommonPage(driver);
		
		}
	

	
    @Test
    public void testkayakLogo(){
    	Assert.assertTrue(cp.kayakLogo());   	
    }
	
    @Test
    public void testKayakOptions(){
    	Assert.assertEquals(6, cp.kayakOptions()); 	
    }
    
    @Test
    public void testmoreOptions(){
    	Assert.assertTrue(cp.moreOptions());   	
    }
    
}