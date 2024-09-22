package Pro.Training.Tech.STUDENTS;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Bestsellers;
import Pages.Home;
import Pages.Kindlestores;

import java.util.Date;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
//import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class PageObjectModel {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	   
	Home ob=new Home (driver);
	  Thread.sleep(6000);
	  ob.BestsellersClick(); 
	  Bestsellers oj=new Bestsellers(driver);
	  Thread.sleep(5000);
	  oj.storesToClick();
	  Home ojo=new Home(driver);
	  Thread.sleep(6000);
	  screenshots();
	  Kindlestores ok=new Kindlestores(driver);
	  String kindlestorestexts=ok.Kindlestoresget();
	  System.out.println(kindlestorestexts);
	  SoftAssert jk=new SoftAssert();
	  jk.assertEquals(kindlestorestexts,"Best Sellers in kindle store");
	  //assert softassert
	  System.out.println("This is after assertation ");
	  jk.assertAll();
	  
	  public void Second();
	  
	  
	  
	  
	 
	 
	 
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException 
  
  {
	browsers("chrome");
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(10000);
	//driver.navigate().refresh();
	driver.manage().window().maximize();
	screenshots();
	/*String currentwindow=driver.getWindowHandle();
	System.out.println(currentwindow);
	WebElement bestseller=driver.findElement(By.linkText("Best Sellers"));
	Actions ob=new Actions(driver);
	ob.keyDown(Keys.LEFT_SHIFT).build().perform();
	bestseller.click();
	ob.keyUp(Keys.LEFT_SHIFT).build().perform();*/
  }

  @AfterMethod
  public void afterMethod() {
  }

  public void browsers(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");	 
	  	
	 
	  driver = new ChromeDriver();  }
	  else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\msedgedriver.exe");
	  driver=new EdgeDriver();
	  
	  }
	  
	  
  }
  
  
 public void screenshots() throws IOException   {
	 

	Date dt=new Date();
	String jk=dt.toString().replace(" ","_").replace(":","_");
	System.out.println(jk);
	
	File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(capture, new File("C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\PICTURES\\"+jk+"output.jpg"));
	 
 }
  
  
  
  

}
