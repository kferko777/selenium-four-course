package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L7_Elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("L2AGLb")).click();
		
		//Elements
		//find by Name
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		/*WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ABCD", Keys.ENTER);*/
		
		/*driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		
		for(WebElement element : options) {
			System.out.println(element.getText());
		}*/
		
		//find By CssSelector
		//driver.findElement(By.cssSelector("#fname")).sendKeys("Io");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement loginButton = driver.findElement(By.name("input[name='username']"));
		
		driver.findElement(RelativeLocator.with(By.cssSelector("input[name='password']")).above(loginButton)).sendKeys("Test");
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
