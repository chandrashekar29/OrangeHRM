package qt.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp32 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	public void Senddata() throws InterruptedException {
		jse = (JavascriptExecutor)driver;
		WebElement we = driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].value='shekarchandra521@gmail.com';", we);
		Thread.sleep(2000);
		WebElement pass= driver.findElement(By.id("password"));
      jse.executeScript("arguments[0].value='shekar123';", pass);	
  	//jse.executeScript("arguments[0].value='akhilchandra@gmail.com';", pass);
  	Thread.sleep(2000);
  	WebElement login=driver.findElement(By.id("Login"));
  	jse.executeScript("arguments[0].click();", login);
	}

	

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp32 obj = new Sadbasics_Exp32();
		obj.LaunchAUT();
		obj.Senddata();
	}

}
