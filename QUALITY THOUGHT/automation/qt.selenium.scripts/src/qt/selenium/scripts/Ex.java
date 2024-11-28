package qt.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex {
	WebDriver driver;
	
	public void launch() {
		
		System.setProperty("https://login.salesforce.com/?locale=in", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\geckodriver-v0.35.0-win-aarch64\\geckodriver.exe");
		
		driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
	}
	public static void main(String[] args) {
		Ex obj = new Ex();
		obj.launch();
	}
}
