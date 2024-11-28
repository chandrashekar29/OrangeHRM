package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	WebDriver driver;
	public void LaunchBrowser() throws InterruptedException {
		String BrowserName="chrome";
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(BrowserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}
		Thread.sleep(2000);
	}
	public void LaunchAUT() {
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		}
	public void closeBrowser() {
			driver.quit();
		}
	public void login(String username,String password) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("username");

Thread.sleep(2000);		
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		
		
	}
	
	

}
