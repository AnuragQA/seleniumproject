package Testng_package1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class excel_poi {
 
	@Test
  public void f() throws IOException {
  
		String path="C:\\Users\\Anurag\\Music\\New Microsoft Excel Workbook.xlsx";
	    FileInputStream fis=new FileInputStream(path);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet ws=wb.getSheetAt(0);
	    
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
