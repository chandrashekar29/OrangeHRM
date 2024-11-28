package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAddemployee {
	
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}
	public void login() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
	}
	public void AddEmployee() throws InterruptedException {
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("k");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("vishu");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		
	}
	public void Logout() throws InterruptedException {
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		ExAddemployee obj = new ExAddemployee();
		obj.LaunchAUT();
		obj.login();
		obj.AddEmployee();
		

	}

}
