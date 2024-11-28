package qt.selenium.scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp9 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter expected url");
		int count =s.nextInt();
		for(int i=0;i<count;i++) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		}
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp9 obj= new Sadbasics_Exp9();
		obj.LaunchAUT();
		
		

	}

}
