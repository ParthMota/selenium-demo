package suiteC;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassCC extends TestBase{
	
	@Test
	public void testCC() throws InterruptedException {
		System.out.println("Starting Test CC");
//		test.info("Starting Test CC");
		Thread.sleep(3000);
		System.out.println("Ending Test CC");
//		test.info("Ending Test CC");
	}

}
