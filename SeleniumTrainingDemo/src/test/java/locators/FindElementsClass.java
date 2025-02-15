package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsClass {
	
	@Test
	public void findElementTest() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");

		List<WebElement> textFields = driver.findElements(By.className("form-control"));
		
		textFields.get(0).sendKeys("motaparth@gmail.com");
		
		Thread.sleep(4000);
		
		textFields.get(1).sendKeys("Test@12345");
		Thread.sleep(4000);
		
		driver.quit();
	}
}
