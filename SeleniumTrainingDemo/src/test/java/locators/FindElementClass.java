package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementClass {
	
	@Test
	public void findElementTest() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.className("form-control")).sendKeys("motaparth@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("form-control")).sendKeys("Test@1234");
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}
}
