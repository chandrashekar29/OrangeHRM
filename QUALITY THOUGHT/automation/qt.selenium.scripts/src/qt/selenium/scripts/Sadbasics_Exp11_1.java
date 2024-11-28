package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sadbasics_Exp11_1 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String s=driver.getTitle();
	System.out.println(s);
	
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("i phone 16 pro");
		Thread.sleep(2000);
		//driver.findElement(null)
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp11_1 obj= new Sadbasics_Exp11_1();
		obj.LaunchAUT();
		obj.Senddata();
		

	}

}
