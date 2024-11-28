package qt.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pramod_amazon {
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.google.com/");
		
		
		
		
	}

}
