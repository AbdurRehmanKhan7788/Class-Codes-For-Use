package Common;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Reuseable {
	public WebDriver driver;	  
  @BeforeMethod
  @Parameters ({"browsers"})
  
  
  public void beforeMethod(String browser) throws InterruptedException {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");	  
	  driver = new ChromeDriver(); 
	  driver.get("https://www.amazon.com");
	  Thread.sleep(6000);
	  driver.manage().window().maximize();
	  } else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  driver.get("https://www.amazon.com");
	  Thread.sleep(6000);
	  driver.manage().window().maximize();	  
	  } else if (browser.equalsIgnoreCase("firefox"))  {
		  System.setProperty("Webdriver.firefox.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\geckodriver.exe");
		  
		  
	  }
  }


  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
	  } 
  public void screenshots() throws IOException   {
		 

		Date dt=new Date();
		String jk=dt.toString().replace(" ","_").replace(":","_");
		System.out.println(jk);
		
		File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(capture, new File("C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\PICTURES\\"+jk+"output.jpg"));
  
  }

}


