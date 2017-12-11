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
import org.testng.annotations.Test;

import com.project.reuse.hybridframe_key;

public class hybrid_exec_frm {
 
    WebDriver d;
	hybridframe_key obj=new hybridframe_key();
  
  @Test
  public void hybrid_frm() throws IOException {
   
	  d=new FirefoxDriver();
	  
	  FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\HybridTest02.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(0);
	  XSSFSheet ws1=wb.getSheetAt(1);
	  
	  String exp=ws.getRow(1).getCell(0).getStringCellValue();
	  
	  //launch
	  String res=obj.launch(d, exp);
	  ws.getRow(1).createCell(1).setCellValue(res);
	  
	  Iterator<Row> row=ws1.iterator();
	  row.next();
	  while (row.hasNext())
	  {
		 Row r=row.next(); 
	     String user=r.getCell(0).getStringCellValue();
	     String psdd=r.getCell(1).getStringCellValue();
	     String keyy=r.getCell(2).getStringCellValue();
	     //login
	     String res1=obj.login(d, user, psdd, keyy);
	     r.createCell(3).setCellValue(res1);
	  // obj.launch(d, exp);
	     d.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	  } 
	  
	  FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\hybridoutput6.xlsx");
	  wb.write(fos);
	  wb.close();
	  
  }
}
