package com.project.reuse;

import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class data_driven_framewrk {
  @Test
 
  public void data_frame(WebDriver dr,XSSFSheet wsh,Properties pr) {
  
	  dr.get(pr.getProperty("url"));
	  dr.findElement(By.linkText(pr.getProperty("link"))).click();
	  
	  Iterator<Row> row=wsh.iterator();
	  row.next();
	  while (row.hasNext()) 
	  {
		Row r=row.next();
		dr.findElement(By.xpath(pr.getProperty("fname"))).sendKeys(r.getCell(0).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("lname"))).sendKeys(r.getCell(1).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("ph"))).sendKeys(r.getCell(2).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("em"))).sendKeys(r.getCell(3).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("add"))).sendKeys(r.getCell(4).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("cty"))).sendKeys(r.getCell(5).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("sta"))).sendKeys(r.getCell(6).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("pos"))).sendKeys(r.getCell(7).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("cou"))).sendKeys(r.getCell(8).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("use"))).sendKeys(r.getCell(9).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("pass"))).sendKeys(r.getCell(10).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("copass"))).sendKeys(r.getCell(11).getStringCellValue());
		dr.findElement(By.xpath(pr.getProperty("btn"))).click();
		Sleeper.sleepTightInSeconds(1);
		
		String exp=r.getCell(9).getStringCellValue();
		String act=dr.findElement(By.xpath(pr.getProperty("note"))).getText();
		
		if (act.contains(exp))
		{
			r.createCell(12).setCellValue("PASS");
		}
		else
		{
			r.createCell(12).setCellValue("FAIL");
		}
		dr.findElement(By.linkText(pr.getProperty("link"))).click();
	  }
  
  }
}
