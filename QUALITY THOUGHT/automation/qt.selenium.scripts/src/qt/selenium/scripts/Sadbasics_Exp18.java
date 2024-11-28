package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sadbasics_Exp18 {
	WebDriver driver;
	String brow1= "Chrome";
	String brow2="Edge";
	
	public void LaunchAUT() throws InterruptedException {
		if(brow1.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("signup_link")).click();
			
		}
		if(brow2.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 pro");
			Thread.sleep(2000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			
			
		}
		else{
			System.out.println("browser not found");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp18 obj = new Sadbasics_Exp18();
		obj.LaunchAUT();

	}

}
