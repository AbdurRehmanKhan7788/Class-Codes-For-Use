package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionbypracticejquery {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Abdur Rehman Khan\\eclipse-workspace\\STUDENTS\\Driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.jqueryui.com/droppable/");
       //Thread.sleep(6000);
       driver.manage().window().maximize();
       
       Actions	ob=new Actions(driver);
       driver.switchTo().frame(0);
       WebElement sj=driver.findElement(By.id("draggable"));
       
       WebElement kj=driver.findElement(By.id("droppable"));
       Thread.sleep(6000);
       
       ob.dragAndDrop(sj, kj).build().perform();
       driver.switchTo().parentFrame();
       Thread.sleep(5000);
       driver.findElement(By.linkText("Resizable")).click();
       Thread.sleep(5000);
       WebElement select1=driver.findElement(By.linkText("Selectable"));
       select1.click();
       Thread.sleep(5000);
       
       
       
       
       
       
    		   
       
	}

}
