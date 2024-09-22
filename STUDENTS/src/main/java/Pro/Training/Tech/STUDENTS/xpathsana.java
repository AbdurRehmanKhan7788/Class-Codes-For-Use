package Pro.Training.Tech.STUDENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathsana {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");


		 // Click on the "Create New Account" button
		    WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		    createNewAccount.click();

		    
		    Thread.sleep(2000);

		   
		    WebElement firstName = driver.findElement(By.name("firstname"));
		    firstName.sendKeys("Sana");

		    WebElement lastName = driver.findElement(By.name("lastname"));
		    lastName.sendKeys("abc");

		    WebElement emailOrPhone = driver.findElement(By.name("reg_email__"));
		    emailOrPhone.sendKeys("sana@gmail.com");

		  

		    WebElement password = driver.findElement(By.name("reg_passwd__"));
		    password.sendKeys("123");

		    // Select Date of Birth
		    WebElement birthDay = driver.findElement(By.name("birthday_day"));
		    birthDay.sendKeys("21");

		    WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		    birthMonth.sendKeys("May");

		    WebElement birthYear = driver.findElement(By.name("birthday_year"));
		    
		    birthYear.sendKeys("1990");

		   
		    WebElement gender = driver.findElement(By.xpath("//input[@value='1']")); 
		    gender.click();
		    Thread.sleep(6000);
		   // WebElement customize=driver.findElement(By.)

		    // Click on the "Sign Up" button
		    WebElement signUpButton = driver.findElement(By.name("websubmit"));
		    signUpButton.click();

		    

		 


	}

}
