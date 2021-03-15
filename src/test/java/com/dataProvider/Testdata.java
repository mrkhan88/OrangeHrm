package com.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Testdata {

	
	
	
	@DataProvider(name="testdata")
	public Object[][] getDat(){
		
		FileInputStream fis=null;
       XSSFWorkbook wb=null;
       
		try {
			fis = new FileInputStream("/Users/mamunkhan/eclipse-workspace/OrangeHrm/data/Book1.xlsx");
			wb = new XSSFWorkbook(fis);
			
		} catch (FileNotFoundException fn) {
			System.out.println("File not fount in the directory");
		}catch(IOException i) {
			System.out.println("Workbook error");
		}
		
		
		int totalrow = wb.getSheetAt(0).getPhysicalNumberOfRows();
		int totalcolumns = wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();
		
		Object [][] arr = new Object[totalrow][totalcolumns];
		
		for(int i=0; i<totalrow; i++) {
			
			for(int j=0; j<totalcolumns; j++) {
				arr[i][j]=wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
			}
		}

		return arr;
	}
}
