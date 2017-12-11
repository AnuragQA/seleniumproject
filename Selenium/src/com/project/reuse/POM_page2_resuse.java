package com.project.reuse;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM_page2_resuse {
 
  @FindBy(name="firstName")
  WebElement firstname;
  
  @FindBy(name="lastName")
  WebElement lastName;
  
  @FindBy(name="phone")
  WebElement phone;
  
  @FindBy(name="userName")
  WebElement email;
  
  @FindBy(name="address1")
  WebElement address1;
  
  @FindBy(name="city")
  WebElement city;
  
  @FindBy(name="state")
  WebElement state;
  
  @FindBy(name="postalCode")
  WebElement postalCode;
  
  @FindBy(name="country")
  WebElement country;
  
  @FindBy(name="email")
  WebElement username;
  
  @FindBy(name="password")
  WebElement password;
  
  @FindBy(name="confirmPassword")
  WebElement confirmPassword;
  
  @FindBy(name="register")
  WebElement submit;
  
  @Test
  public void registration(Row r) {
  
  firstname.sendKeys(r.getCell(0).getStringCellValue());
  lastName.sendKeys(r.getCell(1).getStringCellValue());
  phone.sendKeys(r.getCell(2).getStringCellValue());
  email.sendKeys(r.getCell(3).getStringCellValue());
  address1.sendKeys(r.getCell(4).getStringCellValue());
  city.sendKeys(r.getCell(5).getStringCellValue());
  state.sendKeys(r.getCell(6).getStringCellValue());
  postalCode.sendKeys(r.getCell(7).getStringCellValue());
  country.sendKeys(r.getCell(8).getStringCellValue());
  username.sendKeys(r.getCell(9).getStringCellValue());
  password.sendKeys(r.getCell(10).getStringCellValue());
  confirmPassword.sendKeys(r.getCell(11).getStringCellValue());
  submit.click();
  
  }
}
