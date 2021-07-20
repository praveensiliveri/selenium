package onmouseoperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Onmouseopeartion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.bigbasket.com/");
		driver.get ("https://phptravels.com/demo/");




		Actions obj=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("(//nav[@class='clearfix']//span[1])[1]"));
		obj.moveToElement(search).build().perform();

		String name=driver.getTitle();
		System.out.println("home page title is " +name);


		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();

		Thread.sleep(3000);//a[text()="Login"]

		Actions obj2=new Actions(driver);
		WebElement reg=driver.findElement(By.xpath("//a[text()='Register']"));
		obj2.moveToElement(reg).build().perform();
		String name1=driver.getTitle();
		System.out.println("current  page title is " +name1);

		driver.findElement(By.xpath("//li[@class='country highlight']/span[1]")).sendKeys("+91");

		WebElement text=driver.findElement(By.xpath("//li[@class='country highlight']/span[1]"));
		System.out.println("the country is "+text.getText());


		driver.close();

		/*
		 * if(search.isDisplayed()&&search.isEnabled()) {
		 * 
		 * driver.findElement(By.
		 * xpath("(//div[@class='dropdown-content featuresDropdown']/a)[1]")).click();
		 * 
		 * String name2=driver.getTitle(); System.out.println(" current title is "
		 * +name2);
		 * 
		 * 
		 * driver.close();
		 * 
		 * } else { System.out.println("webelement is not present"); }
		 */
	}

}
