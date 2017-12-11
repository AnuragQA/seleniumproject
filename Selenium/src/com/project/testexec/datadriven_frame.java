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

import com.project.reuse.data_driven;

public class datadriven_frame {
  
	@Test
  public void f() throws IOException {
	
		//reading data from properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\propertiesfile\\data_driven_frm");
		Properties pro=new Properties();
		pro.load(fis);
		
		//reading data from the excel file 
		FileInputStream fis2=new FileInputStream("C:\\Users\\Anurag\\Music\\data driven test data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis2);
		XSSFSheet ws=wb.getSheetAt(0);
		
		//launching firefox browser
		WebDriver dr=new FirefoxDriver();
		
		//creating an object for derived class to call function login
	//	data_driven_frame obj=new data_driven_frame();
	//	obj.login(dr, ws, pro);
        data_driven obj=new data_driven();
        obj.ff(dr, ws, pro);
		
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\output11.xlsx");
        wb.write(fos);
        wb.close();
        
	}
}
  