package TestBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentReporterManager;

public class TestBase {

	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void init(ITestResult res) {
		extent = ExtentReporterManager.getReporter();
		test = extent.createTest(res.getMethod().getMethodName().toUpperCase());
	}

	@AfterTest
	public void end() {
		extent.flush();
	}
}
