package qt.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sadbasics_Exp28 {
	
		WebDriver driver;
		Actions actobj;
		public void LaunchAUT() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");

			driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}
		public void Double_Click()
		{
			driver.switchTo().frame("iframeResult");
			actobj=new Actions(driver);
			WebElement we=driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
			actobj.doubleClick(we).perform();
			String s=we.getText();
			System.out.println(s);
			String text=driver.findElement(By.xpath("//p[text()='Hello World ']")).getText();
			System.out.println(text);
		}
			public static void main(String[] args) throws InterruptedException {
				Sadbasics_Exp28 obj=new Sadbasics_Exp28();
				obj.LaunchAUT();
				obj.Double_Click();

			}

		


	
}
