package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	
	@DataProvider
	public static Object[][] dataProviderSuiteA(Method method) {
		System.out.println("Test Method name : "+method.getName());
		
		Object data[][] = null;
		
		if(method.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][2];
			
			data[0][0] = "Username 1";
			data[0][1] = "Password 1";
			
			data[1][0] = "Username 2";
			data[1][1] = "Password 2";
		}else if(method.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][2];
			
			data[0][0] = "Username 11";
			data[0][1] = "Password 11";
			
			data[1][0] = "Username 22";
			data[1][1] = "Password 22";
		}
		return null;
	}

}
