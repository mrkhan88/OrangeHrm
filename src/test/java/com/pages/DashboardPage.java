package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By welcomebutton = By.xpath("//*[contains(text(),'Welcome')]");
	By logoutButton = By.xpath("//*[contains(text(),'Logout')]");
	
	public void verifyLogin() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "You are logged in.");
	}
	
	public void clickWelcomeButton() {
		driver.findElement(welcomebutton).click();
	}
	public void clickLogout() {
		driver.findElement(logoutButton).click();
	}
	public void verifyLogout() {
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	

}
