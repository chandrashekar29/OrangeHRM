package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasics_Exp27 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
public void Drag() throws InterruptedException {
	driver.switchTo().frame(0);
	actobj= new Actions(driver);
	driver.findElement(By.xpath("//a[text()='Droppable']"));
	WebElement drag= driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Thread.sleep(2000);
	actobj.dragAndDrop(drag, drop).perform();
	
}
public void Count_frame()
{
	int count=driver.findElements(By.tagName("iframe")).size();
	System.out.println("The number of frames is:"+count);
}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp27 obj = new Sadbasics_Exp27();
		obj.LaunchAUT();
		obj.Drag();
		obj.Count_frame();

	}

}
