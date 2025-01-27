package com.testNG.dataProviderDemo;

import org.testng.annotations.Test;

public class DataProviderTrainingDemo {
	
	@Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
	public void scenario1(String scenarioData) {
		System.out.println("This is Scenario 1 : "+scenarioData);
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
	public void scenario2(String scenarioData) {
		System.out.println("This is Scenario 2 : "+scenarioData);
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass = DataProviderSource.class)
	public void commonScenario(String scenarioData) {
		System.out.println("This is Common Scneario : "+scenarioData);
	}

}
