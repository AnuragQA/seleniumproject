package Testng_package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class grid_dataprovider {
  
	@DataProvider()
	public Object[][] getData(){
		Object[][] data=new Object[2][3];
		data[0][0]="Admin";
		data[0][1]="admin";
		data[0][2]="chrome";
		
		data[1][0]="Admin";
		data[1][1]="admin";
		data[1][2]="firefox";
		
		return data;
	}
	 
	@Test(dataProvider="getData")
  public void login_test(String u,String p,String b) throws MalformedURLException {
         
		System.out.println(b);
		DesiredCapabilities dc=null;
  
		if (b.equals("chrome")) {
			  
			  dc=DesiredCapabilities.chrome();
			  dc.setBrowserName("chrome");
			  dc.setPlatform(Platform.WINDOWS);  
			  
		}
		  
		  else if (b.equals("firefox")) {
			  
			  dc=DesiredCapabilities.firefox();
			  dc.setBrowserName("firefox");
			  dc.setPlatform(Platform.WINDOWS);
			
		}
		  
		  RemoteWebDriver rweb=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		  rweb.get("http://opensource.demo.orangehrmlive.com/");
		  rweb.manage().window().maximize();
	      rweb.findElement(By.id("txtUsername")).sendKeys(u);
	      rweb.findElement(By.id("txtPassword")).sendKeys(p);
	      rweb.findElement(By.name("Submit")).click();
  
  }
}
