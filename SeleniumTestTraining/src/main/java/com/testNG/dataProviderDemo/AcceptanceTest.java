package com.testNG.dataProviderDemo;

import org.testng.annotations.Test;

public class AcceptanceTest {

	@Test(dataProvider = "testType", dataProviderClass = DataProviderSource.class)
	public void acceptanceTest(String data) {
		System.out.println("Acceptance Testing : "+data);
	}
}
