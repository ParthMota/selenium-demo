package suiteB;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestClassB  extends TestBase {
	
	@Test
	public void testB() throws InterruptedException{
		System.out.println("Starting Test B");
//		test.info("Starting Test B");
		Thread.sleep(3000);
		System.out.println("Ending Test B");
//		test.info("Ending Test B");
	}
	
	
}
