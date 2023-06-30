import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://www.letskodeit.com/practice";  
	    System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");    
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get(url);
	    
	    // now do some actions on the elements/objects of the website
	    WebElement bmwRadBtn = driver.findElement(By.id("bmwradio"));
	    bmwRadBtn.click();
	    driver.findElement(By.id("hondacheck")).click();
	}

}
