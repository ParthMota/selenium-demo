package suiteC;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassC extends TestBase {
	
	@Test
	public void testC() throws InterruptedException {
		System.out.println("Starting Test C");
//		test.info("Starting Test C");
		Thread.sleep(3000);
		System.out.println("Ending Test C");
//		test.info("Ending Test C");
	}
	
	
}
