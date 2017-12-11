package synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


 
public class flunt_wait {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(d).withTimeout(160, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver d){
			return d.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[8]/a/img"));
		}
		});
		foo.click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[8]/a/img"))).click();

	}

}
