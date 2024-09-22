package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysfunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(6000);
		 
	     driver.manage().window().maximize();
	      driver.navigate().refresh();
	  WebElement search=driver.findElement(By.name("field-keywords"));
		
	   search.sendKeys("Computer");
	   Actions ob=new Actions(driver);
	   Thread.sleep(5000);
	   ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	  Thread.sleep(5000);
	   ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	   Thread.sleep(6000);
	   search.clear();
	   Thread.sleep(6000);
	   search.clear();
	   ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	   
	   
		
	}

}
