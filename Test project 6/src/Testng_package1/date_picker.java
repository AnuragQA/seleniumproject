package Testng_package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class date_picker {
 
	WebDriver d;
	
	@BeforeTest
	public void launch(){
		
	d=new FirefoxDriver();
	d.get("https://www.cleartrip.com/");
	Sleeper.sleepTightInSeconds(2);	
	}
	
	@Test
	public void calenderTest(){
	
	d.findElement(By.id("OneWay")).click(); // click the one way radio button.
	d.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)"); //destination from
	Sleeper.sleepTightInSeconds(1);
	d.findElement(By.id("ToTag")).sendKeys("Goa, IN - Dabolim Airport (GOI)");  // destination to
	Sleeper.sleepTightInSeconds(1);
	d.findElement(By.id("DepartDate")).click(); // click the date field/box.
	
	//user defined date
	String doj="30/January/2018";
	String a[]=doj.split("/");
	String day=a[0];
	String month=a[1];
	String year=a[2];
	
	//identify the year from the calendar and compare it to user defined year.
	String calyear=d.findElement(By.className("ui-datepicker-year")).getText();
	
	while (! calyear.equals(year)) {
		d.findElement(By.xpath("html/body/div[1]/div[2]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		calyear=d.findElement(By.className("ui-datepicker-year")).getText();
	}
	
	//identify the month from the calendar and compare it to user defined month.
	String calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
	
	while (! calmonth.equals(month)) {
		d.findElement(By.xpath("html/body/div[1]/div[2]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		calmonth=d.findElement(By.className("ui-datepicker-month")).getText();
	}
	
	//identify the web table from the calendar.
	WebElement table=d.findElement(By.xpath("html/body/div[1]/div[1]/table"));
	
	//identify all the rows from the web table 
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	
	for (int i = 0; i < rows.size(); i++) {
	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	
	for (int j = 0; j < cols.size(); j++) {
	String calday=cols.get(j).getText();	
	
	   if (calday.equals(day)) {
	   cols.get(j).click();
	   break;
	   }		
	  }		
	 }
	
	Sleeper.sleepTightInSeconds(1);
	// identify the adults drop box
	new Select(d.findElement(By.id("Adults"))).selectByValue("2");
	Sleeper.sleepTightInSeconds(1);
	d.findElement(By.id("SearchBtn")).click();
	
	}
	
}
