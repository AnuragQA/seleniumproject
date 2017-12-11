package Testng_package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel_jxl {
 
	@Test
  public void f() throws BiffException, IOException {
 
	String path="C:\\Users\\Anurag\\Music\\Excel Workbook.xls";
	FileInputStream fis=new FileInputStream(path);  // read the test data from excel file
	Workbook wb=Workbook.getWorkbook(fis);
	Sheet ws=wb.getSheet(0);
	
	//launch
	WebDriver d=new FirefoxDriver();
	d.get(ws.getCell(2, 1).getContents());
	Sleeper.sleepTightInSeconds(2);
	
	//login
	d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
	d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
	d.findElement(By.id("btnLogin")).click();
	
	
	}
}
