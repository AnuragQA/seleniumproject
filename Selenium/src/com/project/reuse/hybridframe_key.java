package com.project.reuse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.project.utilities.screen_shot;

public class hybridframe_key {

  public FileInputStream fs;
  public Properties pr;
  public screen_shot ss=new screen_shot();
	
  @Test
  public String launch(WebDriver dr,String url) throws IOException
  {
    dr.get(url);
    Sleeper.sleepTightInSeconds(1);
    
    String expres="OrangeHRM";
    String actres=dr.getTitle();
    
    if (expres.equals(actres))
    {
	   	return "PASS";
	} 
    else 
    {
        ss.f(dr, "launchfail");
        return "FAIL";
	}  
  }
  
  @Test
  public String login(WebDriver dr,String username,String password,String wsh) throws IOException
  {
	  fs=new FileInputStream("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\propertiesfile\\keyword_drv");
	  pr=new Properties();
	  pr.load(fs);
	  
	  dr.findElement(By.id(pr.getProperty("un"))).sendKeys(username);
	  dr.findElement(By.id(pr.getProperty("pass"))).sendKeys(password);
	  dr.findElement(By.id(pr.getProperty("btn"))).click();
	  Sleeper.sleepTightInSeconds(1);
	  
	  String exp=wsh;
	  if (exp.equals("welcome")) 
	  {
	     String expres="Welcome Admin";
	     String actres=dr.findElement(By.xpath(pr.getProperty("path"))).getText();
	     if (expres.equals(actres)) 
	     {
		    return "PASS";
	     } 
	     else 
	     {
            ss.f(dr, "loginfail");
            return "FAIL";
	     } 
	  }
	  else if (exp.equals("invalid1"))
	  {
		 String expres="Invalid credentials";
		 String actres=dr.findElement(By.xpath(pr.getProperty("in"))).getText();
		 if (expres.equals(actres)) 
		 {
		    return "PASS";	
		 } 
		 else 
		 {
			 ss.f(dr, "loginfail");
	         return "FAIL";
	
		 }
	  }
	  else if (exp.equals("invalid2"))
	  {
		 String expres="Invalid credentials";
		 String actres=dr.findElement(By.xpath(pr.getProperty("in"))).getText();
		 if (expres.equals(actres)) 
		 {
		    return "PASS";	
		 } 
		 else 
		 {
			 ss.f(dr, "loginfail");
	         return "FAIL";
	
		 }
	  }
	  else if (exp.equals("invalid3"))
	  {
		 String expres="Invalid credentials";
		 String actres=dr.findElement(By.xpath(pr.getProperty("in"))).getText();
		 if (expres.equals(actres)) 
		 {
		    return "PASS";	
		 } 
		 else 
		 {
			 ss.f(dr, "loginfail");
	         return "FAIL";
	
		 }
	  }
	  return wsh;
	}
  
}
