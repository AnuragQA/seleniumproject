package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.project.reuse.key_framee;

public class key_frm_exec {
  
 key_framee obj=new key_framee();
 
	@Test
  public void f() throws IOException {
  
	FileInputStream fs=new FileInputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\propertiesfile\\keyword_drv");
	Properties pro=new Properties();
	pro.load(fs);
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheetAt(0);
	
	obj.key_frm_resuse(ws, pro);
	
	FileOutputStream fos= new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\keyoutput3.xlsx");
	wb.write(fos);
	wb.close();
	
	}
}
