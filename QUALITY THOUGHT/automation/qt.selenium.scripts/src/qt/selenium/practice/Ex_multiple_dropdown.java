package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_multiple_dropdown {
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
	public void Admin() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_workShift")).click();
		driver.findElement(By.id("btnAdd")).click();
		
	}
	public void Multi_dropdown() {
		Select multi_dd = new Select(driver.findElement(By.id("workShift_availableEmp")));
		multi_dd.selectByVisibleText("v chandra shekar");
		multi_dd.selectByIndex(9);
		multi_dd.selectByValue("12");
		multi_dd.selectByValue("8");
		boolean s=multi_dd.isMultiple();
		System.out.println(s);
		
		
	}
	public void Add_emp() {
		driver.findElement(By.id("btnAssignEmployee")).click();
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Ex_multiple_dropdown obj = new Ex_multiple_dropdown();
		obj.LaunchAUT();
		obj.login();
		obj.Admin();
		obj.Multi_dropdown();
		obj.Add_emp();
		
		

	}

}
