package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iborwsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//how to setup the browser and how to open the website.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	/*Thread.sleep(6000);
	driver.navigate().back();
	driver.navigate().refresh();
	driver.manage().window().maximize();
	//Thread.sleep(6000);
	driver.navigate().back();
	//Thread.sleep(6000);
	driver.navigate().forward();
	String sessions=driver.getWindowHandle(); // get the sessionID for the Browser
	System.out.println(sessions);
	String titles=driver.getTitle();
	System.out.println(titles);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	*/
	// web locaters.. 1. id 2. linktext 3. partiallinktext 4. classname
	//5. name 6. Xpath 7 Css selector 8. Tagname
	WebElement emailenters = driver.findElement(By.id("email"));
	emailenters.sendKeys("ask@facebook.com");
	WebElement passwordenters=driver.findElement(By.name("pass"));
	passwordenters.sendKeys("123456@aa");
	//WebElement forgotpswrd= driver.findElement(By.linkText("Forgot password?"));
	WebElement forgotpswrd=driver.findElement(By.partialLinkText("Forgot"));
	
	forgotpswrd.click();
	
	
	}
	

}
