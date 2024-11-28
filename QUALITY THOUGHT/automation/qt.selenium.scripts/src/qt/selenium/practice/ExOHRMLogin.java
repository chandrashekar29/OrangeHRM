package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOHRMLogin {
	
	WebDriver driver;
	public void OhrmLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
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
	public void logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
		//driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		ExOHRMLogin obj= new ExOHRMLogin();
		obj.OhrmLogin();
		obj.login();
		obj.logout();

	}

}
