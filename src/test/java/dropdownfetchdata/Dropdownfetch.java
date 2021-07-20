package dropdownfetchdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownfetch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.automation.com/registration");
	WebElement month=driver.findElement(By.xpath("//select[@id='Country']"));
	Select obj=new Select(month);
	
	Thread.sleep(2000);
	obj.selectByVisibleText("India");
	
	WebElement country=obj.getFirstSelectedOption();
	System.out.println("the country name is "+country);
	

	}

}
