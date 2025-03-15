package SeleniumScenario2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DropDownsDemo {

	public WebDriver driver = null;

	@Test
	public void useDropdownTest() throws InterruptedException {
//		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select dropdown = new Select(monthDropDown);
		Thread.sleep(5000);
		
		dropdown.selectByIndex(5);
		Thread.sleep(2000);
		
		dropdown.selectByValue("11");
		Thread.sleep(2000);
		
		dropdown.selectByVisibleText("Aug");
		Thread.sleep(4000);
		
		List<WebElement> allOptions = dropdown.getOptions();
		for (WebElement option : allOptions) {
			option.click();
			System.out.println("Selected Option = "+option.getText());
			Thread.sleep(2000);
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
