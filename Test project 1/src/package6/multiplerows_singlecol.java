package package6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplerows_singlecol {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/"); 
		
		for (int i = 1; i <= 10; i++)
		{
		String name=d.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td[7]/a")).getText();
		System.out.println(name);	
		}

	}

}
