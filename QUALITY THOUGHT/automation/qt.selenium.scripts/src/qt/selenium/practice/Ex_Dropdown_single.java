package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_Dropdown_single {
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
	public void Dropdown() {
		Select job_title=new Select(driver.findElement(By.id("empsearch_termination")));
		//job_title.selectByVisibleText("Past Employees Only");
		job_title.selectByIndex(1);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Ex_Dropdown_single obj = new Ex_Dropdown_single();
		obj.LaunchAUT();
		obj.login();
		obj.Dropdown();
		

	}

}
