package com.project.reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class keyword_action {
  
	WebDriver dr;
	
	@Test
	public void launchBrowser()
	{
		dr=new FirefoxDriver();
	}
	
	@Test
	public void navigate()
	{
	    dr.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@Test
	public void enterUsername()
	{
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Test
	public void enterpassword()
	{
		dr.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	
	@Test
	public void clickLogin()
	{
		dr.findElement(By.id("btnLogin")).click();
	}
	

}

