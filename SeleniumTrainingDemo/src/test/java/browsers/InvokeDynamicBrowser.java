package browsers;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
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
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized", "--disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--incognito");
			options.addArguments("--disable-notifications");
			options.addArguments("ignore-certificate-errors");
			
			//proxy for chrome
//			Proxy proxy = new Proxy();
//			proxy.setHttpProxy("https://google.com");
//			options.setCapability("proxy", proxy);

			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {

			FirefoxOptions options = new FirefoxOptions();
			ProfilesIni profiles = new ProfilesIni();
			FirefoxProfile ffprofile = profiles.getProfile("TestUser");

			ffprofile.setPreference("dom.webnotifications.enabled", false);
			ffprofile.setAcceptUntrustedCertificates(true);
			ffprofile.setAssumeUntrustedCertificateIssuer(false);

			// proxy for firefox
//			ffprofile.setPreference("network.proxy.type", 1);
//			ffprofile.setPreference("network.proxy.socks", "proxy.example.com");
//			ffprofile.setPreference("network.proxy.socks_port", 8000);

			options.setProfile(ffprofile);

			System.setProperty("webdriver.driver.gecko", "drivers/geckodriver.exe");
			driver = new FirefoxDriver(options);
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
	public void verifyCertError() throws InterruptedException {
		driver.get("https://expired.bdss1.com");
		Thread.sleep(5000);
	}

//	@Test
	public void openFacebook() throws InterruptedException {

		driver.get("https://facebook.com");
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

		Thread.sleep(3000);
	}

//	@Test
	public void openYahoo() throws InterruptedException {

		driver.get("https://in.search.yahoo.com/");
		Assert.assertEquals(driver.getTitle(), "Yahoo Search - Web Search");

		Thread.sleep(3000);
	}

}
