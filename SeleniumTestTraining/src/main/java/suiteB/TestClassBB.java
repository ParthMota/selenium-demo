package suiteB;

import org.testng.annotations.Test;

public class TestClassBB {
	
	@Test
	public void testBB() throws InterruptedException {
		System.out.println("Starting Test BB");
		Thread.sleep(3000);
		System.out.println("Ending Test BB");
	}

}
