package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.project.reuse.hybrid_frm_key;

public class hybrid_exec {
 
  hybrid_frm_key obj=new hybrid_frm_key();
  
  @Test
  public void hybrid_frame_exec() throws IOException {
 
	FileInputStream fs=new FileInputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\propertiesfile\\keyword_drv");  
	Properties pro=new Properties();
	pro.load(fs);
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\HybridTest.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheetAt(0);
	XSSFSheet ws1=wb.getSheetAt(1);
	
	WebDriver d=new FirefoxDriver();
	
	Sleeper.sleepTightInSeconds(1);
	obj.Navigate(d, ws);
	Sleeper.sleepTightInSeconds(2);
	obj.Login(d, ws, ws1, pro);
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\hybridoutput2.xlsx");
	wb.write(fos);
	wb.close();
	  
	}
}
