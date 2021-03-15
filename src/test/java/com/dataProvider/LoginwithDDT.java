package com.dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginwithDDT {
	
	WebDriver driver;
	
	@Test(dataProvider = "data" )
	public void testwithDD(String uname, String password) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//enter username
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
		//enter password
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		//click on login button
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	
	
	@DataProvider(name="data")
	public Object [][] getData() {
		
		Object [][] arry = new Object[2][2];
		arry[0][0]="Admin";
		arry[0][1]="admin123";
		arry[1][0]="John";
		arry[1][1]="Stewart";
		
		return arry;
	}
	
	
	

}
