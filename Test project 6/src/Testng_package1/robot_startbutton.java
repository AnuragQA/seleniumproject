package Testng_package1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class robot_startbutton {
  
	@Test
  public void f() throws AWTException {
  
  Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
  System.out.println(size);
  
  Sleeper.sleepTightInSeconds(2);
  
  Robot rb=new Robot();
  rb.mouseMove(20, 750);	
  rb.delay(2000);	
  
  rb.mousePress(InputEvent.BUTTON1_MASK);
  rb.mouseRelease(InputEvent.BUTTON1_MASK);
  rb.delay(2000);
  
  rb.keyPress(KeyEvent.VK_UP);
  rb.keyRelease(KeyEvent.VK_UP);
  rb.delay(2000);
  
  rb.keyPress(KeyEvent.VK_RIGHT);
  rb.keyRelease(KeyEvent.VK_RIGHT);
  rb.delay(2000);
  
  rb.mouseMove(250, 600);
  rb.delay(1000);
  rb.mousePress(InputEvent.BUTTON1_MASK);
  rb.delay(1000);
  rb.mouseMove(250, 300);
 
	}
}
