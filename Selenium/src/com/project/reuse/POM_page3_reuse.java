package com.project.reuse;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM_page3_reuse 
{
 
	 @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	 WebElement txtmsg;	
     @Test
     public void validateregistration(Row r)
     {
         String acttxt=txtmsg.getText();
         String exptxt=r.getCell(9).getStringCellValue();
         
         if (acttxt.contains(exptxt)) 
         {
			r.createCell(12).setCellValue("PASS");
		 }
         else
         {
        	 r.createCell(12).setCellValue("FAIL");
		 }
	     
     }
}
