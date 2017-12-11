package package8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ajaxelements_dxpath {

	public static void main(String[] args) throws InterruptedException {
		 FirefoxDriver d=new FirefoxDriver();
         d.get("https://in.yahoo.com/");		 
         d.findElement(By.id("uh-search-box")).sendKeys("selenium");
        List<WebElement> ajax=d.findElements(By.xpath("//*[starts-with(@id,'yui_3_18_0_3_1509')]/li"));
		Thread.sleep(2000);
		
		for (int i = 0; i < ajax.size(); i++) 
		{
		   if (ajax.get(i).getText().equals("selenium tutorial"))
		   {
			ajax.get(2).click();
			break;
			   
		   }
			
		}

	}

}
