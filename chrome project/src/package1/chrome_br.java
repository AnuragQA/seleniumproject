package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_br {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
        Thread.sleep(2000);
        d.close();
		
	}

}
