package SeleniumScenario1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleiFrames {

	public WebDriver driver = null;

	@Test
	public void handleiFramesDemo() throws InterruptedException {
		// verify page title
		Assert.assertEquals(driver.getTitle(), "jQuery UI");

		// navigate to radio button and verify title
		driver.findElement(By.linkText("Checkboxradio")).click();
		Assert.assertEquals(driver.getTitle(), "Checkboxradio | jQuery UI");

		// verify the heading
		Assert.assertEquals(driver.findElement(By.className("entry-title")).getText(), "Checkboxradio");

//		switching to frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// locate radio button in the frame and click it
		List<WebElement> radioBtns = driver
				.findElements(By.xpath("//span[contains(@class,'ui-checkboxradio-icon ui-corner-all')]"));
//		radioBtns.get(1).click();
		for (WebElement clickall : radioBtns) {
			clickall.click();
		}

		// switch back to webpage
		driver.switchTo().parentFrame();

		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(5000);

//		System.out.println(radioBtns.size());
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
