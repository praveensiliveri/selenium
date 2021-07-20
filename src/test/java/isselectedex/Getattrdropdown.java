package isselectedex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattrdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='login']")).click();

		driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("B1auto@mailinator.com");
		driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
		WebElement day1 = driver.findElement(By.xpath("//select[@id=\"days\"]"));
		day1.sendKeys("10");

		//Select day = new Select(day1);

		//day.selectByIndex(10);
		day1.click();
		boolean da = day1.isSelected();//<-----------instead of this 
		//boolean da = day1.isDisplayed();  // <-----------------give this
		System.out.println(da);

		if(da==true) { //String day2 = day1.getAttribute("value"); 
			String day2 =
					driver.findElement(By.xpath("//select[@id=\"days\"]/option[11]")).getText();
			System.out.println("day is"+" "+day2); }

		else { System.out.println("Day is not filled"); 
		String day2 = day1.getAttribute("value"); System.out.println("day is"+" "+day2);

		}

		Thread.sleep(5000);
		driver.close();

	}	

}