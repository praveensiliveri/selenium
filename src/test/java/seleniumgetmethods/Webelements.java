package seleniumgetmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//get method 
	driver.get("http://www.automationpractice.com/");
	//get title
	String obj=driver.getTitle();
	System.out.println("title of the page is "+obj);
	//get current Url
	String webpageUrl=driver.getCurrentUrl();
	System.out.println("current url is " +webpageUrl);

	//getText
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T shirts");
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	
	String obj2=driver.findElement(By.xpath("//span[@class='lighter']")).getText();
	System.out.println("search text is " +obj2);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[@id='contact-link']")).click();
	String onj=driver.getTitle();
	System.out.println("the title of the page is "+onj);
	
	String currentURL=driver.getCurrentUrl();
	System.out.println("current URL of the page is "+currentURL);
	
	}

}
