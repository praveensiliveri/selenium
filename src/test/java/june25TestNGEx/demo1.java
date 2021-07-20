package june25TestNGEx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class demo1 {

	WebDriver driver;

	@Test
	public void f() {
		String vegname="tomato";
		Actions act=new Actions(driver);
		WebElement search= driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");


	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
