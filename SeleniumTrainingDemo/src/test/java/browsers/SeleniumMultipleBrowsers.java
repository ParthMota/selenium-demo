package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumMultipleBrowsers {
	
	@Test
	public void openInChrome() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","drivers/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("https://facebook.com");
		Assert.assertEquals(chromeDriver.getTitle(), "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		
		chromeDriver.quit();
	}
	
	@Test
	public void openInFireFox() throws InterruptedException {
		System.setProperty("webdriver.driver.gecko","drivers/geckodriver.exe");
		WebDriver geckoDriver = new FirefoxDriver();
		
		geckoDriver.manage().window().maximize();
		
		geckoDriver.get("https://facebook.com");
		Assert.assertEquals(geckoDriver.getTitle(), "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		
		geckoDriver.quit();
	}
	
	@Test
	public void openInEdge() throws InterruptedException {
		System.setProperty("webdriver.driver.edge","drivers/msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		
		edgeDriver.manage().window().maximize();
		
		edgeDriver.get("https://facebook.com");
		Assert.assertEquals(edgeDriver.getTitle(), "Facebook – log in or sign up");
		
		Thread.sleep(3000);
		
		edgeDriver.quit();
	}
	

}
