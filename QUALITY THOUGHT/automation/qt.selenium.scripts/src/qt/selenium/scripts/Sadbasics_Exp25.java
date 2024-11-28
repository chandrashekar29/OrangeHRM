package qt.selenium.scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp25 {
	WebDriver driver;
public void LaunchAUT() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 pro ");
Thread.sleep(2000);
driver.findElement(By.id("nav-search-submit-button")).click();
}

public void Multiwindow() throws InterruptedException {
	String P_win= driver.getWindowHandle();
	driver.findElement(By.xpath("//span[text()=Apple iPhone 15 Pro (128 GB) - Black Titanium ")).click();
	Set<String>allwindows=driver.getWindowHandles();
	for(String handle:allwindows) {
		if(!handle.equalsIgnoreCase(P_win)) {
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='email']")).clear();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		}
	}
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp25 obj=new Sadbasics_Exp25();
		obj.LaunchAUT();
		obj.Multiwindow();

			}
	
}
	

