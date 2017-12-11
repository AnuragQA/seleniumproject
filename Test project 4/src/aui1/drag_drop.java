package aui1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/droppable/");
		
		d.switchTo().frame(0);
		
		WebElement drg=d.findElement(By.id("draggable"));
		WebElement drp=d.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		Actions dd=new Actions(d);
		dd.dragAndDrop(drg, drp).build().perform();

	}

}
