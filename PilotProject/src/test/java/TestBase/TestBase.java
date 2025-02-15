package TestBase;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReporterManager;

public class TestBase {

	public ExtentReports extent;
	public ExtentTest test;
	public ITestResult res;

	@BeforeMethod
	public void init(ITestResult res) {
		this.res = res;
		extent = ExtentReporterManager.getReporter();
		test = extent.createTest(res.getMethod().getMethodName().toUpperCase());
	}

	@AfterMethod
	public void end() {
		extent.flush();
	}
	
	public void log(String msg) {
		System.out.println(msg);
		test.info(msg);
	}
	
	public void pass(String msg) {
		System.out.println(msg);
		test.pass(msg);
	}
	
	public void fail(String msg) {
		System.out.println(msg);
		test.fail(msg);
	}
	
	public void skip(String msg) {
		System.out.println(msg);
		test.skip(msg);
	}
}
