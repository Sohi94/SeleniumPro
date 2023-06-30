package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zara {

	public static void main(String[] args) throws InterruptedException {

		String url2 = "https://www.zara.com/";

		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url2);

		driver.navigate().refresh();
//close buttons--2
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@class='zds-button store-selector__button zds-button--primary']")).click();
		 Thread.sleep(1000);
		//log in--4
		driver.findElement(By.partialLinkText("LOG IN")).click();
		driver.navigate().refresh();

		WebElement email = driver.findElement(By.name("logonId"));
		email.sendKeys("sohi@gmail.com");
		WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345678");
		driver.findElement(By.className("form-input-password__eye-icon")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		//search--12
		driver.navigate().refresh();

		 driver.findElement(By.xpath("//a[@class='layout-header-search-link__link']")).click();
		 Thread.sleep(1000);
		 WebElement search=driver.findElement(By.className("search-products-form__input"));
		 search.sendKeys("bags");
		 Thread.sleep(1000);

		 driver.findElement(By.xpath("//button[@class='filters__button']//child::span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("zds-39")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"zds-38\"]/fieldset/div[5]/div/label/span")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("zds-122")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Black']")).click();
		 driver.findElement(By.xpath("//span[text()='Beige']")).click();
		 Thread.sleep(1000);

		 driver.findElement(By.className("filters-panel__buttons-results")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("METAL TRIM CROSSBODY BAG")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@aria-label='Add to cart METAL TRIM CROSSBODY BAG']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("GO TO HOMEPAGE")).click();
		

		 //css selector-5-8
		 driver.navigate().refresh();

		 driver.findElement(By.cssSelector("button[aria-label='Open Menu']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("li[class$='layout-categories-category--is-highlighted layout-categories-category--level-1']")).click();

		 driver.findElement(By.cssSelector("a[aria-label='HOME, Show other categories']")).click();
		 Thread.sleep(1000);

		 driver.findElement(By.linkText("LIVING ROOM | DECO")).click();
		 driver.findElement(By.xpath("//li[@data-seocategoryid='2121']//child::a//child::span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("img[alt='Image 0 of SMOKY GLASS LAMP BASE from Zara']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button[aria-label='Add to cart SMOKY GLASS LAMP BASE']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("GO TO HOMEPAGE")).click();
	
		// Thread.sleep(6000);
		//driver.navigate().back();

	} 

}
