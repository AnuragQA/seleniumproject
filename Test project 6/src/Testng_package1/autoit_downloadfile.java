package Testng_package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class autoit_downloadfile {
 
	@Test
  public void f() throws IOException {
  WebDriver d=new FirefoxDriver();
  d.get("http://www.seleniumhq.org/download/");
  Sleeper.sleepTightInSeconds(1);
  d.findElement(By.linkText("3.7.1")).click();
  Sleeper.sleepTightInSeconds(1);
  Runtime.getRuntime().exec("F:\\WebDriver setup files\\AutoIT\\download.exe");	
	
	}
}
