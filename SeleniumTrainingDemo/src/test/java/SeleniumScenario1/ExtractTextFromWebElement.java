package SeleniumScenario1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ExtractTextFromWebElement {

	public WebDriver driver = null;

	@Test
	public void extractText() {
		// Extract Text from heading
		System.out.println(driver.findElement(By.className("_8eso")).getText());
		Assert.assertEquals(driver.findElement(By.className("_8eso")).getText(),
				"Facebook helps you connect and share with the people in your life.");

		// extract text from link
		System.out.println(driver.findElement(By.className("_8esh")).getText());
		Assert.assertEquals(driver.findElement(By.className("_8esh")).getText(), "Create a Page");

		// extract text from placeholder
		System.out.println(driver.findElement(By.id("email")).getDomAttribute("aria-label"));
		Assert.assertEquals(driver.findElement(By.id("email")).getDomAttribute("aria-label"),
				"Email address or phone number");

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://facebook.com");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
