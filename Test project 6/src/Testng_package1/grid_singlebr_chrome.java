package Testng_package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid_singlebr_chrome {

	@Parameters("browser")
	
	@Test()
  public void grid_browser(String br) throws MalformedURLException {
    
	    System.out.println(br);  
		DesiredCapabilities dc=null;
	  
	  if (br.equals("chrome")) {
		  
		  dc=DesiredCapabilities.chrome();
		  dc.setBrowserName("chrome");
		  dc.setPlatform(Platform.WINDOWS);  
		  
	}
	  
	  else if (br.equals("firefox")) {
		  
		  dc=DesiredCapabilities.firefox();
		  dc.setBrowserName("firefox");
		  dc.setPlatform(Platform.WINDOWS);
		
	}
	  
	  RemoteWebDriver rweb=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
	  rweb.get("https://www.google.com");
	  rweb.manage().window().maximize();
  
  
  }
}
