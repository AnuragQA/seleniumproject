package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie_browser {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.ie.driver", "C:\\Program Files\\ie\\IEDriverServer.exe");
	    InternetExplorerDriver driver=new InternetExplorerDriver();
	    driver.navigate().to("https://www.google.co.in/");

	}
}
