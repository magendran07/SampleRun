package com.comcast.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTOVTiger {
	WebDriver driver;
	public LoginTOVTiger(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	
	@FindBy(id="submitButton")
	WebElement submit;
	
	public void loginTOCRm(String userid,String passkey) {
	username.sendKeys(userid);
password.sendKeys(passkey);
	submit.click();
	
	}

}
