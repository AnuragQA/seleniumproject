package aui3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_go {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://jqueryui.com/slider/");
		
		d.switchTo().frame(0);
		
		WebElement sqr=d.findElement(By.xpath("html/body/div[1]/span"));
		
		Thread.sleep(2000);
		
		Actions obj=new Actions(d);
		obj.dragAndDropBy(sqr, 200, 0).build().perform();

	}

}
