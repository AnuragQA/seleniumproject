package multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class window_handles {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.onlinesbi.com/");
		d.findElement(By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[7]/a")).click();
        
		Set<String> ids=d.getWindowHandles();
		System.out.println(ids);
	    
		Object pops[]=ids.toArray();
		String str1=pops[1].toString();
		String str2=pops[0].toString();
		
		d.switchTo().window(str1);
		
		d.findElement(By.id("txtsearch")).sendKeys("loan");
	    d.findElement(By.id("btnPostdata")).click();
	    Sleeper.sleepTightInSeconds(2);
	    d.close();
	    
	    d.switchTo().window(str2);
	    
	    d.findElement(By.xpath("html/body/div[1]/div/div[4]/div[1]/div/a[2]/span[1]")).click();
	    Sleeper.sleepTightInSeconds(2);
	    d.quit();
	
	}

}

