package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newclassfortest42 {
	WebDriver driver;
	
	@Test(priority=1)

void openupapp () {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
	}
	@Test(priority=2)
	void login() throws InterruptedException {
	Thread.sleep(3000);	
	driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
Thread.sleep(000);
	driver.findElement(By.xpath("//input[@name='session_password'] ")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='session_key'] ")).sendKeys("Abdur Rehman Khan");
	
	
	
		
	}
	@Test(priority=3)
	void logout() {
	//driver.close();
		
		
	}
		
		
	
	
	
	
	
	
	}

	
	
	
	
	
	
	


