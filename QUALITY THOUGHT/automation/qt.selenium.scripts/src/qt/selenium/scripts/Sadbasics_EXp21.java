package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sadbasics_EXp21 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.findElement(By.id("signup_link")).click();
		
	}
	public void senddata() throws InterruptedException {
		driver.findElement(By.name("UserFirstName")).sendKeys("Karthik");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("shekar");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("shekarvangari26@gmail.com");
		Thread.sleep(2000);
	}
	public void Drop_down() throws InterruptedException   {
		WebElement Job_title= driver.findElement(By.name("UserTitle"));
		Select slcobj= new Select(Job_title);
		slcobj.selectByVisibleText("Marketing / PR Manager");
		Thread.sleep(2000);
		slcobj.selectByIndex(5);
		Thread.sleep(2000);
		slcobj.selectByValue("IT_Manager_AP");
		Thread.sleep(2000);
		
	}
	public void Cmpny() throws InterruptedException {
		driver.findElement(By.name("CompanyName")).sendKeys("Cloud");
		Thread.sleep(2000);
		WebElement company= driver.findElement(By.name("CompanyEmployees"));
		Select slcobj= new Select(company);
		//select the the Expected element from the dropdown
		slcobj.selectByVisibleText("1 - 25 employees");
		Thread.sleep(2000);
		slcobj.selectByValue("150");
		Thread.sleep(2000);
		slcobj.selectByIndex(4);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_EXp21 obj = new Sadbasics_EXp21();
		obj.LaunchAUT();
		obj.senddata();
		obj.Drop_down();
		obj.Cmpny();
		
	

	}

}
