package com.comcast.crm.LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.ObjectRepository.LoginTOVTiger;

public class LoginTest {

	@Test
	public void loginToCRM() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginTOVTiger lop=new LoginTOVTiger(driver);
		lop.loginTOCRm("admin", "admin");
		driver.close();
		System.out.println("--- closed ---");
	}
}
