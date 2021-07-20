package testNGinjecting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Demo2 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.bigbasket.com/");

		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().sendKeys("TOMOTO").doubleClick().build().perform();

		Thread.sleep(5000);

		//right  click on the webpage
		act.moveToElement(search).contextClick().build().perform();
	}

	@Test
	public void f2() {
		driver.get("https://www.bigbasket.com/");

		String vegname="tomato";
		Actions act=new Actions(driver);
		WebElement search= driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();  
	}

	@Test
	public void f3() throws InterruptedException {
		driver.get("https://www.bigbasket.com/");

		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		act.moveToElement(search).build().perform();

		Thread.sleep(5000);

		if(search.isDisplayed()&&search.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()=\"Foodgrains, Oil & Masala\"])[2]")).click();
		}
		else {
			System.out.println("webeElement is not present");
		}
	}

	@BeforeClass
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterMethod() {
		driver.close();
	}

}
