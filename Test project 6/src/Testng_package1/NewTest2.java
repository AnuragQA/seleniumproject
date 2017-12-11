package Testng_package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {

	@Test(priority=0)
  public void f() {
	  System.out.println("Login");
  }

	@Test(enabled=false)
  public void z() {
	  System.out.println("shopping cart");	
	}
	
	
	@Test(priority=1)
  public void a() {
      System.out.println("Logout");		
	}
	
	@BeforeClass
  public void beforeclass() {
	      System.out.println("Navigate to the web application homepage");	
	    }
	
	@AfterClass
  public void afterclass() {
	      System.out.println("Close the window");	
	    }
	
	@BeforeTest
  public void beforetest() {
	  System.out.println("Open Chrome browser");	
	}
	
	@AfterTest
  public void aftertest() {
	  System.out.println("Close browser");	
	}

   
}

