package Testng_package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class scroll_down {
 
	@Test
  public void f() {
    
		WebDriver d=new FirefoxDriver();
		d.get("http://www.seleniumhq.org/");
		Sleeper.sleepTightInSeconds(2);
		JavascriptExecutor obj=(JavascriptExecutor)d;
		obj.executeScript("window.scrollBy(0,800)");
		Sleeper.sleepTightInSeconds(2);
		obj.executeScript("window.scrollBy(0,-600)");
		
	
	}
}
