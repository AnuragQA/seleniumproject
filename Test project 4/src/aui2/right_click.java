package aui2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
		
		WebElement rc=d.findElement(By.linkText("Gmail"));
		
		Thread.sleep(2000); 
		
		Actions obj=new Actions(d);
	//	obj.contextClick(rc).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		obj.contextClick(rc).sendKeys("W").build().perform();

	}

}
