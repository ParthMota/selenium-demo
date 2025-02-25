package seleniumwaits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumImplicitWaits {
	
	@Test
	public void googleSearchTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//open google homepage
		driver.get("https://google.com");
		
		//type in search bar
		driver.findElement(By.xpath("//textarea[@title='Search' and @role='combobox']")).sendKeys("selenium webdriver");

		//click third link from the suggestions
		System.out.println(driver.findElement(By.xpath("(//li[@role='presentation'])[3]")).getText());
		driver.findElement(By.xpath("(//li[@role='presentation'])[3]")).click();
		
		//close browser
		driver.quit();
	}

}
