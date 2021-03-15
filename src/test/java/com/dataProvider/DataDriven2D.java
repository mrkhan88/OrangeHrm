package com.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven2D {        
	
	//@Test(dataProvider = "testdata", dataProviderClass = DataDriven2D.class)      // if data provider method is in a different class.
	@Test(dataProvider = "testdata")       //  use this approach if data provider method is in the same class.
	public void login(String fname, String lname) {
	
		System.out.println("Firstname is "+fname);
		System.out.println("Lastname is "+lname);
		
		
	}
	
	
	
		@DataProvider(name="testdata")
		public Object [][] getData(){

		Object [][] arry = new Object[2][2];	
		arry[0][0]="Mamun";
		arry[0][1]="Khan"	;
		arry[1][0]="Hasnath";
		arry[1][1]="Ali";
		
		return arry;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

}
