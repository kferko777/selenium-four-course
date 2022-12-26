package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L4_ManageWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		driver.manage().window().setSize(new Dimension(800,600));
		driver.manage().window().getPosition();
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.manage().window().setPosition(new Point(500,100));
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
		
		
		

	}

}
