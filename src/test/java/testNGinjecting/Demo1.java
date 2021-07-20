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
import org.testng.annotations.AfterMethod;

public class Demo1 {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().sendKeys("TOMOTO").doubleClick().build().perform();

		Thread.sleep(5000);

		//right  click on the webpage
		act.moveToElement(search).contextClick().build().perform();
	}

	@Test
	public void f2() {

		String vegname="tomato";
		Actions act=new Actions(driver);
		WebElement search= driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();  
	}

	@Test
	public void f3() throws InterruptedException {
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




	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
