package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_br {

	public static void main(String[] args) throws InterruptedException {
	    
		//Setting up property for chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		
		//launching chrome browser
		WebDriver d=new ChromeDriver();
		
		//launching the application homepage
		d.get("https://www.google.co.in/");
		
		//maximizing the window 
		d.manage().window().maximize();
        
		//applying the wait statement
		Thread.sleep(2000);
        
		//closing the current window
        d.close();
		
	}

}
