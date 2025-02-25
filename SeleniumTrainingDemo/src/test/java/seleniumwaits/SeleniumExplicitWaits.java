package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumExplicitWaits {
	
	public WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\motap\\git\\selenium-demo\\SeleniumTrainingDemo\\ExplicitWait.html");
	}
	
	@AfterMethod
	public void finish() {
		driver.quit();
	}
	
	@Test
	public void verifyAlert() {
		WebElement alertBtn = driver.findElement(By.id("alert"));
		alertBtn.click();
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Accept the alert
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void verifyTextPresent() {
		WebElement txtBtn = driver.findElement(By.id("populate-text"));
		txtBtn.click();
		
		WebElement targetTxt = driver.findElement(By.className("target-text"));
		
		System.out.println(targetTxt.getText());
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.textToBePresentInElement(targetTxt, "Selenium Webdriver"));
		
		System.out.println(targetTxt.getText());
	}
	
	@Test
	public void verifyButtonDisplay() {
		WebElement buttonDisplay = driver.findElement(By.id("display-other-button"));
		buttonDisplay.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("hidden"))));
	}
	
	@Test
	public void verifyButtonEnable() {
		WebElement buttonEnable = driver.findElement(By.id("enable-button"));
		buttonEnable.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("disable"))));
	}
	
	@Test
	public void verifyCheckbox() {
		WebElement enableCheckBox = driver.findElement(By.id("checkbox"));
		enableCheckBox.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("ch"))));
	}
}
