package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsDemo {

	/*
	 * Test Case- verify rediff sign in functionality 1. Open Rediff mail 2. Verify
	 * page title 3. Click on Sign In 4. Verify Page title 5. enter username and
	 * password 6. click sign in button 7. verify page title
	 */
	
	@Test
	public void verifyRediffSignIn() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		Step1
		driver.get("https://www.rediff.com/");

//		Step2
		Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");

//		Step3
		driver.findElement(By.linkText("Sign in")).click();

//		Step4
		Assert.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access");

//		Step5
		driver.findElement(By.id("login1")).sendKeys("motaparth@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		Thread.sleep(3000);

//		Step6
		driver.findElement(By.name("proceed")).click();

//		Step7
		Assert.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access");
		Thread.sleep(4000);
		
		
		driver.quit();
	}
}
