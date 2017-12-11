package Testng_package1;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid_singlebr {
 
	@Test
  public void f() throws MalformedURLException {
    
		DesiredCapabilities dc=DesiredCapabilities.firefox();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver rweb=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		rweb.get("https://google.com");
	
	}
}

