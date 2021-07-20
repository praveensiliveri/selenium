package shifttocaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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

}
