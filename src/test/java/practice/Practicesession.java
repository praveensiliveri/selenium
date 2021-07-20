package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	 driver.get("https://www.mobikwik.com/");
driver.findElement(By.xpath("//section[@class='usrCntrol']/span[2]/a[2]")).click();

driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("9391449563");

driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();


Thread.sleep(3000);
      

WebElement checkbox= driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']"));
System.out.println("the checkbox selection is " +checkbox.isSelected());

boolean checkbox1=true;

		
	
	
	
	
	
	
	
	
	}

}
