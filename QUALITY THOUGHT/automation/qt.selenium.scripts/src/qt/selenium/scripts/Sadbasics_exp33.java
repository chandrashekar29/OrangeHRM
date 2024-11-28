package qt.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_exp33 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	
	}
	public void Scroll() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,document,body,scrollHeight);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(documnet,body,scrollHeight,100);");
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_exp33 obj = new Sadbasics_exp33();
		obj.LaunchAUT();
		obj.Scroll();

	}

}
