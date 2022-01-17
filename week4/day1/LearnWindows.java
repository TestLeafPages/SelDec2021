package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		// set up the driver
		WebDriverManager.chromedriver().setup();

		// Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://www.leafground.com/pages/Window.html");

		driver.manage().window().maximize();
		
		// Click on Home
		driver.findElement(By.id("home")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String parentWindow = driver.getWindowHandle();
	//	System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		/*
		 * for (String window : windowHandles) { System.out.println(window); }
		 */
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		String childWindow = windows.get(1);
		System.out.println(childWindow);
		
		// Switch to Window
		
		driver.switchTo().window(childWindow);
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	//	driver.close();
	//	driver.quit();
		
		
		driver.switchTo().window(windows.get(0));
		WebElement header = driver.findElement(By.tagName("h1")); // ->NoSuchWindowException
		System.out.println(header.getText());
		
		driver.switchTo().window(windows.get(1));
		
	}
}
