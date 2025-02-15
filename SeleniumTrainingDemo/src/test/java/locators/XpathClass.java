package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathClass {

	@Test
	public void XpathTest() throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".f12")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@id='login1'])[1]")).sendKeys("ASsdff");
		Thread.sleep(2000);
		
		driver.quit();

	}
}