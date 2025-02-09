package SeleniumIntro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	@Test
	public void openSiteInChrome() {
		
		System.setProperty("webdriver.driver.chrome","drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.close();
	}
}
