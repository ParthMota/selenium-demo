package seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardcodeWaits {
	
	@Test
	public void googleSearchTest() throws InterruptedException {
		System.setProperty("webdriver.driver.google","drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		//type in search bar
		driver.findElement(By.xpath("//textarea[@title='Search' and @role='combobox']")).sendKeys("selenium webdriver");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//li[@role='presentation'][3]")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}
}
