package Pages;

import org.testng.annotations.Test;

import Common.Reuseable;

import org.testng.annotations.DataProvider;

public class ContactUsForm extends Reuseable {
  @Test(dataProvider = "dp")
  public void f(String n,String s, String k) throws InterruptedException {
	  Contact ob=new Contact(driver);	 
	  ob.FirstNameText(n);
	  ob.LastNameField(s);
	  ob.Email(k);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] { 
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
