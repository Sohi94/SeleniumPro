package lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebPage {

	public static void main(String[] args) throws InterruptedException {
		

			WebDriver driver = new ChromeDriver(); 
			String url = "https://www.target.com/"; 
			driver.get(url);
//		    driver.navigate().refresh();
			
		   //zipCode-2
		    driver.findElement(By.xpath("//span[text()=\"08872\"] ")).click();
		    //Thread.sleep(3000);
		    WebElement zipCode = driver.findElement(By.xpath("//input[@name= 'zip-code'] "));
		    zipCode.clear();
		    zipCode.sendKeys("06678");
		    //Thread.sleep(3000);
		    //driver.findElement(By.xpath("//span[text()="Sign in"] ")).click();
		   
		    Thread.sleep(3000);
		   //findStore-4
		    driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		    driver.findElement(By.xpath("//span[@data-icon-name=\"GeneralTrackLocation\"] //following:: button ")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='1055']")).click();
		    driver.findElement(By.xpath("//button[text()='Shop this store']")).click();
		    Thread.sleep(3000);
		    
		    //Sign in
		    driver.findElement(By.xpath("//span[text()=\"Sign in\"] ")).click();

		    //driver.findElement(By.xpath(" ")).click();

		    
		    
		    driver.quit();
			//WebElement password = driver.findElement(By.id(//button[text()='Shop this store']));

			//WebElement login = driver.findElement(By.id("user_submit"));

			
//			System.out.println("Signed in with Click");
//			Thread.sleep(5000);
//			driver.close();
	}

		
	

}
