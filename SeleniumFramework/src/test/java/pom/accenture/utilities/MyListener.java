package pom.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {

	ExtentReports r;
	ExtentTest t;
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		//System.out.println("Test NGStop");
		r.endTest(t);
		r.flush();
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		//System.out.println("Test NGStart");
		r = new ExtentReports("C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\SeleniumFramework\\src\\test\\java\\pom\\accenture\\utilities\\Report.html");
		
				
		r.addSystemInfo("User", "Manoj");
		r.addSystemInfo("Browser", "Chrome");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed But With in Success Percentage");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Failure");
		t.log(LogStatus.FAIL, result.getMethod().getMethodName()+"has Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Start");
		t=r.startTest(result.getMethod().getMethodName()+"Has Started");

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Test Success");
		t.log(LogStatus.PASS, result.getMethod().getMethodName()+"has Passed");

	}

}
