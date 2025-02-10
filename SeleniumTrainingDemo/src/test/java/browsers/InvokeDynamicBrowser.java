package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeDynamicBrowser {

	public WebDriver driver = null;

	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.driver.gecko", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.driver.edge", "drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void quiteBrowser() {
		driver.quit();
	}

	@Test
	public void openFacebook() throws InterruptedException {

		driver.get("https://facebook.com");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

		Thread.sleep(3000);
	}

	@Test
	public void openYahoo() throws InterruptedException {

		driver.get("https://in.search.yahoo.com/");
		Assert.assertEquals(driver.getTitle(), "Yahoo Search - Web Search");

		Thread.sleep(3000);
	}

}
