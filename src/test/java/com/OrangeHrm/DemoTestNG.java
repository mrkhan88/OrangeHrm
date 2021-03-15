package com.OrangeHrm;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

	@Test(description = "This is method1", priority = 4)
	public void method1() {
		
		System.out.println("Method 1");
	}
	
	@Test(description = "This is method2", priority = 3)
	public void method2() {
		
		System.out.println("Method 2");
	}
	
	@Test(description = "This is method3", priority =2)
	public void method3() {
		
		System.out.println("Method 3");
	}
	@Test(description = "This is method4", priority = 1)
	public void method4() {
		
		String name1 = "Mamun";
		String name2 ="Mamun";
	
		AssertJUnit.assertEquals(name1, name2);
		System.out.println("Test Completed");
		
		System.out.println("Method 4");
	}
	
	
	
}
