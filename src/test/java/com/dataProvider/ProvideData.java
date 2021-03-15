package com.dataProvider;

import org.testng.annotations.DataProvider;

public class ProvideData {
	
	
	@DataProvider(name="testdata")
	public static Object [][] getData() {
		
		Object [][] arry = new Object[2][2];
		arry[0][0]="Admin";
		arry[0][1]="admin123";
		arry[1][0]="John";
		arry[1][1]="Stewart";
		
		return arry;
	}
	
	
	
	
	

}
