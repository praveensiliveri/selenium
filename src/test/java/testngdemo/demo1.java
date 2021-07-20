package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class demo1 {
  @Test
  public void praveen() {
	  System.out.println("im from praveen method");
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
