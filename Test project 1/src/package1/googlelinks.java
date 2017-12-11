package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlelinks {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.google.co.in");

		List<WebElement> link=d.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (int i = 0; i < link.size(); i++)
		{
		
			if (!link.get(i).getText().isEmpty())
			{	
			 link.get(i).click();
		     String str=d.getCurrentUrl();
		     System.out.println(str);
			 link=d.findElements(By.tagName("a"));
			}
			else
			{
			 System.out.println("Invisible links are..."+i);	
			}
		
		}
		
	}

}
