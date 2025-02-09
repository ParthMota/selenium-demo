package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;
import dataprovider.TestDataProvider;

public class TestClassAA extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataProviderSuiteA")
	public void testAA() throws InterruptedException {
		log("Starting test AA");
		Thread.sleep(1000);
		log("Ending Test AA");
	}

}
