package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.page.model.NavigatedWithinDocument;

public class Selectpractice {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.hotmail.com");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.manage().window().minimize();
	 Thread.sleep(3000);
	 
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 driver.navigate().back();
	 driver.navigate().forward();
	 WebElement creat=driver.findElement(By.partialLinkText("Create free account"));
	 creat.click();
	 Thread.sleep(8000);
	 WebElement close=driver.findElement(By.id("usernameInput"));
	 close.sendKeys("rehmankhan8888@yahoo.com");
	 	
	 
	 
	}

}
