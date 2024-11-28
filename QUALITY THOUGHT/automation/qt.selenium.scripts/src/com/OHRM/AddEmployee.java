package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends BaseTest{
	public void NavigatetoAddEmp() {
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
	}
	public String AddEmpDetails()  {
		driver.findElement(By.id("firstName")).sendKeys("raja");
	
		driver.findElement(By.id("lastName")).sendKeys("The Great");
		
		String ExpID=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		return ExpID;
	
	}
	
	public void navigatetoEmpList() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	}
	public void VerifyRecordEmpList(String ExpID ) {
		List<WebElement>ids= driver.findElements(By.xpath("//table[@id=['resultTable']/tbody/tr/td[2]"));
		boolean status=false;
		String ActId=null;
		
		for(WebElement id:ids) {
			ActId=id.getText();
			if(ActId.equals(ExpID)) {
				status=true;
				break;
			}
			
		}
		if(status) {
			System.out.println("test pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
	}

}
