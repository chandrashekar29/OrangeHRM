package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_22 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("9573949105");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("Ts29b1401@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[name=login]")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_22 obj = new Sadbasics_22();
		obj.LaunchAUT();
		obj.Senddata();

	}

}
