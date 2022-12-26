package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L13_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//1. Send Keys
		/**driver.get("http://www.google.com");
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);*/
		
		
		//2.KeyDown
		/**driver.get("http://www.google.com");
		driver.findElement(By.id("L2AGLb")).click();
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();*/
		
		
		//3.Keyup
		driver.get("http://www.google.com");
		driver.findElement(By.id("L2AGLb")).click();
		Actions actions = new Actions(driver);
		WebElement searchBox = driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT).sendKeys(searchBox, "selenium")
		.keyUp(Keys.SHIFT).sendKeys("test").perform();
		
		searchBox.clear();
		
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
