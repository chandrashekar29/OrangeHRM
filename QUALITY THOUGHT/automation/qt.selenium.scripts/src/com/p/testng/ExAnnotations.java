package com.p.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExAnnotations {
	
	
	@Test
	public void testcase1() {
		System.out.println("This is the Test case1");
		
	}
	@Test
	public void testcase2() {
		System.out.println("this is the Testcase2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will Execute After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this will execute before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the test");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("This will execute before the test suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This will execute after the test suite ");
	}
	

}
