package window_frame;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;
import com.thoughtworks.selenium.webdriven.commands.GetElementIndex;

public class win_handles {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.onlinesbi.com/");
		d.findElement(By.xpath("html/body/div[1]/div/div[2]/ul[1]/li[5]/a")).click();
		
		Set<String> link=d.getWindowHandles();
		System.out.println(link);
		
		Object pop[]=link.toArray();
		String str1=pop[1].toString();
		String str2=pop[0].toString();
		
		d.switchTo().window(str1);
		
		WebElement list1=d.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div/div/div[1]/div/div/select"));
		List<WebElement> names1=list1.findElements(By.tagName("option"));
		names1.get(3).click();
		
		WebElement list2=d.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div/div/div[2]/div/div/select"));
		List<WebElement> names2=list2.findElements(By.tagName("option"));
    
		for (int i = 0; i < names2.size(); i++) 
		{
			String rn=names2.get(i).getText();
			if (rn.equals("Noida Power")) 
			{
				names2.get(i).click();
				System.out.println("The element is clicked");		
			}	
		}
		Sleeper.sleepTightInSeconds(2);
		d.close();
		
		d.switchTo().window(str2);
	
		WebElement hov1=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[1]/span"));
		WebElement hov2=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[2]/span"));
		WebElement hov3=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[3]/span"));
		WebElement hov4=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[4]/span"));
		WebElement hov5=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[5]/span"));
		WebElement hov6=d.findElement(By.xpath("html/body/div[1]/div/div[7]/ul/li[6]/span"));
		
		Sleeper.sleepTightInSeconds(1);
		
		Actions obj=new Actions(d);
		obj.moveToElement(hov1).perform();
		Sleeper.sleepTightInSeconds(1);
		obj.moveToElement(hov2).perform();
		Sleeper.sleepTightInSeconds(1);
		obj.moveToElement(hov3).perform();
		Sleeper.sleepTightInSeconds(1);
		obj.moveToElement(hov4).perform();
		Sleeper.sleepTightInSeconds(1);
		obj.moveToElement(hov5).perform();
		Sleeper.sleepTightInSeconds(1);
		obj.moveToElement(hov6).perform();
		
		d.quit();
				
	//	new Select(d.findElement(By.xpath("html/body/div[1]/div/section[2]/div[1]/div/div/div[2]/div/div/select"))).selectByVisibleText("Southern Power Distribution Co Ltd (APSPDCL)");
	}

}
