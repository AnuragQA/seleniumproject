package Testng_package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class datepicker_jse {
 
	@Test
  public void f() {
  
		WebDriver d=new FirefoxDriver();
		d.get("https://www.cleartrip.com/");
		Sleeper.sleepTightInSeconds(2);
	
		d.findElement(By.id("OneWay")).click(); // click the one way radio button.
		d.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)"); //destination from
		Sleeper.sleepTightInSeconds(1);
		d.findElement(By.id("ToTag")).sendKeys("Goa, IN - Dabolim Airport (GOI)");  // destination to
		Sleeper.sleepTightInSeconds(1);
		 
		JavascriptExecutor obj=(JavascriptExecutor)d;
		obj.executeScript("document.getElementById('DepartDate').value='Tue, 30 Jan, 2018'");
		Sleeper.sleepTightInSeconds(2);
		
		new Select(d.findElement(By.id("Adults"))).selectByValue("2");
		Sleeper.sleepTightInSeconds(1);
		
		d.findElement(By.id("SearchBtn")).click();
	
	}
}
