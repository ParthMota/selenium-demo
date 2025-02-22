package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLoadTimeOut {

	@Test
	public void pageLoadTest() throws InterruptedException {

		System.setProperty("webdriver.driver.google", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		
		driver.get("https://edition.cnn.com/");
		
		Thread.sleep(6000);
		
		Assert.assertEquals(driver.getTitle(), "Breaking News, Latest News and Videos | CNN");
		
		driver.quit();
	}
}
