package Pro.Training.Tech.STUDENTS;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitePractice17new {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.navigate().to("https://www.hotmail.com");
  Thread.sleep(6000);
  driver.navigate().back();
  driver.navigate().forward();
  driver.navigate().refresh();
  driver.manage().window().maximize();
  driver.manage().window().minimize();
  driver.manage().window().maximize();
  String session=driver.getWindowHandle();
  System.out.println(session);
  String url=driver.getCurrentUrl();
  System.out.println(url);
  String title=driver.getTitle();
  System.out.println(title);
 WebElement buynowclick= driver.findElement(By.id("c-shellmenu_custom_button_outline_newtab_buynow_bhvr92_right"));
 buynowclick.click();
 Thread.sleep(4000);
 WebElement nothanks=driver.findElement(By.className("ow-pro-c-no-button"));

 nothanks.click();
 
  
  
  
  
  
  
  
  

	}

}
