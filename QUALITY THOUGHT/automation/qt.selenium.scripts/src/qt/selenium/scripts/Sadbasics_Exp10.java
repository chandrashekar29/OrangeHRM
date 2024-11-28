package qt.selenium.scripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sadbasics_Exp10 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		Scanner s = new Scanner(System.in);
		System.out.println("please enter expected URL");
		String url= s.nextLine();
		System.out.println("please enter expected title");
		String  exp_title=s.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	String act_title= driver.getTitle();
	System.out.println(act_title);
	if(act_title.equalsIgnoreCase(exp_title)) {
		System.out.println("Both are same");
	}
	else {
		System.out.println("Both are not same");
	}
	Thread.sleep(2000);
	driver.close();
	}
   
	public static void main(String[] args) throws InterruptedException {
		Sadbasics_Exp10 obj = new Sadbasics_Exp10();
		obj. LaunchAUT();
		

	}

}
