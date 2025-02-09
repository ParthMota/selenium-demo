package suiteB;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassBB extends TestBase{
	
	@Test
	public void testBB() throws InterruptedException {
		System.out.println("Starting Test BB");
//		test.info("Starting Test BB");
		Thread.sleep(3000);
		System.out.println("Ending Test BB");
//		test.info("Ending Test BB");
	}

}
