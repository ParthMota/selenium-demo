package SeleniumScenario1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtractMultipleElements {

	public WebDriver driver;

	@Test
	public void findNumberOfLinks() {

		// total number of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());

//	  Extract Text and URL of links
//	  WebElement sixthLink = allLinks.get(5);
//	  System.out.println("6th Link Text = "+sixthLink.getText());
//	  System.out.println("6th Link URL = "+sixthLink.getDomAttribute("href"));

		// get all links
		long count = 0;
		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				count += 1;
				System.out.println("Link No : " + count);
				System.out.println("Link Text : " + link.getText());
				System.out.println("Link URL : " + link.getDomAttribute("href"));
				System.out.println("*************************************");
			}
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://edition.cnn.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
