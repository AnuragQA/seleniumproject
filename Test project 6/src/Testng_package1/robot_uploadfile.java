package Testng_package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class robot_uploadfile {
  
	@Test
  public void f() throws AWTException {
  
		WebDriver d=new FirefoxDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		Sleeper.sleepTightInSeconds(1);
		StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg"); //storing the required image or file path into variable
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);		//copying the image path.
		d.findElement(By.id("photo")).click();
		Sleeper.sleepTightInSeconds(2);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
}
