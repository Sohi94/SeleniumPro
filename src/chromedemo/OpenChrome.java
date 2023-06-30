package chromedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	//	String url = "https://www.selenium.dev/downloads/";
		String url2 = "https://www.google.com/";
		
		// set the system property(key=value)
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
		
		//create a webDriver object:
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		// open the webSite
		driver.get(url2);
		
			
		
	
	}

}
