package qt.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sadbasics_Exp17 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
	String[] browser= {"Chrome","Edge"};
	for(String browsers : browser) {
		if(browsers.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
		else if(browsers.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		}
		else if(browsers.equalsIgnoreCase("fire")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			
		
			
		}
		else {
			System.out.println("Browser not found");
		
		
		}
	}
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp17 obj = new Sadbasics_Exp17();
		obj.LaunchAUT();
		

	}

}
