package Testng_package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid_data_provider {
	
	@Parameters({"browser","e","p"})
	
	@Test()
  public void fb_login(String browser,String e,String p) throws MalformedURLException {

		System.out.println(browser);
		
		DesiredCapabilities dc=null;
		if (browser.equals("chrome")) {
			
           dc=DesiredCapabilities.chrome();
           dc.setBrowserName("chrome");
           dc.setPlatform(Platform.WINDOWS);
	
		}
	    else if (browser.equals("firefox")) {
		   dc=DesiredCapabilities.firefox();
		   dc.setBrowserName("firefox");
		   dc.setPlatform(Platform.WINDOWS);
	    	
		}
		
		RemoteWebDriver rweb=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		rweb.get("https://www.facebook.com/login/");
		rweb.manage().window().maximize();
		rweb.findElement(By.id("email")).sendKeys(e);
	    rweb.findElement(By.id("pass")).sendKeys(p);
	    rweb.findElement(By.id("loginbutton")).click();
		
		
	}
}

