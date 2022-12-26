package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L12_FindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//1.Find elements
		driver.get("https://www.google.com/");
		driver.findElement(By.id("L2AGLb")).click();

		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("selenium");

		//2. Get all the elements available with tag name 'select'
		driver.navigate().to("https://trytestingthis.netlify.app/");

		List<WebElement> elements = driver.findElements(By.tagName("select"));

		for (WebElement element : elements) {
			System.out.println("Paragraph text:" + element.getText());
		}
		driver.close();

	}

}
