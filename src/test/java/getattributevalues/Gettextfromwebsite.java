package getattributevalues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextfromwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.automationpractice.com");
	
	String websitename="Automation Practice Website";
	String apw= driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
	
	System.out.println(apw);
	
	
	if(websitename.equals(apw)) {
		System.out.println("this website contains the text present on the homepage:pass" );
	}
	else {
		System.out.println("text is not present on the homepage");
		
		
		
     String Comevisitustext=driver.findElement(By.xpath("(//div[@class='type-text']/h3)[1]")).getText();
	System.out.println(Comevisitustext);
		
		
		
		
		
	}
	
	}

}
