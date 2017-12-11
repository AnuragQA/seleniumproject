package Testng_package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class testng_robot {
  
	@Test
  public void f() throws AWTException {
  WebDriver d=new FirefoxDriver();
  d.get("http://www.seleniumhq.org/download/");
  Sleeper.sleepTightInSeconds(2);
  d.findElement(By.linkText("3.7.1")).click();
  Sleeper.sleepTightInSeconds(2);
   
  Robot rb=new Robot();
  rb.keyPress(KeyEvent.VK_TAB);
  rb.keyRelease(KeyEvent.VK_TAB);
  
  Sleeper.sleepTightInSeconds(2);
  
  rb.keyPress(KeyEvent.VK_ENTER);
  rb.keyRelease(KeyEvent.VK_ENTER);
  
  Sleeper.sleepTightInSeconds(3);
  
  rb.mouseMove(1180, 115);
  rb.mousePress(InputEvent.BUTTON1_MASK);
  rb.mouseRelease(InputEvent.BUTTON1_MASK);
  
	}
}
