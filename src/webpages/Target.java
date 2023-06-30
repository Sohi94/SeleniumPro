package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) throws InterruptedException {
		

			WebDriver driver = new ChromeDriver(); 
			String url = "https://www.target.com/"; 
			driver.get(url);
//		    driver.navigate().refresh();
//			Thread.sleep(5000);
//			driver.close();
			
		   //zipCode-2
		    driver.findElement(By.xpath("//span[text()='08872'] ")).click();
		    //Thread.sleep(3000);
		    WebElement zipCode = driver.findElement(By.xpath("//input[@name= 'zip-code'] "));
		    zipCode.clear();
		    zipCode.sendKeys("06678");
		    //Thread.sleep(3000);
		    //driver.findElement(By.xpath("//span[text()="Sign in"] ")).click();
		   
		    Thread.sleep(1000);
		   //findStore-4
		    driver.findElement(By.xpath("//button[@aria-label='close']")).click();
		    driver.findElement(By.xpath("//span[@data-icon-name=\"GeneralTrackLocation\"] //following:: button ")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='1055']")).click();
		    driver.findElement(By.xpath("//button[text()='Shop this store']")).click();
		    Thread.sleep(1000);
		    
//Categories:Outdoor-fire pits-6
			 driver.findElement(By.xpath("//span[@data-icon-name=\"NavigationHamburgerFill\"]//parent::a")).click();
			 Thread.sleep(1000);
		     driver.findElement(By.xpath("//h2[text()='Categories']//parent::span//parent::div//parent::button")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.linkText("Outdoor Living & Garden")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.linkText("Fire Pits & Outdoor Heaters")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[text()='Fire Pits']")).click();
			 Thread.sleep(1000);
		     driver.findElement(By.xpath("//span[text()='Gas fire pits']//parent::div")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//span[text()='Wood burning fire pits']")).click();
		   
		     

		     
		     // driver.findElement(By.xpath("//a[contains(@aria-label,'Faux Mantel and Stamped Steel Base')]//parent::div")).click();

		    //driver.findElement(By.xpath("//input[@name="usernamecreateaccount"] ")).click();

		    
		    
		    //driver.quit();
			//WebElement password = driver.findElement(By.id());
   

		    //Sign in-2
		   // driver.findElement(By.xpath("//span[text()=\"Sign in\"] ")).click();
		   //driver.findElement(By.xpath("//span[text()='Create Account'] ")).click();
	}

		
	

}
