package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_salesforce {
	WebDriver driver;
	
	public void launch_Aut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
	}
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("shekarvangari26@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Ts29b1401@");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		
	}
	public void Setup() throws InterruptedException {
		driver.findElement(By.id("setupLink")).click();
		Thread.sleep(2000);
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable notifications");
		driver= new ChromeDriver(op);
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Login_salesforce obj = new Login_salesforce();
		obj.launch_Aut();
		obj.login();
		obj.Setup();
		
		

	}

}
