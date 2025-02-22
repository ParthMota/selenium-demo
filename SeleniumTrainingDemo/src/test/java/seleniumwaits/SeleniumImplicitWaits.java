package seleniumwaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumImplicitWaits {
	
	@Test
	public void googleSearchTest() {
		System.setProperty("webdriver.driver.google","drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\Users\\motap\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
//		implicit wait declaration
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://google.com");
		
		//type in search bar
		driver.findElement(By.xpath("//textarea[@title='Search' and @role='combobox']")).sendKeys("selenium webdriver");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@role='presentation'][3]")).click();
//		Thread.sleep(3000);
		
//		System.out.println(driver.findElement(By.xpath("//li[@role='presentation'][3]")));
		
		driver.quit();
	}

}
