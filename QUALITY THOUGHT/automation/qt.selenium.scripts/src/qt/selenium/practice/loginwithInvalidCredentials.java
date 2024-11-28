package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithInvalidCredentials {
	
	WebDriver driver;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
				}
	public void login() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("kkk");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	}
	public void Errormsg() {
		String actualMsg= driver.findElement(By.id("spanMessage")).getText();
		String ExpectedMsg="Invalid credentials";
				
		if(actualMsg.equalsIgnoreCase(ExpectedMsg)) {
			System.out.println("Test pass");
			
		}else {
			System.out.println("test fail");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		loginwithInvalidCredentials obj = new loginwithInvalidCredentials();
		obj.LaunchAUT();
		obj.login();
		obj.Errormsg();

	}

}
