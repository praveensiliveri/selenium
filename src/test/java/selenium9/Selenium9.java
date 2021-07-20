package selenium9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.automationpractice.com");
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Jeans");
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
	driver.findElement(By.xpath("//div[@id='contact-link']")).click();
	
	driver.findElement(By.xpath("//div[@class='header_user_info']")).click();

	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("praveen100@gmail.com");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	
	driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("praveen");
	
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("kumar");
	
	Thread.sleep(3000);
		
	
		
	}

}
