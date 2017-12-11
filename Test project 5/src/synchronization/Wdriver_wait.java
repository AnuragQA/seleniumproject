package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wdriver_wait {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		
		WebDriverWait obj=new WebDriverWait(d, 160);
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[8]/a/img"))).click();
    
	}

}