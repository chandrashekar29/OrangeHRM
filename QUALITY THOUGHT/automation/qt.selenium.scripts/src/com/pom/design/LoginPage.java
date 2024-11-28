package com.pom.design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername")
	WebElement textBox_userName;
	
	@FindBy(id="txtPassword")
	WebElement textBox_password;
	
	@FindBy(id="btnLogin")
	WebElement button_Login;
	
	@FindBy(id="spanMessage")
	WebElement Error_MSG;
	
	@FindBy(id="spanCopyright")
	WebElement Msg_Footer;
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String userName,String password ) {
		textBox_userName.sendKeys(userName);
		
		textBox_password.sendKeys(password);
		button_Login.click();
		
	}

	
	public void verifyLoginErrormsg(String expectedErrormsg) {
		String ActualErrorMsg= Error_MSG.getText();
		if(ActualErrorMsg.equals(expectedErrormsg)) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
	}
	
	public void verifyFooterText() {
		
		String Actual_FooterText=Msg_Footer.getText();
		String Expected_FooterText="OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2024 All rights reserved.";
		
		if(Actual_FooterText.equals(Expected_FooterText)) {
			
			System.out.println("Test pass");
			
			
		}else {
			System.out.println("Test Fail");
		}
	}
	
	

}
