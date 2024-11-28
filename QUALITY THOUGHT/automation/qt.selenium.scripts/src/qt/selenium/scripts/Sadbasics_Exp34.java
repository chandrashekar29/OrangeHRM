package qt.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp34 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	public void Click_Expected() {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		WebElement exp=driver.findElement(By.xpath("img[@alt='Tops']"));
		jse.executeScript("arguments[0].click();", exp);
		
	}
	

	public static void main(String[] args) {
		Sadbasics_Exp34 obj = new Sadbasics_Exp34();
		obj.LaunchAUT();
		obj.Click_Expected();

	}

}
