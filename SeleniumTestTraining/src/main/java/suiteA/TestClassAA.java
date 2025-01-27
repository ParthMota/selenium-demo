package suiteA;

import org.testng.annotations.Test;

public class TestClassAA {
	
	@Test
	public void testAA() throws InterruptedException {
		System.out.println("Starting Test AA");
		Thread.sleep(3000);
		System.out.println("Ending Test AA");
	}

}
