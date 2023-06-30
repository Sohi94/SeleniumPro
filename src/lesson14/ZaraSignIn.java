package lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZaraSignIn {
    
	public static void main(String[] args) throws InterruptedException{

		String url2 = "https://www.zara.com/";
		
		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url2);
		
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		driver.navigate().refresh();

		
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div[2]/form/button/div")).click();
		driver.navigate().refresh();
	   // Thread.sleep(6000);
		//driver.close();
		
		driver.findElement(By.xpath("//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")).click();
		
		WebElement email = driver.findElement(By.xpath("/html/body"));
		
		//WebElement email = driver.findElement(By.id("logonId"));
		 email.sendKeys("SOKHIBA");
		 
		// WebElement password = driver.findElement(By.id("Password"));
		// password.sendKeys("12345s");

		//driver.findElement(By.xpath("//*[@id=\"main\"]/article/div/div[2]/div[1]/section/form/div[1]/div[1]/div/div/div/input")).sendKeys("SOHIBA");

		Thread.sleep(6000);
		driver.navigate().back();
	
	}

}
