package Testng_package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
 
	@Test(priority=0)
  public void f() {
	System.out.println("create account");	
  }
	
	@Test(priority=2)
  public void z() {	
	System.out.println("logout");
	}
	
   @Test(priority=1)
   public void a() {
	System.out.println("login");      
   }

   @BeforeMethod
   public void beforemethod() {
	 System.out.println("Navigate to url");  
   }
   
   @AfterMethod
   public void aftermethod() {
	 System.out.println("close window");  
   }

   @BeforeClass
   public void beforeclass() {
	 System.out.println("Open the browser");  
   }
   
   @AfterClass
   public void afterclass() {
	 System.out.println("Close the browser");  
   }
   
   
}
