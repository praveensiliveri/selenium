package testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import june28_log4j.LogTest;
import listeners.EventListener;
import pages.Authenticationpage;
import pages.Homepage;

public class Testbase {
	
	public Logger log = LogManager.getLogger(LogTest.class.getName());

	public static WebDriver driver;
	protected Homepage homepageobj;
	protected Authenticationpage authpageobj;
	public static ExtentReports extent;
	public static ExtentTest logger;
 
	public Properties prop;
	public FileInputStream fis;
	public static ExcelReader excelReader;

	
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		prop=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		

		//load the file using below command
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers chrome drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		
		
		//class file which we created in above step
		EventListener ecapture = new EventListener(); 
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		
		     
		homepageobj=new Homepage(eventHandler);
		authpageobj=new Authenticationpage(eventHandler);
	 
		//provide the excelsheet path
		excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\inputdata.xlsx");

		
	}
	
	@AfterMethod
	public void afterTest() {
		driver.close();
		extent.endTest(logger);
		extent.flush();
	}
	
	
	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}
	
	
	
	@AfterTest
	public void testafter() {
		 
		extent.close();
	}

}
	
       





