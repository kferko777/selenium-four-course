package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L10_Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Accept alert
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"));
		System.out.println("You successfully clicked an alert");
		System.out.println("=================================");
		
		//dismiss alert
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		if(driver.getPageSource().contains("You clicked: Cancel"));
		System.out.println("You clicked: Cancel");
		System.out.println("=================================");
		
		//jsPrompt
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Test completed!!!");
		alert3.accept();
		
		Thread.sleep(2000);
		if(driver.getPageSource().contains("You clicked: Prompt"));
		System.out.println("You clicked: Prompt");
		System.out.println("=================================");
		
		
		driver.close();
		driver.quit();
		
		

	}

}
