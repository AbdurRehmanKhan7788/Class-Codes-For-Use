package Pro.Training.Tech.STUDENTS;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
public class Setupbrowser {
	WebDriver driver;
@BeforeMethod
public void beforeMethod() throws InterruptedException {
	  browsers("chrome");
	
		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(10000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		screenshots();
}


	
  private void screenshots() {
	// TODO Auto-generated method stub
	
}



@Test
	  public void browsers(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");	 
		  	
		 
		  driver = new ChromeDriver();  }
		  else if (browser.equalsIgnoreCase("edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\msedgedriver.exe");
		  driver=new EdgeDriver();}
	  
  }
  
  

 

}
