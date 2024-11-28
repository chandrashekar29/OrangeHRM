package qt.selenium.scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Ex {
	
	public void LaunchinChrome() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();	
       driver.get("https://www.amazon.in");
       Thread.sleep(2000);
       driver.manage().window().maximize();
       Thread.sleep(3000);
      String Title= driver.getTitle();
      System.out.println(Title);
      String URL=driver.getCurrentUrl();
      
      
      if(URL.equalsIgnoreCase("https://www.amazon.in/")) {
    	  
    	  System.out.println("Both are same");
    	  
    	
      }
      else {
    	  System.out.println("Both are not same");
      }
      String data= driver.getPageSource();
      System.out.println(data);
      Thread.sleep(3000);
      driver.navigate().refresh();
      Thread.sleep(3000);
      driver.navigate().back();
      Thread.sleep(3000);
      driver.navigate().forward();
      Thread.sleep(3000);
       driver.close();
       driver.getWindowHandle();
	}

	public static void main(String[] args) throws InterruptedException {
		Chrome_Ex obj= new Chrome_Ex();
		obj.LaunchinChrome();
		
		

	}

}
