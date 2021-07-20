package june27;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.Testbase;

public class LoginApp extends Testbase {
	
	
	@Test
	public void Login() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");

		
		logger.log(LogStatus.INFO,"clicking on the sign in link");
		homepageobj.getSigninlink().click();
		
		logger.log(LogStatus.INFO,"Enter the username and password in authentication page");
		authpageobj.setSigninemail(prop.getProperty("username"));
        authpageobj.setSigninpassword(prop.getProperty("password"));
		authpageobj.getSigninsubmitbutton().click();
		
		logger.log(LogStatus.PASS,"Logged in successfully");
	}
	
	@Test
	public void  search() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test is started");

		
		logger.log(LogStatus.INFO,"In home page search with T shirts");
		homepageobj.setSearchtextbox("T shirts");
		
		logger.log(LogStatus.PASS, "Searched Successfully");
	}
//	
//	@Test
//	public void verifyContactus() {
//		homepageobj.getContactus().click();
//	}
//	
	
//	@Parameters({"username","password"})
//	@Test
//	public void login2(String uname, String pword) {
//		homepageobj.getSigninlink().click();
//		
//		authpageobj.Logintoapplication(uname,pword);
//	}
//	
	
	
	@Parameters({"username","password"})
	@Test
	public void login3usingexcel() throws InterruptedException {
		
		homepageobj.getSigninlink().click();
		
		int rowcount=excelReader.getRowCount("Sheet1");
		
		for(int i=2;i<=rowcount;i++) {	
		
		String username=excelReader.getCellData("Sheet1", "username", i);
		String password=excelReader.getCellData("Sheet1", "password", i);
		//System.out.println("excel username is "+username);
		//System.out.println("excel password is "+password);
		Thread.sleep(5000);
		authpageobj.getSignoutlink().click();
	}
	}
}
	
	
	
	
	
	
	
