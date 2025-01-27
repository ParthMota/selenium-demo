package com.testNG.dataProviderDemo;

import org.testng.annotations.Test;

public class DataProviderIntegrationTest {
	
	@Test(dataProvider = "testType", dataProviderClass = DataProviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration Testing : "+data);
	}
}
