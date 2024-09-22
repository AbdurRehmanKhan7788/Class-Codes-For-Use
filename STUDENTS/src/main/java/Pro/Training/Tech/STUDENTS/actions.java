package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.com/");
        //Thread.sleep(6000);
        driver.manage().window().maximize();
        driver.navigate().refresh();
       WebElement action=driver.findElement(By.id("nav-link-accountList"));
       Actions ob=new Actions(driver);
       Thread.sleep(6000);
       ob.moveToElement(action).build().perform();
       Thread.sleep(6000);
      WebElement musics=driver.findElement(By.linkText("Music Library"));
      ob.moveToElement(musics).click().build().perform();
      
      
	}

}
