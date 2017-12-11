package com.project.testexec;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class log4j_exec {
 
	public static Logger logg=Logger.getLogger("log4j_exec");
	
  @Test
  public void log4jj() {
  
      String path="C:\\Users\\Anurag\\workspace\\Selenium\\log4jjj.properties";
      PropertyConfigurator.configure(path);
  
      WebDriver d=new FirefoxDriver();
      logg.info("browser launched");
      
      d.get("http://opensource.demo.orangehrmlive.com/");
      logg.info("webpage has been loaded");
      
      d.findElement(By.id("txtUsername")).sendKeys("Admin");
      logg.info("username is entered");
      
      d.findElement(By.id("txtPassword")).sendKeys("admin");
      logg.info("password is entered");
      
      d.findElement(By.id("btnLogin")).click();
      logg.info("clicked login button");
      
  }
}
