package aui4;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class text_box {

	public static void main(String[] args) {
		 
		WebDriver d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		
		WebElement num=d.findElement(By.id("age"));
		
		Actions obj=new Actions(d);
		obj.moveToElement(num).build().perform();
			
		String name=d.findElement(By.className("ui-tooltip-content")).getText();
        System.out.println(name);
	}

}
