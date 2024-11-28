package com.OHRM;

public class OHRMExecution {

	public static void main(String[] args) throws InterruptedException {
		Login lgin= new Login();
		
		//TC1:verify login with Inavalid credentials
		lgin.LaunchBrowser();
		lgin.LaunchAUT();
		lgin.login("chan","chandu");
		lgin.verifyLoginErrorMSg("Invalid credentials");
		lgin.closeBrowser();
				
		
		//Tc2": verify login with username blank
		
		
		lgin.LaunchBrowser();
		lgin.LaunchAUT();
		lgin.login("", "chandu");
		lgin.verifyLoginErrorMSg("Username cannot be empty");
		lgin.closeBrowser();
		
		
		//TC3: verofy AddEmployee
		AddEmployee obj= new AddEmployee();
		obj.LaunchBrowser();
		obj.LaunchAUT();
		obj.login("Admin", "Admin");
		obj.NavigatetoAddEmp();
		String ExpempID=obj.AddEmpDetails();
		obj.NavigatetoAddEmp();
		obj.VerifyRecordEmpList(ExpempID);
		obj.closeBrowser();
		
		

	}

}
