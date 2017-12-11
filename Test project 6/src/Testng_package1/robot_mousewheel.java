package Testng_package1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class robot_mousewheel {
 
	@Test
  public void f() throws AWTException {
   
		WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/download/");
		Sleeper.sleepTightInSeconds(3);
		
		Dimension srn=Toolkit.getDefaultToolkit().getScreenSize();
		
		Robot rb=new Robot();
		for (int i = 0; i < srn.height; i++)
		{
			rb.mouseWheel(768);
		}

		Sleeper.sleepTightInSeconds(2);
		
		for (int j = 0; j < srn.height; j++)
		{
			rb.mouseWheel(-768);
		}
	
	}
}
