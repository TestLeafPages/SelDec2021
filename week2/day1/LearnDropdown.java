package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();
		
		// Locate the ele with select tag
		WebElement dd = driver.findElement(By.id("dropdown1"));
		
		// Create Object for Select class
		Select dropdown = new Select(dd);
		
		// Choose the option
		// Select using text
	//	dropdown.selectByVisibleText("Appium");
		
		// Select using value
		dropdown.selectByValue("3");
		
		// Select using Index
		dropdown.selectByIndex(1);
		
		// Get First option from dropdown
		List<WebElement> options = dropdown.getOptions();
		options.get(0).getText();
		
		// Select second last option from dropdown
		int size = dropdown.getOptions().size();
		dropdown.selectByIndex(size-2);
		
		// NoSuchElementException
		
		WebElement selectedElement = dropdown.getFirstSelectedOption();
	}
}
