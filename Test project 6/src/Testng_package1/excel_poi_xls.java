package Testng_package1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class excel_poi_xls {
  
	@Test
  public void f() throws IOException {
   
		String file="C:\\Users\\Anurag\\Music\\Excel Workbook.xls";
		FileInputStream fis=new FileInputStream(file);   // retrieving data from excel through the file path.
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet ws=wb.getSheetAt(0);
		
		//launch
		WebDriver d=new FirefoxDriver();
		d.get(ws.getRow(1).getCell(2).getStringCellValue());
		Sleeper.sleepTightInSeconds(2);
		
		//login  
		d.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		d.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		d.findElement(By.id("btnLogin")).click();
		
		
	}
}
