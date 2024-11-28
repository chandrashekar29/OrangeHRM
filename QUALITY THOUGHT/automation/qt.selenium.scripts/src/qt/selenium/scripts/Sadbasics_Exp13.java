package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp13 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
		
	}
	public void senddata(String username,String Password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException { 
		Sadbasics_Exp13 obj = new Sadbasics_Exp13();
		obj.LaunchAUT();
		obj.senddata("shekarvangari26", "9573949105");

	}

}
