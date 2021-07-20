package getattributevalues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributevalues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
	
	WebDriver driver;
	
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.navigate().to("http://www.automationpractice.com/");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.xpath("//div[@class='header_user_info']")).click();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveensiliveri100@gmail.com");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Praveens1");
	Thread.sleep(5000);
	
	
	String obj1=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
	System.out.println("the  username is "+obj1);
	
	String obj2=driver.findElement(By.xpath("//input[@id='passwd']")).getAttribute("value");
	System.out.println("the password is "+obj2);

	}

}
