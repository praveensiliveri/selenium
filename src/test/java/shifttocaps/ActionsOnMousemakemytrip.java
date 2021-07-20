package shifttocaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnMousemakemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		driver.findElement(By.xpath("(//p[text()='Mumbai, India'])[1]")).click();

		driver.findElement(By.xpath("//p[text()='Delhi, India']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		// driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[9]")).click();
		// driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[1]")).click();


		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		act.moveToElement(search).build().perform();

		Thread.sleep(5000);

		if(search.isDisplayed()&&search.isEnabled()) {
			driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[9]")).click();
		}
		else { System.out.println("webeElement is not present"); 
		}

		driver.findElement(By.xpath("//a[text()='Search']")).click();

	}
}
