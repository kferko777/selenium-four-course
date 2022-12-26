package test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L8_Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//this is Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));*/
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("selenium dev" + Keys.ENTER);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Selenium.dev")));
		myLink.click();
		
		//Fluent Wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		          .withTimeout(Duration.ofSeconds(10)) 
		          .pollingEvery(Duration.ofSeconds(1)) 
		          .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
