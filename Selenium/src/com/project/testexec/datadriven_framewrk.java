package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.project.reuse.data_driven_framewrk;

public class datadriven_framewrk {
  
	@Test
  public void f() throws IOException {
  
		FileInputStream fs=new FileInputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\propertiesfile\\data_framewrk");
		Properties pro=new Properties();
		pro.load(fs);
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\Datadriventesting.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		
		WebDriver d=new FirefoxDriver();
	    
		data_driven_framewrk obj=new data_driven_framewrk();
        obj.data_frame(d, ws, pro);
        
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\output10.xlsx");
        wb.write(fos);
        wb.close();
		
		
	}
}
