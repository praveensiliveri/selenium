package june5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		driver.findElement(By.id("search_query_top")).sendKeys("t shirts");
	
		
	}

}
 