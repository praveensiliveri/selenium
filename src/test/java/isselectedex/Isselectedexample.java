package isselectedex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselectedexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("http://www.automationpractice.com");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("praveen100@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		
	boolean result=	driver.findElement(By.xpath("//input[@id='id_gender1']")).isSelected();

System.out.println(result);

if(result==true) {
	System.out.println("Mr selected");
}
else {
	System.out.println("not selected Mr");
	
}


boolean result2=driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();

System.out.println(result2);


if(result2==true) {
	System.out.println("checkbox is selected");
}
else {
	System.out.println("checkbox is not selected");
}






	}

}
