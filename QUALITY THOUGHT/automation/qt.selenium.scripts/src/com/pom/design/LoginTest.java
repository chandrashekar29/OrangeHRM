package com.pom.design;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyLoginWithInvalidCredentials() throws InterruptedException {
		LaunchBrowser();
		LaunchAUT();
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.login("sheka", "123456");
		loginpage.verifyLoginErrormsg("Invalid Credentials");
		
		
		

	}

}
