package qt.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDeleteBtnStatuszIFNoCheckBoxIsSelected {
	
	WebDriver driver;
	

		
		public void LaunchAut() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("chandu");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("chandu");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}
	public void ChkBox() {
		
		
		List<WebElement>chkboxes=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
		boolean status=false;
		for(WebElement checkBox:chkboxes) {
			boolean chkstatus=checkBox.isSelected();
			if(chkstatus) {
				status=true;
			}
		}
		if(!status) {
			System.out.println("CheckBox is not selected->Test Pass");
			
			boolean deleteBTNstatus= driver.findElement(By.id("btnDelete")).isEnabled();
			
			if (!deleteBTNstatus) {
				System.out.println("Button is Disabled->Test pass");
			}else 
			{
				System.out.println("Button is Enabled->Test fail");
				
			}
		}
			else {
				System.out.println("Check box is selected->Test fail");
			}
		}
	public static void main (String []args) throws InterruptedException {
		VerifyDeleteBtnStatuszIFNoCheckBoxIsSelected obj = new VerifyDeleteBtnStatuszIFNoCheckBoxIsSelected();
		obj.LaunchAut();
		obj.ChkBox();
		
	}
		
		
		
		

	}


