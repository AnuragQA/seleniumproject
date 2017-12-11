package aui5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
		
		WebElement link=d.findElement(By.linkText("Gmail"));
		
		Actions obj=new Actions(d);
	//	obj.doubleClick(link).build().perform();
		
		obj.clickAndHold(link).build().perform();
		
		Thread.sleep(5000);
		
		obj.release(link).build().perform();
		

	}

}
