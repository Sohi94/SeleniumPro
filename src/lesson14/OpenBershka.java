package lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBershka {

	public static void main(String[] args) throws InterruptedException{
		
			String url2 = "https://www.bershka.com/";
			System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
			
			//create a webDriver object:
			WebDriver driver = new ChromeDriver();
			driver.get(url2);
			//driver.findElement(By.xpath("//*[@id=\"country-list-controls\"]/div[1]/button/span[1]"))
			//.sendKeys("United States");
			//driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
			driver.findElement(By.id("onetrust-close-btn-container")).click();
			
			driver.navigate().refresh();
			driver.findElement(By.id("\"en\"")).click();

			driver.findElement(By.id("\"worldwide-cta-container\"")).click();
		 
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[2]/div[2]/div[3]/button")).click();

			driver.navigate().refresh();
			

			//Get the Web Element corresponding to the Password Field 
			//WebElement password = driver.findElement(By.id("user_password"));

			//Find the Sign me in button
			//WebElement login = driver.findElement(By.id("user_submit"));
			//password.sendKeys("abcdef12345");

			;
			Thread.sleep(5000);
			driver.close();
		   
			
			
			
	}

}
