package june9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("http://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus nord");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("email_create")).sendKeys("praveen100@gmail.com");
		//driver.findElement(By.id("SubmitCreate")).click();
		
		//driver.findElement(By.id("days")).sendKeys("12");
		
   //Select day=new Select(driver.findElement(By.id("days")));
    //day.selectByIndex(11);
    
    //Select month=new Select(driver.findElement(By.id("months")));
    //month.selectByIndex(5);
    
    //Select year=new Select(driver.findElement(By.id("years")));
    //year.selectByIndex(10);
		
	/*	Select day=new Select(driver.findElement(By.id("days")));
		day.selectByValue("5");
		
		Select month=new Select(driver.findElement(By.id("months")));
		month.selectByValue("5");
		
		Select year =new Select(driver.findElement(By.id("years")));
		year.selectByValue("2012");*/
     
    Thread.sleep(1000);
  
		
			

	}

}
