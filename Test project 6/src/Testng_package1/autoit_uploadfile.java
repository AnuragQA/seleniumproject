package Testng_package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class autoit_uploadfile {
  
	@Test
  public void f() throws IOException {
  
	WebDriver d=new FirefoxDriver();
	d.get("https://toolsqa.com/automation-practice-form/");
    Sleeper.sleepTightInSeconds(2);
    d.findElement(By.id("photo")).click();
    Sleeper.sleepTightInSeconds(2);
    Runtime.getRuntime().exec("F:\\WebDriver setup files\\AutoIT\\a.exe");
	
	}
}
