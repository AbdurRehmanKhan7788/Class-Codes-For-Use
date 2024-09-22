package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pswrdprac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	
		
		 
		Thread.sleep(4000);
		
		
		
		

	}

}
