package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class localListener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** Test Success ****");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** Test Failure ****");
	}
}
