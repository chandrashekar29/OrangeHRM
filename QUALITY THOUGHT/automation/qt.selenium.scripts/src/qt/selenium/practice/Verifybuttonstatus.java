package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifybuttonstatus {
	
	WebDriver driver;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
				}
	public void login() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	}
	public void Deletebtn() {
		boolean deletebtnstatus= driver.findElement(By.id("btnDelete")).isEnabled();
		if (deletebtnstatus) {
			System.out.println(" button is enabled");
		}
		else
			System.out.println("button is not enabled");
	}

	public static void main(String[] args) throws InterruptedException {
		Verifybuttonstatus obj = new Verifybuttonstatus();
		obj.LaunchAUT();
		obj.login();
		obj.Deletebtn();
		
 
	}

}
