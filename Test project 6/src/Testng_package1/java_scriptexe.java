package Testng_package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class java_scriptexe {
 
	@Test
  public void f() {
    
		WebDriver d=new FirefoxDriver();
		d.get("http://www.bing.com/");
		WebElement src=d.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[5]/div/ul/li[8]/div/ul/li[2]/a/div/div[1]"));
		
		WebElement src2=d.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[5]/div/ul/li[8]/div/ul/li[6]/a/div/div[1]"));
		
		JavascriptExecutor obj=(JavascriptExecutor)d;
		obj.executeScript("arguments[0].click()", src);
		Sleeper.sleepTightInSeconds(2);
		obj.executeScript("arguments[0].click()", src2);
	}
}
