package com.project.reuse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM_reuse {
	
   public FileInputStream fs;
   public Properties pr;
   
  @FindBy(id="txtUsername") @CacheLookup WebElement usr;
	
  @FindBy(id="txtPassword") @CacheLookup WebElement pas;
  
  @FindBy(id="btnLogin") @CacheLookup WebElement btn;
  
  @FindBy(xpath="html/body/div[1]/div[1]/a[2]") @CacheLookup WebElement wel;
	
	
  @Test
  public String login(String user,String passs) throws IOException {
	  
	  usr.sendKeys(user);
	  pas.sendKeys(passs);
	  btn.click();
	  
	  String exp="Welcome Admin";
	  String act=wel.getText();
	  if (exp.equals(act)) 
	  {
	     return "PASS";
	  }
	  else 
	  {
		 return "FAIL";
	  }
	 
  }
}
