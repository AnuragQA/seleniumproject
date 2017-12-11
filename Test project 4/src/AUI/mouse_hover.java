package AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com");
		
		WebElement hov1=d.findElement(By.xpath("html/body/form/div[3]/div[1]/header/div[2]/div/div/div[2]/div[1]/div/ul/li[2]/a"));
        WebElement hov2=d.findElement(By.xpath("html/body/form/div[3]/div[1]/header/div[2]/div/div/div[2]/div[1]/div/ul/li[4]/a"));	
        
        Actions obj=new Actions(d);
        obj.moveToElement(hov1).perform();
        
        Thread.sleep(2000);
      
        obj.moveToElement(hov2).perform();

	}

}
