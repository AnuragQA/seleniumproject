package Testng_package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

public class excel_actresult_status {
  
	@Test
  public void f() throws IOException {
   
		String path="C:\\Users\\Anurag\\workspace\\Test project 6\\file_prop";
		FileInputStream fis=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fis);
		
	/*	
		String path="C:\\Users\\Anurag\\Music\\act_exp.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
	*/	
		
		WebDriver d=new FirefoxDriver();
		d.get(pro.getProperty("un"));
		
		
	/*	
		//click all the elements on the left and get the url of each.
		int rowcount=ws.getLastRowNum();
		System.out.println(rowcount);
		Sleeper.sleepTightInSeconds(1);
		
		for (int i = 1; i <= rowcount; i++) {
		    d.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
		    String acturl=d.getCurrentUrl();
			ws.getRow(i).createCell(2).setCellValue(acturl);	
			String expurl=ws.getRow(i).getCell(1).getStringCellValue();
			if (expurl.equals(acturl)) 
			{
			   ws.getRow(i).createCell(3).setCellValue("PASS");	
			} 
			else 
			{
			   ws.getRow(i).createCell(3).setCellValue("FAIL");
			}
			
		}
		
		String path2="C:\\Users\\Anurag\\Music\\actualoutput.xlsx";
		FileOutputStream fos=new FileOutputStream(path2);
		wb.write(fos);
		*/
	}
}
