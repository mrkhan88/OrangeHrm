package com.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {
	
	/*public static void main(String [] args) throws IOException {
		
		String path = "./Users/mamunkhan/eclipse-workspace/OrangeHrm./resources/data/Book1.xlsx";
		
		FileInputStream fis = new FileInputStream("/Users/mamunkhan/eclipse-workspace/OrangeHrm/data/Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//XSSFSheet  sheet = wb.getSheet("Sheet1");
		
		
		int rowcount = wb.getSheetAt(0).getPhysicalNumberOfRows();
		
		int columns = wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();

		for(int i=0; i<rowcount; i++) {
			
			for(int j=0; j<columns; j++) {
				
				System.out.println(wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue());
			}
		}*/

//		int totalrows = sheet.getLastRowNum();
//		
//		int totalcolumn = sheet.getRow(0).getLastCellNum();
//
//		
//
//        //Parent loop check for Rows
//        for(int i=0; i<=totalrows; i++){
//            XSSFRow ro = sheet.getRow(i);
//
//            //inner loop check for Columns
//            for(int j=0; j<totalcolumn; j++){
//                XSSFCell cell = ro.getCell(j);
//
//                switch (cell.getCellType()){
//                    case STRING:
//                        System.out.print(cell.getStringCellValue());
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        break;
////                    case BOOLEAN:
////                        System.out.print(cell.getBooleanCellValue()); break;
//                }
//                System.out.print(" || ");
//            }
//            System.out.println();
//        }

	//}
	/*@Test
	public void readXcel() throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/mamunkhan/eclipse-workspace/OrangeHrm/data/Book1.xlsx");
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		int totalrow = wb.getSheetAt(0).getPhysicalNumberOfRows();
		int totalcolumns = wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();
		
		Object [][] arry = new Object[totalrow][totalcolumns];
	
		for(int i=0; i<totalrow; i++) {
			
			for(int j=0; j<totalcolumns; j++) {
				arry[i] [j] = wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
				System.out.println(arry[i][j]);
			}
		}
		
		wb.close();
		fis.close();

	}*/
	
	@Test(dataProvider = "testdata", dataProviderClass =  Testdata.class)
	public void login(String uname, String pass) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
	
	
	
	
}
	
	

