package com.project.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class screen_shot {
  
	@Test
  public void f(WebDriver wd,String ac) throws IOException {
  
		File shot=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot, new File("C:\\Users\\Anurag\\workspace\\Selenium\\src\\com\\project\\screenshots\\"+ac+".jpg"));
	
	}
}
