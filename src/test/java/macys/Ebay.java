package macys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {
	
	@Test
	public void testmouseHover() throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		WebElement Electornics = driver.findElement(By.linkText("Electronics"));
		
		act.moveToElement(Electornics).pause(Duration.ofSeconds(5)).moveToElement(driver.findElement(By.xpath("//a[text()='Laptops']"))).pause(Duration.ofSeconds(5)).click().build().perform();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));
//		
//		WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops']"));
//		
//		act.moveToElement(laptops).click().build().perform();
		Thread.sleep(3000);
	}
	
	
	

}
