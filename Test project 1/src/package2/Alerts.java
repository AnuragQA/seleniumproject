package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(2000);
		d.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		String name=d.switchTo().alert().getText();
		System.out.println(name);
		d.switchTo().alert().accept();

	}

}
