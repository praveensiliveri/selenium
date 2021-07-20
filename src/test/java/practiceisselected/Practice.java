package practiceisselected;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.freecharge.in/");

		List<WebElement> footrelinks=driver.findElements(By.xpath("(//div[@class='_QVj0'])[1]/ul[6]/li"));

		for(int i=0;i<footrelinks.size();i++) {
			System.out.println(footrelinks.get(i).getText());
		}

driver.close();
	}
}