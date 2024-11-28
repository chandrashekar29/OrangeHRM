package qt.selenium.scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sadbasics_Exp19 {
	WebDriver driver;
	public void LaunchAut() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
		
	driver= new EdgeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("shekarchandra521@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("957394915");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		
	}
	public void Screenshot() throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\screenshots.jpg");
		FileHandler.copy(src, des);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sadbasics_Exp19 obj = new Sadbasics_Exp19();
		obj.LaunchAut();
		obj.Senddata();
		obj.Screenshot();
		
	}

}
