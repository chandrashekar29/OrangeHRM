package qt.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExFetchWebTableData {
	WebDriver driver;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
				}
	public void login() throws InterruptedException  {
		driver.findElement(By.id("txtUsername")).sendKeys("chandu");
		driver.findElement(By.id("txtPassword")).sendKeys("chandu");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}
	public void WebTable() {
		List<WebElement>cellvalues= driver.findElements(By.xpath("//table[@id='resultTable']/tody/tr/td"));
		for(int i=0;i<cellvalues.size();i++) {
			System.out.println(cellvalues.get(i).getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ExFetchWebTableData obj = new ExFetchWebTableData();
		obj.LaunchAUT();
		obj.login();
		obj.WebTable();
		

	}

}
