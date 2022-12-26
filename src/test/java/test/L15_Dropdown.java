package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L15_Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://trytestingthis.netlify.app/");

		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);

		//1.Select one by one 
		/**selectObject.selectByIndex(1);
		selectObject.selectByValue("option 2");
		selectObject.selectByVisibleText("Option 3");*/

		//2.Select by storing dropdown options in a list

		List<WebElement> allAvailableOptions = selectObject.getOptions();

		//List<WebElement>  options = driver.findElements(By.id("option"));

		// - Create a LOOP to access all options
		for(WebElement option : allAvailableOptions) {
			System.out.println(option.getText()); 
			if(option.getText().equalsIgnoreCase("option2"))
				option.click();

		}


		driver.quit();
		System.out.println("Test completed!!!");


	}

}
