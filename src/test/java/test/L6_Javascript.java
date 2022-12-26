package test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L6_Javascript {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C://Eclispse-Projects//drivers//chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Get return value from script
		WebElement button =driver.findElement(By.name("btnI"));
		String text = (String) js.executeScript("return arguments[0].innerText", button);

		//JavaScript to click element
		js.executeScript("arguments[0].click();", button);

		//Execute JS directly
		js.executeScript("console.log('hello world')");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
