package com.testNG.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void testOne() {
		System.out.println("I am in Test One");
	}
	
	@Test(dataProvider = "dataprovider")
	public void testGetData(String s) {
		System.out.println("Test getData, \nInput : "+s);
	}
	
	@DataProvider
	public Object[] dataprovider() {
		return new Object[] {"A","B"};
	}
	
	@Test
	public void testThree() {
		Assert.assertEquals(3, 4);
	}
	
	@Test
	public void testFour() {
		System.out.println("I am in test four");
		throw new SkipException(null);
	}
}
