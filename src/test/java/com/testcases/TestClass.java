package com.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.helper.Base;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class TestClass extends Base{

	@Test
public void testOrnangeHrm() {
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		LoginPage lp = new LoginPage(driver);       class instance created in Base class.
		lp = new LoginPage(driver);
		
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginButton();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.verifyLogin();
		dp.clickWelcomeButton();
		dp.clickLogout();
		
		dp.verifyLogout();
		
	}
	
}
