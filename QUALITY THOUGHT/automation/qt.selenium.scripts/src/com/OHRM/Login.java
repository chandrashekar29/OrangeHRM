package com.OHRM;

import org.openqa.selenium.By;

public class Login extends BaseTest {
	public void verifyLoginErrorMSg(String ExpErrorMsg) {
		String ActErrorMsg=driver.findElement(By.id("spanMessage")).getText();
		if(ActErrorMsg.equalsIgnoreCase(ExpErrorMsg)) {
			System.out.println("Test pass");
			
		}
		else {
			System.out.println("Test Fail");
		}
	}

}
