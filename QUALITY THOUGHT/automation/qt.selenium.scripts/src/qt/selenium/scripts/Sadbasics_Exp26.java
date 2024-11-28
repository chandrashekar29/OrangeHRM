package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasics_Exp26 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	Thread.sleep(2000);
		//driver.findElement(By.id("//span[text()='Login']")).click();
		//Thread.sleep(2000);
		
		
	}
	
	public void Handlepop() throws InterruptedException {
		//Handle the popoup
		actobj= new Actions(driver);
		//actobj.sendKeys(Keys.ESCAPE).perform();
		//Thread.sleep(2000);
		WebElement we = driver.findElement(By.name("q"));
		actobj.sendKeys(we,"shoes for men").perform();
		Thread.sleep(2000);
		actobj.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Sadbasics_Exp26 obj = new Sadbasics_Exp26();
		obj.LaunchAUT();
		obj.Handlepop();
	}

}
