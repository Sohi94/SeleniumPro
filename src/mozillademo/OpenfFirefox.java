package mozillademo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenfFirefox {

	
		/*		
		// set the system property(key=value)
		System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");
		
		//create a webDriver object:
		WebDriver driver = new FirefoxDriver();
		
		// open the webSite
    driver.get("https://www.geeksforgeeks.org/");
		
		*/
		
			  
		    
		    public static void main(String[] args) throws InterruptedException {
		      String url = "https://www.letskodeit.com/practice";
		      String urlGoo = "https://www.mozilla.org/en-US/firefox/new/?redirect_source=firefox-com";
		      // setting a system property 
		      
		      System.setProperty("webdriver.gecko.driver " , " C:\\WebDriver\\geckodriver.exe ");
		      //creating a webdriver object 
		      WebDriver driver = new FirefoxDriver();
		      //opening a website;
		      driver.manage().window().maximize(); // max
		      driver.get(url);
		      driver.findElement(By.id("hondacheck")).click();
		      Thread.sleep(3000);
		      driver.close();
		 
		

   
	}

}
