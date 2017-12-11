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

public class data_driven {
 
	screen_shot ss=new screen_shot();
	
	@Test
  public void ff(WebDriver d,XSSFSheet wsh,Properties pr) throws IOException {
  	
		Iterator<Row> row=wsh.iterator();
		row.next();
		while (row.hasNext()) 
		{
           Row r=row.next(); 
           Sleeper.sleepTightInSeconds(2);
            d.get(r.getCell(0).getStringCellValue());
        	d.findElement(By.id(pr.getProperty("un"))).sendKeys(r.getCell(1).getStringCellValue());
        	d.findElement(By.id(pr.getProperty("psd"))).sendKeys(r.getCell(2).getStringCellValue());
        	d.findElement(By.id(pr.getProperty("btn"))).click();
        	
            String exp=r.getCell(3).getStringCellValue();
            
            if (exp.equals("Welcome Admin"))
            {
                String act=d.findElement(By.linkText(pr.getProperty("txt"))).getText();
            	r.createCell(4).setCellValue(act);
            	if (exp.equals(act)) 
            	{
					r.createCell(5).setCellValue("PASS");
				} 
            	else
				{
					r.createCell(5).setCellValue("FAIL");
					ss.f(d, act);
				}
			}
            else if (exp.equals("Invalid credentials")) 
            {
			    String act=d.findElement(By.xpath(pr.getProperty("span"))).getText();
			    r.createCell(4).setCellValue(act);
			    if (exp.equals(act)) 
			    {
				    r.createCell(5).setCellValue("PASS");	
				}
			    else
			    {
			    	r.createCell(5).setCellValue("FAIL");
			    	ss.f(d, act);				
			    }
			}
            else if (exp.equals("Username cannot be empty")) 
            {
			    String act=d.findElement(By.xpath(pr.getProperty("uie"))).getText();
			    r.createCell(4).setCellValue(act);
			    if (exp.equals(act)) 
			    {
				    r.createCell(5).setCellValue("PASS");	
				}
			    else
			    {
			    	r.createCell(5).setCellValue("FAIL");
			    	ss.f(d, act);
				}
			}
            else if (exp.equals("Password cannot be")) 
            {
			    String act=d.findElement(By.xpath(pr.getProperty("pie"))).getText();
			    r.createCell(4).setCellValue(act);
			    if (exp.equals(act)) 
			    {
				    r.createCell(5).setCellValue("PASS");	
				}
			    else
			    {
			    	r.createCell(5).setCellValue("FAIL");
			    	ss.f(d, act);
				}
			}
            
		}
	 
	}
}
