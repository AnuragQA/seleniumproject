package window_frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames_paytm {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		
		d.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[3]/div[3]/div")).click();
        
		List<WebElement> fr=d.findElements(By.tagName("iframe"));
		System.out.println(fr.size());
		
		for (int i = 0; i < fr.size(); i++)
		{
		   d.switchTo().frame(i);
		   
		   try {
			
			   d.findElement(By.id("input_0")).sendKeys("1234567890");
			   d.findElement(By.id("input_1")).sendKeys("anu12345");
			   d.findElement(By.xpath("html/body/div[1]/div/div[4]/div[2]/form/div/md-content/button[1]")).click();
			
		       } 
		   catch (Exception e)
		   {
			 System.out.println(e.getMessage());
			   
	       }
			
		}
		
		d.switchTo().defaultContent();
		d.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/ul/li[1]/div/div/input")).sendKeys("1234567890");
				
	}

}
