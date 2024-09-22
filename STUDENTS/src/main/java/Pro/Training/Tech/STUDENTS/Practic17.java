package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.target.model.SessionID;

public class Practic17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.navigate().to("https://www.facebook.com");
	/*	Thread.sleep(6000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	//Thread.sleep(6000);
	driver.manage().window().maximize();
	//Thread.sleep(6000);
	driver.manage().window().minimize();
	String session=driver.getWindowHandle(); // to get session id for the browser.
	System.out.println(session);
	String titles=driver.getTitle();
	System.out.println(titles);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();*/
		// Web Locater 1. id 2. linktext 3. partiallinktext 4. classname
		//5. name 6. Xpath 7 Css selector 8. Tagname
	//These are the locater for the pourpose of locating java locater into the script.
		WebElement enteremail= driver.findElement(By.id("email"));
		enteremail.sendKeys("rehmankhan777@yahoo.com");
		WebElement pswrdenter=driver.findElement(By.name("pass"));
	        pswrdenter.sendKeys("1234567");
	        Thread.sleep(6000);
	        //WebElement linkforgot=driver.findElement(By.linkText("Forgot password?"));
	        //linkforgot.click();
	        WebElement linkforgot=driver.findElement(By.partialLinkText("Forgot"));
	        linkforgot.click();
	        
	        
	        
	        
		
	
	
	
		
		
		
		
		
		
		

	}

}
