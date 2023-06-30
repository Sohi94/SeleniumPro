package wrapper_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://finance.yahoo.com/");
	    
	}

}
