package com.dataProvider;

import org.testng.annotations.Test;

public class array2Dwithloop {

		@Test
		public void demoarray(){

			Object [][] arry = new Object[2][2];	
			arry[0][0]="Mamun";
			arry[0][1]="Khan"	;
			arry[1][0]="Hasnath";
			arry[1][1]="Ali";
			
//			
//			for(Object []  a : arry) {
//				for(Object ar : a) {
//					System.out.println(ar);
//				}
//			}
			
			for(int i=0;    i<arry.length;    i++) {
				for(int j=0; j<arry.length; j++) {
					
					System.out.println(arry[i][j]);
				}
				
			}
			
			
			
			
		}
		
		
		
		
		



}
