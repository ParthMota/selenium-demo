package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassA extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA")
	public void testA(String arg1, String arg2) throws InterruptedException {
		log("Starting test A");
		log("UserName 1 : "+arg1);
		log("Password 1 : "+arg1);
		Thread.sleep(1000);
		log("Ending Test A");
	
	}
	
	
}
