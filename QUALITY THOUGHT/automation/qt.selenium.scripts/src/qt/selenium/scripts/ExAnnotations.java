package qt.selenium.scripts;

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
		System.out.println("Test case1");
		
	}
	@Test
	public void testcase2() {
		System.out.println("testcase2");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This will execute before every method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("this will execute aftr every method");
	}@BeforeClass
	public void beforeclass() {
		System.out.println("this will execute before the class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("this will execute after the class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("this will execute befire test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("this will execute after test");
		
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("this will execute before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("this will execute after test");
	}

}
