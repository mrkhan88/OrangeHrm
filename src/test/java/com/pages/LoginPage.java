package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
    By username=By.id("txtUsername");
	
	By passField=By.name("txtPassword");
	
	By loginButton=By.id("btnLogin");
	
	
	public void enterUsername(String uname) {
		
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String password) {
		
		driver.findElement(passField).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	

}
