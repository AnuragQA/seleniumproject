package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_screenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.co.in");
		d.findElement(By.id("lst-ib")).sendKeys("java");
		d.findElement(By.name("btnK")).click();
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\screenshots\\googlesearch.png"));
		
	}

}
