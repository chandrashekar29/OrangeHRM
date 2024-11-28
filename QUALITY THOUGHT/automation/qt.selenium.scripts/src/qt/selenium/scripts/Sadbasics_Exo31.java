package qt.selenium.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sadbasics_Exo31 {
	WebDriver driver;
	public void LaunchAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	public void Explicit()  {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Tops']")));

		we.click();
	}

	public static void main(String[] args) {
		Sadbasics_Exo31 obj= new Sadbasics_Exo31();
		obj.LaunchAUT();
		obj.Explicit();
	}

}
