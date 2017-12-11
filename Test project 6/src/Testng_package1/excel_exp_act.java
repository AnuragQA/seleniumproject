package Testng_package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class excel_exp_act {
 
	@Test
  public void f() throws IOException {
 
        String path1="C:\\Users\\Anurag\\Music\\act_exp.xlsx";
		FileInputStream fis=new FileInputStream(path1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		
		//launch
		WebDriver d=new FirefoxDriver();
		d.get(ws.getRow(1).getCell(1).getStringCellValue());
		Sleeper.sleepTightInSeconds(2);
		
		//click the element and get the url of it.
		d.findElement(By.linkText(ws.getRow(1).getCell(0).getStringCellValue())).click();
		Sleeper.sleepTightInSeconds(2);
		String url=d.getCurrentUrl();
		ws.getRow(1).createCell(2).setCellValue(url);
		String acturl=ws.getRow(1).getCell(2).getStringCellValue();
		
		if (url.equals(acturl)) {
        ws.getRow(1).createCell(3).setCellValue("pass");			
		} 
		else {
	    ws.getRow(1).createCell(3).setCellValue("Fail");
		}
		
		String path2="C:\\Users\\Anurag\\Music\\urloutput.xlsx";
		FileOutputStream  fos=new FileOutputStream(path2);
		wb.write(fos);
		
		
  }
}
