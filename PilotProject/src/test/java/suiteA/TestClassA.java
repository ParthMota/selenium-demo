package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassA extends TestBase {
	
	@Test
	public void testA() throws InterruptedException {
		System.out.println("Starting Test A");
		test.info("Starting Test A");
		Thread.sleep(3000);
		System.out.println("Ending Test A");
		test.info("Ending Test A");
	}
	
	
}
