package Testng_package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class alert_jse {
 
	@Test
  public void f() {
  WebDriver d=new FirefoxDriver();
  d.get("https://www.google.co.in");
  
  JavascriptExecutor obj=(JavascriptExecutor)d;
  obj.executeScript("alert('You are Hacked!!!')");
  Sleeper.sleepTightInSeconds(3);
  d.switchTo().alert().accept();
  Sleeper.sleepTightInSeconds(2);
  d.quit();
	
	}
}
