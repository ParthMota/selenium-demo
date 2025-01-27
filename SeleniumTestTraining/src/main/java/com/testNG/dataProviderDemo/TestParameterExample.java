package com.testNG.dataProviderDemo;

import javax.sound.sampled.TargetDataLine;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterExample {
	
	@Test(dataProvider = "DoubleSet")
	public void add(int actual, int expected) {
		int actualValue = actual +20;
		Assert.assertEquals(actualValue, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{100,120},{140,160},{300,310},{400,420},{500,520}
		};
	}
	
	@DataProvider(name = "DoubleSet")
	public Object[][] getDataSet(){
		return new Object[][] {
			{10,30},{2,10},{30,50},{40,50},{15,35}
		};
	}

}
