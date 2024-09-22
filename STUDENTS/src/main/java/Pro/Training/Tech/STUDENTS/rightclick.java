package Pro.Training.Tech.STUDENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		Thread.sleep(6000);
		 
	     driver.manage().window().maximize();
	     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     WebDriverWait oj=new WebDriverWait(driver, null);
	      driver.navigate().refresh();
	      Actions ob=new Actions(driver);
	      WebElement rightjkk=driver.findElement(By.xpath("//img[@style='cursor: pointer']"));
	      ob.contextClick(rightjkk).build().perform();
	      
	      Thread.sleep(3000);
	      
	      WebElement srfun=driver.findElement(By.xpath("//input[@class='searchEdit']"));
	     
	      srfun.sendKeys("my name is Khan");
	      
	      
		
		
	}

}
