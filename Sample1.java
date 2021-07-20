package june25testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample1 {
	@Test
	public void f() {
		System.out.println("im from test ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("im from  befoe class ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("im from after class ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("im from beforetest ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("im from aftertest ");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("im from before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("im from after method");
	}

}
