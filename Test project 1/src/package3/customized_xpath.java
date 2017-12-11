package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customized_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")).sendKeys("java");
		

	}

}
