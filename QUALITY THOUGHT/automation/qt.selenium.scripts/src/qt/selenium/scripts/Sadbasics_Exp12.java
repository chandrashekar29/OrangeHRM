package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sadbasics_Exp12 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
	driver= new EdgeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	}
	
	public void Login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("shekarchandra521@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("shekar@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
public void closeAUT() {
	driver.close();
}
	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp12 obj= new Sadbasics_Exp12();
		obj.LaunchAUT();
		obj.Login();
		obj.closeAUT();
		

	}

}
