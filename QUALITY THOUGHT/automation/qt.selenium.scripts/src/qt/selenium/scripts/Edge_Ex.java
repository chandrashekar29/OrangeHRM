package qt.selenium.scripts;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Ex {
	public void LaunchAUTinEdge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\QUALITY THOUGHT\\DRIVERS\\edgedriver_win64 (1)\\msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	String title=driver.getTitle();
	System.out.println(title);
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	//driver.quit();
	//driver.navigate().refresh();
	//driver.navigate().forward();
	//driver.navigate().back();
	}

	public static void main(String[] args) {
		Edge_Ex obj=new Edge_Ex();
		obj.LaunchAUTinEdge();
		
		

	}

}
