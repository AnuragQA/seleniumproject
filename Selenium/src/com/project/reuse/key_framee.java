package com.project.reuse;

import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class key_framee {
 
	WebDriver dr;
	
  @Test
  public void key_frm_resuse(XSSFSheet wsh,Properties pr)
    {
      
	  Iterator<Row> row=wsh.iterator();
	  row.next();
	  while (row.hasNext()) 
	  {
		Row r=row.next();
		String exp=r.getCell(3).getStringCellValue();
		
		if (exp.equals("launchBrowser"))
		{
		   dr=new FirefoxDriver();
		   r.createCell(5).setCellValue("PASS");
		}
	  
		if (exp.equals("navigate"))
		{
		   dr.get(r.getCell(4).getStringCellValue());
		   r.createCell(5).setCellValue("PASS");
		}
	  
		if (exp.equals("enterUsername"))
		{
		   dr.findElement(By.id(pr.getProperty("un"))).sendKeys(r.getCell(4).getStringCellValue());
		   r.createCell(5).setCellValue("PASS");
		}
	  
		if (exp.equals("enterpassword"))
		{
		   dr.findElement(By.id(pr.getProperty("pass"))).sendKeys(r.getCell(4).getStringCellValue());
		   r.createCell(5).setCellValue("PASS");
		}
	  
		if (exp.equals("clickLogin"))
		{
		   dr.findElement(By.id(pr.getProperty("btn"))).click();
		   r.createCell(5).setCellValue("PASS");
		}	  
	  
	  
	  }
	  
	}
}
