package com.project.testexec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.project.reuse.keyword_action;

public class keyword_drivenfrm {
 
	@Test
  public void f() throws IOException {
  
	keyword_action obj=new keyword_action();
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Anurag\\Music\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheetAt(0);
	
	Iterator<Row> row=ws.iterator();
	row.next();
	
	while (row.hasNext())
	  {
	     Row r=row.next();
	     String exp=r.getCell(3).getStringCellValue();
	     
	     if (exp.equals("launchBrowser")) 
	     {
		    obj.launchBrowser();
		    r.createCell(5).setCellValue("PASS");
		 }
		 
	     else if (exp.equals("navigate"))
	     {
		    obj.navigate();
		    r.createCell(5).setCellValue("PASS");
		 }
		
	     else if (exp.equals("enterUsername"))
	     {
			obj.enterUsername();
			r.createCell(5).setCellValue("PASS");
		 }
	     
	     else if (exp.equals("enterpassword")) 
	     {
			obj.enterpassword();
			r.createCell(5).setCellValue("PASS");
		 }
	
	     else if (exp.equals("clickLogin"))
	     {
			obj.clickLogin();
			r.createCell(5).setCellValue("PASS");
		 }
	  }
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\testresults\\keyoutput.xlsx");
	wb.write(fos);
	wb.close();
	
	}
}
