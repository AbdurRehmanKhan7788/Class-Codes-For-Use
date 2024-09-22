package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderspopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.cheapoair.com/");
         Thread.sleep(6000);
         driver.manage().window().maximize();
         driver.navigate().refresh();
         Thread.sleep(6000);
   WebElement date=driver.findElement(By.xpath("//*[@aria-label='Choose a departure date. expanded']"));
   date.click();
   Thread.sleep(6000);
   
        WebElement agree=driver.findElement(By.xpath("//*[@aria-label='26 August 2024']"));
        agree.click();
        
         
      
       
         
         

	}

}
