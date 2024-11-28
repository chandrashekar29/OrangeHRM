package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasics_Exp14 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 pro");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp14 obj = new Sadbasics_Exp14();
		obj.LaunchAUT();
		obj.Senddata();
		
	
	}

}
