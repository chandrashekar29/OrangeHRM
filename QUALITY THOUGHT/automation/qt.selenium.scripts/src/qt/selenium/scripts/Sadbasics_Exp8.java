package qt.selenium.scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp8 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		//create the object for scanner
		Scanner s= new Scanner(System.in);
		System.out.println("please enter expected url");
		String url =s.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp8 obj=new Sadbasics_Exp8();
		obj.LaunchAUT();
		

	}

}
