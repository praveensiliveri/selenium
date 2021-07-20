package shifttocaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterCapsShifttocaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com/");

		String vegname="tomato";
		Actions act=new Actions(driver);
		WebElement search= driver.findElement(By.xpath("//input[@id='input']"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegname).build().perform();

		Thread.sleep(5000);


		//right click  on the web page
		act.moveToElement(search).contextClick().build().perform();

		//double click on the web page
		act.moveToElement(search).doubleClick().build().perform();

	}

	
	
	
	
	
}
