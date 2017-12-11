package Testng_package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class excel_login_file {
 
	@Test
  public void f() throws Exception {
    
		//reading the property file from the object repository.
		FileInputStream fis= new FileInputStream("C:\\Users\\Anurag\\workspace\\Test project 6\\login_filepro");
	    Properties pro=new Properties();
	    pro.load(fis);
	
	   //reading the excel file from the storage
	    FileInputStream fis1=new FileInputStream("C:\\Users\\Anurag\\Music\\Excel Workbook.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(fis1);
	    XSSFSheet ws=wb.getSheetAt(0);
	    
	   //launch the app
	    WebDriver d=new FirefoxDriver();
	    d.get(ws.getRow(1).getCell(2).getStringCellValue());
	    Sleeper.sleepTightInSeconds(1);
	    
	   //login into the app through the test data from excel
	    d.findElement(By.id(pro.getProperty("un"))).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
	    d.findElement(By.id(pro.getProperty("pass"))).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
	    d.findElement(By.id(pro.getProperty("btn"))).click();
	    
	    wb.close();
	    
	}
}
