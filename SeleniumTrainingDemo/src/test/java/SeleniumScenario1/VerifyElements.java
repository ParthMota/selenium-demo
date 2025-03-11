package SeleniumScenario1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyElements {

	public WebDriver driver = null;

	
	@Test
	public void verifyElementEnableTest() {
		// verify page title
		Assert.assertEquals(driver.getTitle(), "jQuery UI");
		
		//click on spinner
		driver.findElement(By.linkText("Spinner")).click();
		Assert.assertEquals(driver.getTitle(), "Spinner | jQuery UI");
		
		//verify element enabled and disabled
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement textField = driver.findElement(By.id("spinner"));
		WebElement disableBtn = driver.findElement(By.id("disable"));
		
		Assert.assertTrue(textField.isEnabled());
		System.out.println("Element Status : "+textField.isEnabled());
		
		disableBtn.click();
		Assert.assertFalse(textField.isEnabled());
		System.out.println("Element Status after first click : "+textField.isEnabled());
		
		disableBtn.click();
		Assert.assertTrue(textField.isEnabled());
		System.out.println("Element Status after second click : "+textField.isEnabled());
	}
	
	@Test
	public void verifyElementDisplayedTest() {
		// verify page title
		Assert.assertEquals(driver.getTitle(), "jQuery UI");

		driver.findElement(By.linkText("Show")).click();

		Assert.assertEquals(driver.getTitle(), "Show | jQuery UI");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement element = driver.findElement(By.xpath("//div[@id='effect']/h3"));

		Assert.assertFalse(element.isDisplayed());
		System.out.println("Element initial state : " + element.isDisplayed());

		driver.findElement(By.xpath("//*[@id=\"button\"]")).click();

		Assert.assertTrue(element.isDisplayed());
		System.out.println("Element initial state : " + element.isDisplayed());

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://jqueryui.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
