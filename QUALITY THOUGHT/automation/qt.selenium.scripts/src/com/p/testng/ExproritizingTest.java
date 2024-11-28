package com.p.testng;

import org.testng.annotations.Test;

public class ExproritizingTest {
	
	@Test(priority=1)
	public void addEmployee() {
		System.out.println("Adding Employee");
	}
	@Test(priority=2)
	public void editEmployee() {
		System.out.println("Edit employee after adding the employee");
	}
	
	@Test(priority=0)
	public void deleteEmployee() {
		System.out.println("Delete employee after editing");
	}

}
