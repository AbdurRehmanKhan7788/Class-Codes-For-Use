package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 WebElement submission=driver.findElement(By.name("submit"));
		 submission.click();
		 //Thread.sleep(5000);
		 //driver.switchTo().alert().accept();
		 Thread.sleep(3000);
		 //driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		 
		 
	}

}
