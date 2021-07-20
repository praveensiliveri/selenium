package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void mobile() {
	  System.out.println("i have a mobile");
  }
   
  @Test
  public void charger() {
	  System.out.println("i have a charger");
  }
   
  @Test
  public void box() {
	  System.out.println("i have a box");
  }
   
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("im from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("im from after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im from before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im from after class");
  }

}
