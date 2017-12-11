package package3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class compare_screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
		File src1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
		d.get("https://www.facebook.com/");
		File src2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
		if (FileUtils.contentEquals(src1, src2)) 
		{
		System.out.println("screenshot is matched");
		}
		else
		{
		System.out.println("screenshot is not matched");	
		}
	}

}
