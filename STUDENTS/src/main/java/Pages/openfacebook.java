package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(6000);
		driver.manage().window().maximize();
	WebElement writeon=driver.findElement(By.xpath("//*[@placeholder=\"Email or phone number\"] "));
		writeon.sendKeys("123456");
		
		
		
		
		
		

	}

}
