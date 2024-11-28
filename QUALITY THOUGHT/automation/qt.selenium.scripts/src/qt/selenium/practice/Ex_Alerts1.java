package qt.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Alerts1 {
	
	WebDriver driver;
	
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}
	public void ok() {
		WebElement we=driver.findElement(By.linkText("Reset"));
		we.click();
		driver.switchTo().alert().accept();
	}
	public void cancel() {
		WebElement we1=driver.findElement(By.linkText("Reset"));
		we1.click();
		driver.switchTo().alert().dismiss();
	}
	public void sendalert_data() throws InterruptedException {
driver.findElement(By.linkText("Reset")).click();
		
		driver.switchTo().alert().sendKeys("shekar@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	public void textget() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		String text= driver.switchTo().alert().getText();
		Thread.sleep(2000);
		System.out.println(text);
	}

	public static void main(String[] args) throws InterruptedException {
		Ex_Alerts1 obj= new Ex_Alerts1();
		obj.LaunchAUT();
		obj.ok();
		obj.cancel();
		obj.sendalert_data();
		obj.textget();
		

	}

}
