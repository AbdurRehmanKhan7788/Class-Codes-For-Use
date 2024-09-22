package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	WebDriver driver;
@FindBy(id = "form-field-name")
WebElement FirstNameField;
@FindBy(name = "form_fields[field_6c5f814]")
WebElement LastNameField;
@FindBy(name = "form_fields[email]")
WebElement Email;

public Contact(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

}
public void FirstNameText(String name) throws InterruptedException {
	

FirstNameField.clear();
FirstNameField.sendKeys(name);
Thread.sleep(6000);

}
public void LastNameField(String name) throws InterruptedException {
	LastNameField.click();
	LastNameField.sendKeys(name);
	Thread.sleep(6000);
		
}
public void Email(String name) throws InterruptedException {
	Email.clear();
	Email.sendKeys(name);
	Thread.sleep(6000);
	
}
}
