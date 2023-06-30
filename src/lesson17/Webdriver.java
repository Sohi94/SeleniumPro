package lesson17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver {

	public static void main(String[] args) {
    String url2 = "https://www.geeksforgeeks.org/";
    
		
		 
			WebDriver driver= null;
		if(url2== "https://www.google.com/") {
			driver= new ChromeDriver();
			System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
			driver.get(url2);
		}else if(url2=="https://www.geeksforgeeks.org/") {
			driver= new EdgeDriver();
			 System.setProperty(
	 		            "webdriver.edge.driver",
	 		 
					 "C:\\WebDriver\\msedgedriver.exe");
			 
		    String title= driver.getTitle();
			System.out.println(title);
			 driver.get(url2);
			
		}
		
	}
}
