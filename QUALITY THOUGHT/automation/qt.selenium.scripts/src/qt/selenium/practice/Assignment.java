package qt.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment {
	
	
	
	JavascriptExecutor js;
	Actions act;
	WebDriver driver;
	public void lunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://fitpeo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}
	public void click() {
		driver.findElement(By.linkText("Revenue Calculator")).click();
	}
	public void scroll() {
		js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1eynrej']/p[text()='CPT-99091']//..//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd inter css-1ml0yeg']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
/*public void enterText() {
	Actions act=new Actions(driver);
	act.dragAndDropBy(null, 0, 0);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("820");
	}
	public void slider() {
		 act=new Actions(driver);
		 WebElement e1=driver.findElement(By.xpath("//input[@type='range']"));
		 System.out.println("its working:"+e1.getLocation());
		 act.clickAndHold(e1).moveByOffset(55,0).release().build().perform();
		 
		 
		 
		 
		 
		 
		
	}
public void slider() {
WebElement priceSlider = driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']"));
		   
Actions builder = new Actions(driver);   
builder.moveToElement(priceSlider)
	   .click()
	   .dragAndDropBy
	     (priceSlider, -26, 0)
	   .build()
	   .perform();
}*/
	
void cptValue1() {
	//js=(JavascriptExecutor)driver;
	WebElement ele1=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1eynrej']/p[text()='CPT-99091']//..//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd inter css-1ml0yeg']"));
	js.executeScript("arguments[0].scrollIntoView(true);", ele1);
	//js.executeScript("window.scrollTo(30,document.body.scrollHeight)");
	WebElement el=driver.findElement(By.xpath("/div[@class='MuiBox-root css-1eynrej']/p[text()='CPT-99091']//..//input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
	el.click();
}


/*void cptValue2() {
	try {
		//js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//p[text()='CPT-99453']"));
		System.out.println("========:"+ele.getText());
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebElement el2=driver.findElement(By.xpath("//span[text()='19.19']/ancestor::span"));
		System.out.println("*: "+el2.getText());
		
		el2.click();
		System.out.println("veda");
	}catch(Exception ex) {
		ex.printStackTrace();
	}catch(Error ex) {
		ex.printStackTrace();
	}
}*/

	public void exit() {
		driver.quit();
	}
		
		public static void main(String[] args) throws InterruptedException {
			Assignment t=new Assignment();
			Thread.sleep(2000);
			t.lunch();
			Thread.sleep(2000);
			t.click();
			Thread.sleep(2000);
			//t.scroll();
			//Thread.sleep(2000);
			//t.slider();
			//Thread.sleep(2000);
			//t.enterText();
			Thread.sleep(2000);
			t.cptValue1();
			Thread.sleep(2000);
			//t.cptValue2();
			
			
			Thread.sleep(1000);
			t.exit();
			
	}
		
		
		


}
