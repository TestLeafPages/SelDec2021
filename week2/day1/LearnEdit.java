package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	
	public static void main(String[] args) {
		
		// setup driver
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("Haja@testleaf.com");
		
		// Get text from input field
		String emailValue = email.getAttribute("value");
		System.out.println(emailValue);
		
		// Clear Text
		email.clear();
		
		// Append Text and perform tab
		email.sendKeys("Haja", Keys.TAB);
		
		String text = email.getText();
		
		
	}
}
