package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.reuse.POM_reuse;

public class POM_exec {
 	
  @Test
  public void f() throws IOException {
  
	  FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\HybridTest02.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(2);
	  
	  WebDriver dr=new FirefoxDriver();
      dr.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
      
      String un=ws.getRow(1).getCell(0).getStringCellValue();
      String pwd=ws.getRow(1).getCell(1).getStringCellValue();
      
      POM_reuse pf=PageFactory.initElements(dr, POM_reuse.class);
      String res=pf.login(un, pwd);
      ws.getRow(1).createCell(2).setCellValue(res);
	
	  FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\POMoutput.xlsx");
	  wb.write(fos);
	  wb.close();
	  
  }
} 
