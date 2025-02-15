package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserOptions {

	@Test
	public void chromeBrowserProfiling() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
//		options.setBinary(path/to/chrome)
		
		//open chrome maximized
		options.addArguments("--start-maximized");
		
		//open specific profile
		options.addArguments("--user-data-dir=C:\\Users\\motap\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		Thread.sleep(3000);
		
		driver.get("https://facebook.com");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

	@Test
	public void firefoxBrowserProfiling() throws InterruptedException {
		
		FirefoxOptions fireOptions = new FirefoxOptions();
//		options.setBinary(path/to/chrome)
		ProfilesIni profiles = new ProfilesIni();
//		String profilePath = "C:\\Users\\motap\\AppData\\Local\\Mozilla\\Firefox\\Profiles\\6cbq9jp7.TestUser";
		FirefoxProfile ffprofile = profiles.getProfile("TestUser");
		
		fireOptions.setProfile(ffprofile);
		
		System.setProperty("webdriver.driver.gecko", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(fireOptions);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

	public void edgeBrowserProfiling() {

	}
}
