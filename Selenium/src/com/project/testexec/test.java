package com.project.testexec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {
		
	WebDriver d=null;
	
		@Test
		public void f()
		{
	     d=new FirefoxDriver();
	     d.get("https://www.google.com");
		 String title=d.getTitle();
		 System.out.println(title);
		 
		}
		
	}


