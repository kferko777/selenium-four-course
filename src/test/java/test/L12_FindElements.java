package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L12_FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//1.Find elements
		/**driver.get("https://www.google.com/");
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
		driver.quit();*/
		
		
		//3.Find element from element
		/*driver.get("http://www.google.com");
		WebElement searchForm1 = driver.findElement(By.tagName("form"));
		WebElement searchBox1 = searchForm1.findElement(By.name("q"));
		searchBox1.sendKeys("selenium");
		driver.close();*/

		//4.How to get an active element
		//driver.navigate().refresh();
		/**driver.get("http://www.google.com");
		WebElement searchForm2 = driver.findElement(By.tagName("form"));
		WebElement searchBox2 = searchForm2.findElement(By.name("q"));
		searchBox2.sendKeys("yahoo", Keys.ENTER);

		WebElement elem = driver.findElement(By.xpath("//h3[contains(text(),'Yahoo | Mail, Weather, Search, Politics, News, Fin')]"));

		Actions act = new Actions(driver);	
		act.doubleClick(elem).build().perform();
		driver.findElement(By.cssSelector("button[name='agree']")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("p")).sendKeys("webElement", Keys.ENTER);
		// Get attribute of current active element
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr);*/

		//5.Find element from element
		/*driver.get("http://www.google.com");
		driver.findElement(By.id("L2AGLb")).click();

		WebElement searchBox3 = driver.findElement(By.tagName("q"));
		String tagName = searchBox3.getTagName();
		String text = searchBox3.getText();
		String cssValue = searchBox3.getCssValue("font");
		System.out.println(tagName+" | "+text+" | "+cssValue);
		
		driver.close();*/
		
		//6.How to check element is Enabled | is Selected:
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		driver.close();
	

	}

}
