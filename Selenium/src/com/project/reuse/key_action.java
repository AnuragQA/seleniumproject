package com.project.reuse;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class key_action {
  
	WebDriver d;
    
  @Test
  public void launchBrowser() 
  {
     d=new FirefoxDriver();
  }

  @Test
  public void navigate(XSSFSheet wsh)
  {
	 d.get(wsh.getRow(2).getCell(4).getStringCellValue());  
  }
  
  @Test
  public void enterUsername(XSSFSheet wsh,Properties pr)
  {
	 d.findElement(By.id(pr.getProperty("un"))).sendKeys(wsh.getRow(3).getCell(4).getStringCellValue()); 
  }

  @Test
  public void enterpassword(XSSFSheet wsh,Properties pr)
  {
	  d.findElement(By.id(pr.getProperty("pass"))).sendKeys(wsh.getRow(4).getCell(4).getStringCellValue()); 
  }

  @Test
  public void clickLogin(Properties pr)
  {
	  d.findElement(By.id(pr.getProperty("btn"))).click();
  }
  

}
