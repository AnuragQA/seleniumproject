package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Implicit_wait {

	public static void main(String[] args) {

		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.google.com");
		
	     d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 d.findElement(By.id("gb_70")).click();

	}

}
