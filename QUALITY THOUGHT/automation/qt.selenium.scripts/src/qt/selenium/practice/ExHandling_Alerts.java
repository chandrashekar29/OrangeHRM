package qt.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExHandling_Alerts {
	
	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	
	
	public void Launch_Application() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		}
	public void Login() throws InterruptedException 
	{
		WebElement user=driver.findElement(username);
		user.sendKeys("");
		WebElement pass=driver.findElement(password);
		pass.sendKeys("");
		Thread.sleep(2000);
	driver.findElement(By.id("btnLogin")).click();
	
	}
	public void ExAlert() {
		Alert alert= driver.switchTo().alert();
		String Expmsg=alert.getText();
		System.out.println(Expmsg);
	}

	public static void main(String[] args) throws InterruptedException {
		ExHandling_Alerts obj = new ExHandling_Alerts();
		obj.Launch_Application();
		obj.Login();
		obj.ExAlert();
		
		

	}

}
