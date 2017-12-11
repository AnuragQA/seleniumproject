package Testng_package1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class txtbox_txtbutn_jse {
 
	@Test
  public void f() {
  
    WebDriver d=new FirefoxDriver();
    d.get("https://www.bing.com");
    
    JavascriptExecutor obj=(JavascriptExecutor)d;
    obj.executeScript("document.getElementById('sb_form_q').value=('selenium')");
    obj.executeScript("document.getElementById('sb_form_go').click()");
    Sleeper.sleepTightInSeconds(4);
    d.quit();
	
	}
}
