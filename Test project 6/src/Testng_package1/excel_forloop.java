package Testng_package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel_forloop {
 
	@Test
  public void f() throws IOException {
     
		String path="C:\\Users\\Anurag\\Music\\New Microsoft Excel Workbook.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		
		int rn=ws.getLastRowNum();
		System.out.println(rn);
		
		for (int i = 0; i <= rn; i++)  //rn=8
		{
		   String data0=ws.getRow(i).getCell(0).getStringCellValue();
		   System.out.print("  "+data0); 
		   String data1=ws.getRow(i).getCell(1).getStringCellValue();
		   System.out.print("  "+data1);
		   System.out.println("\n");
		}
		
	
	}
}
