package com.p.testng;

import org.testng.annotations.Test;

public class ExGrouping {
	@Test(groups= {"smoke"})
	public void addadmin() {
		System.out.println("Adding admin");
		
	}
	@Test(groups= {"smoke"})
	public void addjobtitle() {
		System.out.println("Adding Jobtitle");
	}
	@Test(groups= {"smoke"})
	public void addpayGrades() {

	System.out.println("Adding payGrades");

}
	
	@Test(groups= {"smoke","regression"})
	public void addemployee() {
		System.out.println("Adding Employee");
		
	}
	@Test(groups= {"regression"})
	public void editemployee() {
		System.out.println("Edit employee after adding the employee");
	}
	@Test(groups= {"regression"})
	public void deleteemployee() {
		System.out.println("Delete employee after editing");
	}
}

