package macys;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MacysTesst {

	@Test
	public void testMacys() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.macys.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions act = new Actions(driver);

//		WebElement shopBycateory = driver.findElement(By.xpath("//button[@id='showByDepartmentCaret']")); //span[text()='SHOP BY DEPARTMENT']

		WebElement shopBycateory = driver.findElement(By.xpath("//span[text()='SHOP BY DEPARTMENT']"));
		
		int x=shopBycateory.getLocation().getX();
		int y=shopBycateory.getLocation().getY();
		
		act.moveByOffset(x, y).perform();
		//act.moveToElement(shopBycateory).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='showByDepartmentCaret']")));



		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement men = driver.findElement(By.xpath("//span[normalize-space()='men']"));



		act.moveToElement(men).build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[normalize-space()=\"All Men's Clothing\"]"))));
		

		WebElement allMen = driver.findElement(By.xpath("//a[normalize-space()=\"All Men's Clothing\"]"));

		act.moveToElement(allMen); //.click().build().perform();
		
		act.click().build().perform();
		
	}

}
