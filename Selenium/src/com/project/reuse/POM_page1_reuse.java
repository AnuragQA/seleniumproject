package com.project.reuse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM_page1_reuse {
 
	
  @FindBy(linkText="SIGN-ON") 
  @CacheLookup WebElement signon;	
  @Test
  public void SignOntest()
  {
      signon.click();
  }

  @FindBy(linkText="REGISTER")
  @CacheLookup WebElement register;
  @Test
  public void registertest()
  {
	  register.click();
  }
  
  @FindBy(linkText="SUPPORT")
  @CacheLookup WebElement support;
  @Test
  public void supporttest()
  {
	  support.click();
  }

  @FindBy(linkText="CONTACT")
  @CacheLookup WebElement contact;
  @Test
  public void contacttest()
  {
	  contact.click();
  }

  @FindBy(name="userName") @CacheLookup WebElement un;
  @FindBy(name="password") @CacheLookup WebElement pass;
  @FindBy(name="login") @CacheLookup WebElement lgn;
  @Test
  public void findflight(String user, String pwd)
  {
	  un.sendKeys(user);
	  pass.sendKeys(pwd);
	  lgn.click();
  }

  @FindBy(linkText="your destination")
  @CacheLookup WebElement destiny;
  @Test
  public void destinations()
  {
	  destiny.click();
  }

  @FindBy(linkText="featured vacation destinations")
  @CacheLookup WebElement featuredestiny;
  @Test
  public void vacations()
  {
	  featuredestiny.click();
  }

  @FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a")
  @CacheLookup WebElement reghere;
  @Test
  public void registerhere()
  {
	  reghere.click();
  }
  
}


