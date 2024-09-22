package Pro.Training.Tech.STUDENTS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Selenium {
  @Test
  public void f() {
	  System.out.println("This is Test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Beforemethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is Aftermethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is beforeclass annotiation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is afterclass annotation");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is beforetest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is aftertest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is beforesuit annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is aftersuit annotation");
  }

}
