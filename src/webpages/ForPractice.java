package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		String url = "https://www.target.com/"; 
		driver.get(url);
		
		//to perform Scroll on application using Selenium
        
     
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
	    
	     //driver.navigate().refresh();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	        //js.executeScript("window.scrollBy(0,-350)", "");
	     //driver.findElement.click();
	        WebElement Element = driver.findElement(By.xpath("//a[starts-with(@aria-label,'23')]"));
	        // Scrolling down the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        
	   
		
		//Sign in

		//driver.findElement(By.partialLinkText("Sign in")).click();
	    //driver.findElement(By.linkText(""23" Wood Burning Fire Pit with Spark Screen - Room Essentials™")).click();
	    //Thread.sleep(2000);
	    // driver.findElement(By.xpath("//a[contains(@aria-label,'Faux Mantel and Stamped Steel Base')]//parent::div")).click();

		 
		 //driver.findElement(By.xpath("//button[contains(@aria-label,'Sort:')]")).click();
		 //driver.findElement(By.xpath("//input[@id='bestselling-best seller']")).click();

		 //driver.findElement(By.id("favorites-button-:rm0:")).click();

	     //driver.findElement(By.xpath("//a[contains(@aria-label,'Faux Mantel and Stamped Steel Base')]//parent::div")).click();

		
		//driver.findElement(By.xpath("//input[@name=\"usernamecreateaccount\"]//parent::div")).click();
	   //a[@data-id="5xtq9"]//child::div//child::span
		//driver.navigate().back();
		//driver.navigate().refresh();
	     
		  //driver.findElement(By.name("firstnamecreateaccount")).click();
		  //sendKeys("Sohiba");
	    //WebElement email = driver.findElement(By.xpath("//input[@name=\"usernamecreateaccount\"]//parent::div"));
		//email.sendKeys("Sohiba");
		
	
	}

	

}
