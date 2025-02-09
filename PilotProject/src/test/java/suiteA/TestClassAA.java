package suiteA;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassAA extends TestBase{
	
	@Test
	public void testAA() throws InterruptedException {
		System.out.println("Starting Test AA");
		test.info("Start Test AA");
		Thread.sleep(3000);
		System.out.println("Ending Test AA");
		test.info("End Test AA");
	}

}
