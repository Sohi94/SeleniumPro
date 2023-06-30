package newedge;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
	public class OpenEdge{
		
	   public static void main(String[] args) {
	      //configure path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
		            "C:\\WebDriver\\msedgedriver.exe");
	      //object of EdgeDriver
	      WebDriver driver = new EdgeDriver();
	      //URL launch
	      driver.get("https://www.yahoo.com/");
	      
	}

}
