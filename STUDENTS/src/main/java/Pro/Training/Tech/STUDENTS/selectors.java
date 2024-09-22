package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectors {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		createanaccount.click();
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByIndex(1);
		Thread.sleep(3000);
		ob.selectByValue("6");
		Thread.sleep(3000);
		ob.selectByVisibleText("Nov");
		WebElement female=driver.findElement(By.xpath("(html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
		female.click();
		Thread.sleep(6000);
		WebElement custom=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'])[3]"));
		custom.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
	}

}
