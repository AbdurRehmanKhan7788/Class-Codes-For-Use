package Pro.Training.Tech.STUDENTS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		WebElement bestseller=driver.findElement(By.linkText("Best Sellers"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		bestseller.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
		
		Set<String> windowhandlebrowser=driver.getWindowHandles();
		Iterator<String> iterators=windowhandlebrowser.iterator();
		String FirstWindowHandle=iterators.next();
		String SecondWindowHandle=iterators.next();
		System.out.println("This is the first handle="+FirstWindowHandle);
		System.out.println("This is the second handle="+SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		Thread.sleep(5000);
		WebElement stors=driver.findElement(By.linkText("Kindle Store"));
		stors.click();
		

	}

}
