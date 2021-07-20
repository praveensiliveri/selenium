package seleniumnavigatemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagtemethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//navigate to
	driver.navigate().to("http://www.automationpractice.com/");
	System.out.println(driver.getTitle());
	
	
	driver.findElement(By.xpath("//div[@id='contact-link']")).click();
	System.out.println(driver.getTitle());
	
	//navigate to back
	driver.navigate().back();
	System.out.println(driver.getTitle());
//navigate to forward
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);
	//navigate  to refresh
	
	driver.navigate().refresh();
	
	}

}
