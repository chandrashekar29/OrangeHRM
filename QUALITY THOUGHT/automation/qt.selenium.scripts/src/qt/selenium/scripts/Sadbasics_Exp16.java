package qt.selenium.scripts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sadbasics_Exp16 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter expected browser name");
		String url =s.nextLine();
		if(url.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(url.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Browser not found");
		}
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 15 pro");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp16 obj = new Sadbasics_Exp16();
		obj.LaunchAUT();
		obj.Senddata();
	

	}

}
