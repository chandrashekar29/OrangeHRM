package qt.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp35 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public void Refresh() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go();");
		Thread.sleep(3000);
		jse.executeScript("alert('Welcome to Amazon Mr shekar')");

	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp35 obj = new Sadbasics_Exp35();
		obj.LaunchAUT();
		obj.Refresh();

	}

}
