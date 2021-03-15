package com.OrangeHrm;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmHome {
	
	@Test
public void login() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	System.out.println("Thread name: "+Thread.currentThread().getName());
	System.out.println("Thread ID : "+Thread.currentThread().getId());
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	driver.close();

}
	
	
	
	
	
}
