package reportsdemo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReprots {
	
	@Test
	public void generateReport() throws IOException {
		
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reprots/testReort.html");
		
		//ExtentSparkReporter htmlreport = new ExtentSparkReporter("/Users/mamunkhan/eclipse-workspace/OrangeHrm/Reprots");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(htmlreport);
		
		ExtentTest logger1 = report.createTest("Testcase001", "Login test");
		logger1.pass("Test passed");
		
		ExtentTest logger2 = report.createTest("testcase002", "Verify users");
		logger2.info("Test running");
		
		ExtentTest logger3 = report.createTest("testcase003", "Payment test");
		logger3.info("Test running");
		
		
		ExtentTest logger4 = report.createTest("testcase004", "Debitcardpayment test");
		logger4.fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath("/Users/mamunkhan/Desktop/vmodel.png").build());
		
		//flush is mandatory, it will adds reports to testcase
		report.flush();
		
		
		
		
	}
	
	

}
