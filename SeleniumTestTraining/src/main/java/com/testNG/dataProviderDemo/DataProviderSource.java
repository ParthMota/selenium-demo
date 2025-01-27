package com.testNG.dataProviderDemo;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {
	
	@DataProvider(name = "scenarioData")
	public static Object[][] getScenario(Method method){
		String testCase = method.getName();
		if("scenario1".equals(testCase)) {
			return new Object[][] {{"scenario 1 data"}};
		}
		else if("scenario2".equals(testCase)) {
			return new Object[][] {{"scenario 2 data"}};
		}
		else{
			return new Object[][] {{"Common Scenario"}};
		}
	}
	
	
	@DataProvider(name = "testType")
	public static Object[][] getTestType(Method context){
		String testCase = context.getName();
		if("acceptanceTest".equals(testCase)) {
			return new Object[][] {{"Acceptance test data"}};
		}
		else if("integrationTest".equals(testCase)) {
			return new Object[][] {{"Integration test data"}};
		}
		else{
			return new Object[][] {{"Common Scenario"}};
		}
	}
	
}
