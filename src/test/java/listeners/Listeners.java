package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testbase.Testbase;

public class Listeners  extends Testbase implements ITestListener {
	public void onTestStart(ITestResult result) {
		log.info("New Test Started : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test Successfully Finished :"  + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		log.error("Test Failed : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test Skipped : " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.error("Test Failed but within success percentage : " + result.getName());
	}

	public void onStart(ITestContext context) {
		log.info("This is onStart method : " + context.getOutputDirectory());
	}

	public void onFinish(ITestContext context) {
		log.info("This is onFinish method : " + context.getPassedTests());
		log.info("This is onFinish method : " + context.getFailedTests());
	}
	
}

	

