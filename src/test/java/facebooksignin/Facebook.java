package facebooksignin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("918099734581");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Praveens12");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	driver.findElement(By.xpath("//i[@class='hu5pjgll lzf7d6o1']")).click();
	
	}

}
