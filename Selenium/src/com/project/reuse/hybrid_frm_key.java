package com.project.reuse;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.project.utilities.screen_shot;

public class hybrid_frm_key {
 
  screen_shot screen=new screen_shot();
  
  @Test
  public void Navigate(WebDriver dr,XSSFSheet wsh) throws IOException
  {
    dr.get(wsh.getRow(1).getCell(2).getStringCellValue());
    String ex="OrangeHRM";
    String ac=dr.getTitle();
    if (ex.equals(ac))
     {
	   wsh.getRow(1).createCell(4).setCellValue("Homepage is displayed and page title is also displayed as Welcome Admin");
	   wsh.getRow(1).createCell(5).setCellValue("PASS");
	 }
    else 
     {
	   
	   screen.f(dr, "Title-notmatched");
	   wsh.getRow(1).createCell(4).setCellValue("Homepage is displayed but the page title not matched");
	   wsh.getRow(1).createCell(5).setCellValue("FAIL");
	 }
    
  }
  
  @Test
  public void Login(WebDriver dr,XSSFSheet wsh,XSSFSheet wsh1,Properties pr) throws IOException
  {
	Iterator<Row> row=wsh.iterator();
	row.next();
	row.next();
	while (row.hasNext()) 
	{
	   Row r=row.next();
	   String exp=r.getCell(1).getStringCellValue();
	   if (exp.equals("Login")) 
	   {
		   Iterator<Row> row1=wsh1.iterator();
		   row1.next();
		   while (row1.hasNext())
		   {
			Row r1=row1.next();
			dr.findElement(By.id(pr.getProperty("un"))).sendKeys(r1.getCell(0).getStringCellValue());
			dr.findElement(By.id(pr.getProperty("pass"))).sendKeys(r1.getCell(1).getStringCellValue());
			dr.findElement(By.id(pr.getProperty("btn"))).click();
			
			String ex=r1.getCell(2).getStringCellValue();
			if (ex.equals("Welcome Admin")) 
			  {
			    String ac=dr.findElement(By.xpath(pr.getProperty("path"))).getText();
			    if (ex.equals(ac))
			       {
			           r1.createCell(3).setCellValue(ac);
			           r1.createCell(4).setCellValue("PASS");
			           r.createCell(4).setCellValue("The user is successfully logged in");
			           r.createCell(5).setCellValue("PASS");
			       }
			    else
			       {
				       screen.f(dr, "login-fail");
				       r1.createCell(3).setCellValue(ac);
			           r1.createCell(4).setCellValue("FAIL");
			           r.createCell(4).setCellValue("The user is not logged in");
			           r.createCell(5).setCellValue("FAIL");
			           
			       }
			  }
			
			else if (ex.equals("Invalid credentials")) 
			  {
				String ac=dr.findElement(By.xpath(pr.getProperty("in"))).getText();
				if (ex.equals(ac))
				  {
					  r1.createCell(3).setCellValue(ac);
					  r1.createCell(4).setCellValue("PASS");
				  }
				else 
				  {
					  screen.f(dr, "login-fail");
					  r1.createCell(3).setCellValue(ac);
			          r1.createCell(4).setCellValue("FAIL");
					  
				  }
				
			  }
			Sleeper.sleepTightInSeconds(2);
			dr.get(wsh.getRow(1).getCell(2).getStringCellValue());
		   }   
	   }	  
	}
  }
}
