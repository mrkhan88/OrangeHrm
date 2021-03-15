package com.helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@BeforeMethod
	public void invokeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
//	@Test
//	public void testOrnangeHrm() {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		LoginPage lp = new LoginPage(driver);
//		
//		lp.enterUsername("Admin");
//		lp.enterPassword("admin123");
//		lp.clickLoginButton();
//		
//		DashboardPage dp = new DashboardPage(driver);
//		dp.clickWelcomeButton();
//		dp.clickLogout();
//		
//		dp.verifyLogout();
//		
//	}
	
	
	

}
