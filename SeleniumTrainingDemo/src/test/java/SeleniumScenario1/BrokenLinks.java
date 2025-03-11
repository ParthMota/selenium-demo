package SeleniumScenario1;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinks {
	public WebDriver driver;

	@Test
	public void findNumberOfLinks() throws IOException {

		// total number of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+allLinks.size());
		
		//Click all links and get webpage status 200-Success, 404-failure
		for (WebElement link : allLinks) {
			String url = link.getDomAttribute("href");
			VerifyLinkStatus.verifyLink(url);
			
		}
		VerifyLinkStatus.getInvalidLinkCount();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://facebook.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
