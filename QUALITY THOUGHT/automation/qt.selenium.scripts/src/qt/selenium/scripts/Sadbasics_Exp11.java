package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp11 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 16 pro");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}
	public void CloseAUT() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp11 obj = new Sadbasics_Exp11();
		obj.LaunchAUT();	
		obj.Senddata();
		obj.CloseAUT();
		

	}

}
