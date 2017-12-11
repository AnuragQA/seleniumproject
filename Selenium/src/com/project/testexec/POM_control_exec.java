package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.reuse.POM_page1_reuse;
import com.project.reuse.POM_page2_resuse;
import com.project.reuse.POM_page3_reuse;

public class POM_control_exec {
 
  @Test
  public void pom_exec() throws IOException 
  {
  
  FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\Datadriventesting.xlsx");
  XSSFWorkbook wb=new XSSFWorkbook(fis);
  XSSFSheet sh=wb.getSheetAt(0);
  
  WebDriver dr=new FirefoxDriver();
  
  dr.get("http://newtours.demoaut.com/mercurywelcome.php");
  
  POM_page1_reuse page1=PageFactory.initElements(dr, POM_page1_reuse.class);
  POM_page2_resuse page2=PageFactory.initElements(dr, POM_page2_resuse.class);
  POM_page3_reuse page3=PageFactory.initElements(dr, POM_page3_reuse.class);
  
  page1.registertest();
  Sleeper.sleepTightInSeconds(1);
  
  Iterator<Row> row=sh.iterator();
  row.next();
  while (row.hasNext())
    {
	   Row rr=row.next();
	   page2.registration(rr);
	   Sleeper.sleepTightInSeconds(1);
	   page3.validateregistration(rr);
	   Sleeper.sleepTightInSeconds(1);
	   dr.navigate().back();
    }
  
  FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\pom1.xlsx");
  wb.write(fos);
  wb.close();
  
  }
}
