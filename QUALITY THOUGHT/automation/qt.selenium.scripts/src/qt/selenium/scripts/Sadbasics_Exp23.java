package qt.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sadbasics_Exp23 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void HandleFrame() throws InterruptedException {
		// Switch to frame
		driver.switchTo().frame("iframeResult");
		WebElement we = driver.findElement(By.id("Cars"));
		// Create the obj for select
		Select slcobj = new Select(we);
		if(slcobj.isMultiple()) {
			slcobj.selectByVisibleText("Audi");
			Thread.sleep(2000);
			slcobj.selectByValue("Volvo");
			Thread.sleep(3000);
			List<WebElement>alloptions= slcobj.getAllSelectedOptions();
			for(int i=0;i<alloptions.size();i++) {
				String data= alloptions.get(i).getText();
				System.out.println(data);
			}
			slcobj.deselectByVisibleText("Audi");
			Thread.sleep(3000);
			slcobj.deselectAll();
			
			
		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp23 obj = new Sadbasics_Exp23();
		obj.LaunchAUT();
		obj.HandleFrame();
		obj.HandleFrame();

	}

}
